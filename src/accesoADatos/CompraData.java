
package accesoADatos;

import entidades.Compra;

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
    public void compraAProveedores(Compra compra){
        try{
        String sql = "INSERT INTO compra (idProveedor,idDetalle,fecha) " + "VALUES (?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,compra.getProvedor().getIdProvedor());
            ps.setInt(2, compra.getDetalleCompra().getIdDetalle());
            ps.setDate(3,Date.valueOf(compra.getFecha()));
            
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra añadida con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a compra" + ex.getMessage());

            
            }
    }
}
