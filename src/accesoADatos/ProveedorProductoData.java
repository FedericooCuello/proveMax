
package accesoADatos;

import entidades.Compra;
import entidades.Producto;
import entidades.Proveedor;
import entidades.ProveedorProducto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProveedorProductoData {
    private Connection con= null;
    
    public ProveedorProductoData(){
        con = Conexion.getConexion();
    }
    
    public int compraAProveedores(ProveedorProducto proveedorProducto){
        int clave=0;
        try{
        String sql = "INSERT INTO proveedroproducto(idProveedor,idProducto,estado) " + "VALUES (?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,proveedorProducto.getProveedror().getIdProvedor());
            ps.setInt(2,proveedorProducto.getProducto().getIdProducto());
            ps.setBoolean(3, true);
            
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedorProducto.setIdProveedorProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido a Proveedor con exito.");
            }
            clave=rs.getInt(1);
       
            ps.close();
            return clave;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Proveedro/Producto" + ex.getMessage());

            
            }
        return clave;
    }
    
    public void  modificarProvProd(ProveedorProducto proProd){
        String sql = "UPDATE proveedorproducto SET idProveedor=?, idProducto=? = ? WHERE idProveedorCompra=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,proProd.getProveedror().getIdProvedor());
            ps.setInt(2,proProd.getProducto().getIdProducto());
            ps.setInt(3,proProd.getIdProveedorProducto());
            int qe = ps.executeUpdate();
            if (qe==1){
                JOptionPane.showMessageDialog(null, "Se modificaron los cambios con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor/Producto" + ex.getMessage());
        }
    
    }
    
    public void eliminarCompra(int idProProd){
      String sql = "UPDATE proveedorproducto SET estado = 0" + "WHERE idProveedorProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idProProd);
            int e = ps.executeUpdate();
            if(e==1){
                JOptionPane.showMessageDialog(null, "Se elimino Productos del Proveedor con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor/Producto" + ex.getMessage());
        }
      
    }
    
    public List<Producto> buscarProductosProveedor(int idProveedor){
        String sql ="SELECT idProducto FROM ProveedorProducto WHERE idProveedor = ? AND estado = 1 ";
        Producto producto = null;
        ProductoData pd=new ProductoData();
        List<Producto> listaProductos=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idProveedor);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto=pd.buscarProducto(rs.getInt("idProducto"));
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor /Productos" + ex.getMessage());
        }
   
        return listaProductos;
    }

    public List<Proveedor> buscarProveedoresPorProducto(int idProducto) {
        String sql = "SELECT idProveedor FROM ProveedorProducto WHERE idProducto = ? AND estado = 1";
        List<Proveedor> listaProveedores = new ArrayList<>();
        Proveedor prov = null;
        ProveedorData provd = new ProveedorData();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                prov = new Proveedor();
                prov = provd.buscarProveedor(rs.getInt("idProveedor"));
                listaProveedores.add(prov);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor/Productos" + ex.getMessage());
        }

        return listaProveedores;
    }


}
