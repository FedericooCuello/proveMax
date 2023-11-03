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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }

    public void regristrarProveedor(Proveedor proveedor) {

        try {
            String sql = "INSERT INTO proveedor (nombre, razonSocial, domicilio, telefono, estado)" + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getTelefono());
            ps.setBoolean(5, true);
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
    
    public void modificarDatosProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET nombre=?, razonSocial=?, domicilio=?, telefono=?, estado=? WHERE idProveedor=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getRazonSocial());
            ps.setString(3, proveedor.getDomicilio());
            ps.setString(4, proveedor.getTelefono());
            ps.setBoolean(5, proveedor.isEstado());
            ps.setInt(6, proveedor.getIdProvedor());

            int queryExitosa = ps.executeUpdate();

            if (queryExitosa == 1) {
                JOptionPane.showMessageDialog(null, "Datos de proveedor modificados con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se realizaron modificaciones en la base de datos");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla proveedor");
            ex.printStackTrace();
        }
    }
    
    public void eliminarProveedor (int idProveedor) {
        String sql = "UPDATE proveedor SET estado = 0 "
                + " WHERE idProveedor =? ";
        try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idProveedor );
            int queryExitosa = ps.executeUpdate();
             if (queryExitosa>0) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado " );
            } else {
                 JOptionPane.showMessageDialog(null, "El proveedor no fue eliminado" );
             }
        } catch (Exception e) {

        }
    }

    public Proveedor buscarProveedor(int idProveedor) {
        String sql = "SELECT * FROM proveedor WHERE idProveedor = ? AND estado = 1";
        Proveedor proveedor = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setNombre(rs.getString(1));
                proveedor.setRazonSocial(rs.getString(2));
                proveedor.setDomicilio(rs.getString(3));
                proveedor.setTelefono(rs.getString(4));
            } else {
                JOptionPane.showMessageDialog(null, "El proveedor no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla proveedor: " + ex.getMessage());
            ex.printStackTrace();
        }

        return proveedor;
    }
    
    
    
    
    public List<Proveedor> listarProveedores() {
        String sql = "SELECT * FROM proveedor WHERE estado = 1";
        List<Proveedor> proveedoresLista = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProvedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setNombre(rs.getString("nombre"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(true);
                proveedoresLista.add(proveedor);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla proveedor " + ex.getMessage());
        }
        return proveedoresLista;
    }
}


