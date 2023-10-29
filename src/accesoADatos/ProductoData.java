
package accesoADatos;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProductoData {
    private Connection con= null;
    
public ProductoData(){
    con = Conexion.getConexion();
}
    public void regristrarProducto(Producto producto) {

        try {
            String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock, estado)" + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcio());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4,producto.getStock()) ;
            ps.setBoolean(5, producto.isEstado());  
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

    }

