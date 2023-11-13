package accesoADatos;

import java.sql.*;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    
    private Connection con= null;
    private ProductoData pd=null;
    private CompraData cd=null;
    private ProveedorData pr=null;
    
    public DetalleCompraData(){
        con = Conexion.getConexion();
    }
    public void registrarDetalleCompra(DetalleCompra detalleCompra){
        try {
            String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto,estado)" + "VALUES (?, ?, ?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3,detalleCompra.getCompra().getIdCompra());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.setBoolean(5,detalleCompra.isEstado());
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalleCompra.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle de compra añadida con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar un detalle de compra" + ex.getMessage());

            
            }
    }
    
    public void modificarDetalleCompra(DetalleCompra detalleCompra){
        try{
            String sql="UPDATE detallecompra SET cantidad=?,precioCosto=?,idCompra=?, idProducto=? "
                    + "WHERE idDetalleCompra=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2,detalleCompra.getPrecioCosto());
            ps.setInt(3,detalleCompra.getCompra().getIdCompra());
            ps.setInt(4,detalleCompra.getProducto().getIdProducto());
            ps.setInt(5,detalleCompra.getIdDetalle());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Detalle de compra actualizada");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle de compra" + ex.getMessage());
        }
    }
    
    public void eliminarDetalleCompra(int id){
        String sql="UPDATE detallecompra SET estado=0 WHERE idDetalle=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Detalle de compra borrada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla detalle de producto "+ex.getMessage());
        }
    }
    
    
    public DetalleCompra buscarDetalleCompra(int id){
        String sql="SELECT cantidad,precioCosto,idCompra,idProducto FROM detalleCompra WHERE idDetalle=? AND estado=1";
        DetalleCompra detalle=null;
        cd=new CompraData();
        pd=new ProductoData();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                detalle=new DetalleCompra();
                detalle.setIdDetalle(id);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                Compra c1=cd.buscarCompra(rs.getInt("idCompra"));
                Producto p1=pd.buscarProducto(rs.getInt("idProducto"));
                detalle.setProducto(p1);
                detalle.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null,"No existe el detalle de compra");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla detalle de compra "+ex.getMessage());
        }
        return detalle;
    }
    
    public List<DetalleCompra> listarDetallesCompra(int idCompra){
        DetalleCompra detalle=null;
        List<DetalleCompra> compras=new ArrayList<>();
        cd=new CompraData();
        pd=new ProductoData();
        String sql="SELECT * FROM detallecompra WHERE idCompra=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCompra);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                detalle = new DetalleCompra();
                detalle.setIdDetalle(rs.getInt("idDetalle"));
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioCosto(rs.getDouble("precioCosto"));
                detalle.setCompra(cd.buscarCompra(rs.getInt("idCompra")));
                detalle.setProducto(pd.buscarProducto(rs.getInt("idProducto")));
                detalle.setEstado(true);
                compras.add(detalle);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle de compra" + ex.getMessage());
        }
        
        return compras;
    }
    
    
    public List<DetalleCompra> buscarComprasProveedor(int idProveedor,Date d1,Date d2){
        List<DetalleCompra> compras=new ArrayList<>();
        cd=new CompraData();
        pd=new ProductoData();
        String sql="SELECT * "
                + "FROM detallecompra dc JOIN producto p ON (dc.idProducto=p.idProducto) JOIN compra c ON (dc.idCompra=c.idCompra) "
                + "JOIN proveedor pr ON (c.idProveedor=pr.idProveedor) "
                + "WHERE pr.idProveedor=? AND c.fecha BETWEEN ? AND ?";
        DetalleCompra compra=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idProveedor);
            ps.setDate(2, d1);
            ps.setDate(3, d2);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compra = new DetalleCompra();
                compra.setIdDetalle(rs.getInt("idDetalle"));
                compra.setCantidad(rs.getInt("cantidad"));
                compra.setPrecioCosto(rs.getDouble("precioCosto"));
                compra.setCompra(cd.buscarCompra(rs.getInt("idCompra")));
                compra.setProducto(pd.buscarProducto(rs.getInt("idProducto")));
                compra.setEstado(true);
                compras.add(compra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle de compra" + ex.getMessage());
        }
        
        return compras;
    }
    
    public List<DetalleCompra> ListarComprasAProveedor(int idProveedor){
        ArrayList<DetalleCompra> comprasAPro = new ArrayList<>();
        cd=new CompraData();
        pd=new ProductoData();
        String sql = "SELECT * "
                + "FROM detallecompra dc JOIN producto p ON (dc.idProducto=p.idProducto) JOIN compra c ON (dc.idCompra=c.idCompra) "
                + "JOIN proveedor pr ON (c.idProveedor=pr.idProveedor) "
                + "WHERE pr.idProveedor=?";
        DetalleCompra compraApro= null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                compraApro = new DetalleCompra();
                compraApro.setIdDetalle(rs.getInt("idDetalle"));
                compraApro.setCantidad(rs.getInt("cantidad"));
                compraApro.setPrecioCosto(rs.getDouble("precioCosto"));
                compraApro.setCompra(cd.buscarCompra(rs.getInt("idCompra")));
                compraApro.setProducto(pd.buscarProducto(rs.getInt("idProducto")));
                compraApro.setEstado(true);
                comprasAPro.add(compraApro);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle de compra" + ex.getMessage());
        }
        
       return comprasAPro; 
    }
    
}
