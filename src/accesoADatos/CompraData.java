
package accesoADatos;

import entidades.Compra;
import entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CompraData {
    private Connection con= null;
    public CompraData(){
        con = Conexion.getConexion();
    }
    private void compraAProveedores(Proveedor proveedor, Compra compra){
        try{
        String sql = "INSERT INTO compra (idProveedor,fecha)" + "VALUES (?, ?)";
       PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proveedor.getIdProvedor());
            ps.setDate(2,Date.valueOf(compra.getFecha()));
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

            
            }
    }
}
