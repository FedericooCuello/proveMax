/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;


import entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ProveedorData {
    private Connection con= null;
    
public ProveedorData(){
    con = Conexion.getConexion();
}
    public void regristrarProveedor(Proveedor proveedor) {

        try {
            String sql = "INSERT INTO producto (razonSocial, domicilio, telefono)" + "VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono()); 
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProvedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar al  proveedor" + ex.getMessage());

            
            }

        }

    }

