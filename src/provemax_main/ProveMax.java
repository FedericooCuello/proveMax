
package provemax_main;

import accesoADatos.CompraData;
import accesoADatos.Conexion;
import accesoADatos.DetalleCompraData;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.Compra;
import entidades.DetalleCompra;
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
//       Proveedor cocaAndina = new Proveedor("Distribuidora","CocacolaAndina","España 223","2664223344");
//       ProveedorData prod = new ProveedorData();
//       prod.regristrarProveedor(cocaAndina);
       //-Prueva del metodo registro detalleCompra <--------
//       Producto producto = new Producto(1,"Fanta","Gaseosa",950,600,true);
//       DetalleCompra detalle=new DetalleCompra(2,producto.getPrecioActual(),producto);
//       DetalleCompraData dpData= new DetalleCompraData();
//       dpData.registrarDetalleCompra(detalle);
       
       //-Prueva del metodo compraAProveedores <--------
//       Proveedor cocaAndina = new Proveedor(1,"Distribuidora","CocacolaAndina","España 223","2664223344");
//       Producto producto = new Producto(1,"Fanta","Gaseosa",950,600,true);
//       DetalleCompra detalle=new DetalleCompra(1,2,producto.getPrecioActual(),producto);
//       Compra compra = new Compra(cocaAndina,detalle,LocalDate.of(2024,05,03));
//       CompraData compraData = new CompraData();
//       compraData.compraAProveedores(compra);
       
       
    }
    
}
