
package accesoADatos;

import entidades.Compra;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CompraData {
    private Connection con= null;
    private ProveedorData prData=new ProveedorData();
   
    public CompraData(){
        con = Conexion.getConexion();
    }
    
    public int compraAProveedores(Compra compra){
        int clave=0;
        try{
        String sql = "INSERT INTO compra (idProveedor,fecha,estado) " + "VALUES (?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,compra.getProveedor().getIdProvedor());
            ps.setDate(2,Date.valueOf(compra.getFecha()));
            ps.setBoolean(3,compra.isEstado());
            
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Compra añadida con exito.");
            }
            clave=rs.getInt(1);
            
            ps.close();
            return clave;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a compra" + ex.getMessage());

            
            }
        return clave;
    }
    public void  modificarCompra(Compra compra){
        String sql = "UPDATE compra SET proveedor = ?, fecha = ?" + "WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,compra.getProveedor().getIdProvedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            int qe = ps.executeUpdate();
            if (qe==1){
                JOptionPane.showMessageDialog(null, "Se modificaron los cambios con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra" + ex.getMessage());
        }
    
    }
    public void eliminarCompra(int idcompra){
      String sql = "UPDATE compra SET estado = 0" + "WHERE idCompra = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idcompra);
            int e = ps.executeUpdate();
            if(e==1){
                JOptionPane.showMessageDialog(null, "Se elimino la compra con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra" + ex.getMessage());
        }
      
    }
    public Compra buscarCompra(int idCompra){
        String sql ="SELECT idProveedor,fecha FROM compra WHERE idCompra = ? AND estado = 1 ";
        Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCompra);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                compra = new Compra();
                compra.setIdCompra(idCompra);
                compra.setProvedor(prData.buscarProveedor(rs.getInt("idProveedor")));
                compra.setFecha(rs.getDate("fecha").toLocalDate());
                compra.setEstado(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra" + ex.getMessage());
        }
        
        return compra;
    }
    
    
    
    
    
    
    
}
