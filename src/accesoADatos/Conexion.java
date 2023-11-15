
package accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
 
    
    private final static String url = "jdbc:mariadb://LocalHost/provemax";
    private final static String usuario= "root";
    private final static  String contrasenia = "";
    private static Connection conexion;

    private Conexion() {
    }
     
    
public static Connection getConexion() {
    
    if (conexion == null) {
        try {
            // Cargar el driver MariaDB.
            // Establecer la conexión a la base de datos previamente creada.
            Class.forName("org.mariadb.jdbc.Driver");
            // se elimino DriverManager que estaba en la izq
            conexion = DriverManager.getConnection(url, usuario, contrasenia);
          //  JOptionPane.showMessageDialog(null, "Conectado a la BD");
            //System.out.println("Conectado a BD");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver de la base de datos");
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL al establecer la conexión");
            ex.printStackTrace();
        }
    }
    return conexion;
}
}
    

