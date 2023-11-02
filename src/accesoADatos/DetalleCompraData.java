package accesoADatos;

import java.sql.*;
import entidades.*;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    private Connection con= null;
    private ProductoData pd=new ProductoData();
    public DetalleCompraData(){
        con = Conexion.getConexion();
    }
    public void registrarDetalleCompra(DetalleCompra detalleCompra){
        try {
            String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idproducto,estado)" + "VALUES (?, ?, ?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getProducto().getIdProducto());
            ps.setBoolean(4,detalleCompra.isEstado());
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
            String sql="UPDATE detallecompra SET cantidad=?,precioCosto=?,idProducto=? "
                    + "WHERE idDetalleCompra=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2,detalleCompra.getPrecioCosto());
            ps.setInt(3,detalleCompra.getProducto().getIdProducto());
            ps.setInt(4,detalleCompra.getIdDetalle());
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
        String sql="SELECT cantidad,precioCosto,idProducto FROM detalleCompra WHERE idDetalle=? AND estado=1";
        DetalleCompra detalle=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                detalle=new DetalleCompra();
                detalle.setIdDetalle(id);
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioCosto(rs.getDouble("precioCosto"));
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
}
