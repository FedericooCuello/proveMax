
package provemax_main;

import accesoADatos.CompraData;
import accesoADatos.Conexion;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.Compra;
import entidades.Producto;
import entidades.Proveedor;
import java.sql.Connection;
import java.time.LocalDate;

public class ProveMax {

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
      //-Prueva del metodo registrar producto <-------------- 
//        Producto p2 = new Producto("Fanta","Gaseosa",950,600,true);
//        ProductoData pd = new ProductoData();
//        pd.regristrarProducto(p2);
       //-Prueva del metodo registrar proveedores  <------------
       Proveedor cocaAndina = new Proveedor("CocacolaAndina","España 223","2664223344");
       //ProveedorData prod = new ProveedorData();
       //prod.regristrarProveedor(cocaAndina);
       //-Prueva del metodo compraAProveedores <--------
       Compra compra2 = new Compra(cocaAndina,LocalDate.of(2024,05,03));
       CompraData comp = new CompraData();
       comp.compraAProveedores(cocaAndina, compra2);
       
       
    }
    
}
