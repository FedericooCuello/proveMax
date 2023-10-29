
package provemax_main;

import accesoADatos.Conexion;
import accesoADatos.ProductoData;
import entidades.Producto;
import entidades.Proveedor;
import java.sql.Connection;

public class ProveMax {

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
      //-Prueva del metodo registrar producto- 
//        Producto p2 = new Producto("Fanta","Gaseosa",950,600,true);
//        ProductoData pd = new ProductoData();
//        pd.regristrarProducto(p2);
       //-Prueva del metodo ComprarAProveedores-
       Proveedor cocaAndina = new Proveedor("CocacolaAndina","España 223","2664223344");
       
    }
    
}
