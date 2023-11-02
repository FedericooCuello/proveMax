package accesoADatos;

import java.sql.*;
import entidades.*;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    private Connection con= null;
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
}
