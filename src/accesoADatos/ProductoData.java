
package accesoADatos;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {
    private Connection con= null;
    
public ProductoData(){
    con = Conexion.getConexion();
}
    public void regristrarProducto(Producto producto){

        try {
            String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock,stockMinimo, estado)" + "VALUES (?, ?, ?, ?, ?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4,producto.getStock()) ;
            ps.setInt(5,producto.getStockMinimo());
            ps.setBoolean(6, producto.isEstado());  
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

            
            }
    }
    
    public void modificarProducto(Producto producto){
        try{
            String sql="UPDATE producto SET nombreProducto=?,descripcion=?,precioActual=?,stock=?,stockMinimo=? "
                    + "WHERE idProducto=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3,producto.getPrecioActual());
            ps.setInt(4,producto.getStock());
            ps.setInt(5,producto.getStockMinimo());
            ps.setInt(6,producto.getIdProducto());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Producto actualizado");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
    }
    
    public void eliminarProducto(int id){
        String sql="UPDATE producto SET estado=0 WHERE idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
    }
    

    public List<Producto> buscarProductoLista(int id) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT nombreProducto,descripcion,precioActual,stock, stockMinimo FROM producto WHERE idProducto=? AND estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);

                productos.add(producto);   
            }
            ps.close();

            if (productos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existe el producto con ID: " + id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
        return productos;
    }

    public List<Producto> listaProductosMin(int min) {
        ArrayList<Producto> productos=new ArrayList<>();
        String sql="SELECT idProducto,nombreProducto,descripcion,precioActual,stock,stockMinimo FROM producto "
                + " WHERE stock<=? AND estado=1 "
                + " ORDER BY nombreProducto";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, min);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Producto producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("pecioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);
                productos.add(producto);
            }
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return productos;
    }
    
    public List<Producto> listaProductos(){
        ArrayList<Producto> productos=new ArrayList<>();
        String sql="SELECT idProducto, nombreProducto, descripcion, precioActual, stock, stockMinimo "
                + " FROM producto WHERE estado=1 "
                + "  ORDER BY nombreProducto" ;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Producto producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);
                productos.add(producto);
            }
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return productos;
    }
    
    public List<Producto> buscarProdPorCoincidencia (String productoTipeado) {
         List<Producto> productos = new ArrayList<>();
          String sql="SELECT * FROM producto WHERE nombreProducto LIKE ? "
                + " AND estado=1 ORDER BY nombreProducto";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            //busqueda por coinicdencia parcial
           ps.setString(1, "%" + productoTipeado + "%");
            ResultSet rs=ps.executeQuery(); 
            while(rs.next()){
                Producto producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);
                productos.add(producto);
            }
            ps.close();   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return productos;
    }
    
    
    
        public List<Producto> listaProductosBaja(){
        ArrayList<Producto> productos=new ArrayList<>();
        String sql="SELECT idProducto, nombreProducto, descripcion, precioActual, stock, stockMinimo "
                + " FROM producto WHERE estado=0 ORDER BY nombreProducto";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Producto producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
        return productos;
    }

    
    public List<Producto> productosBajoStock() {
        ArrayList<Producto> productosBajostock = new ArrayList<>();
        String sql = "SELECT * FROM producto p  "
                + " WHERE p.stock < p.stockMinimo "
                + " ORDER BY p.nombreProducto";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto productobs = new Producto();
                productobs.setIdProducto(rs.getInt("idProducto"));
                productobs.setNombreProducto(rs.getString("nombreProducto"));
                productobs.setDescripcion(rs.getString("descripcion"));
                productobs.setPrecioActual(rs.getDouble("precioActual"));
                productobs.setStock(rs.getInt("stock"));
                productobs.setStockMinimo(rs.getInt("stockMinimo"));
                productobs.setEstado(true);
                productosBajostock.add(productobs);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
        }
        return productosBajostock;
    }
    
    public Producto buscarProducto(int id){
        String sql="SELECT nombreProducto,descripcion,precioActual,stock,stockMinimo FROM producto WHERE idProducto=? AND estado=1";
        Producto producto=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                producto=new Producto();
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setStockMinimo(rs.getInt("stockMinimo"));
                producto.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null,"No existe el producto");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return producto;
    }
    
}

