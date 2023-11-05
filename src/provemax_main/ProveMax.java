
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
import java.util.List;
import javax.swing.JOptionPane;

public class ProveMax {

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
      //-Prueva del metodo registrar producto <-------------- 
//        Producto p2 = new Producto("Fanta","Gaseosa",950,600,true);
//        ProductoData pd = new ProductoData();
//        pd.regristrarProducto(p2);
       //-Prueva del metodo registrar proveedores  <------------
//        Proveedor cocaAndina = new Proveedor("Distribuidora","CocacolaAndina","España 223","2664223344");
//        ProveedorData prod = new ProveedorData();
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
       
      //------------------- Prueba método modificar datos proveedor
//       Proveedor proveedor1 = new Proveedor("Distribuidora de bebidas gaseosas y agua saborizadas", "Coca cola Andina & Hijos ", "España 223", "2665223300", true);
        
       // ProveedorData proveedorData1 = new ProveedorData();
       // proveedorData1.regristrarProveedor(proveedor1);
     //   proveedorData1.modificarDatosProveedor(proveedor1);
        
        //----------------- Prueba método eliminar proveedor (cambio de estado= true/false)
      //  proveedorData1.eliminarProveedor(2);
       // JOptionPane.showMessageDialog(null, "Eliminado: " + proveedor1.getNombre());
        
        
        //---------------- Prueba método buscar proveedores  x id
//           ProveedorData proveedorData1 = new ProveedorData();
//        Proveedor provBuscado = proveedorData1.buscarProveedor(1);
//        if (provBuscado!=null ) {
//             JOptionPane.showMessageDialog(null, "Proveedor: " + proveedor1.getNombre() + " id: " + proveedor1.getIdProvedor() );
//        }
//       
//<<<<<<< Updated upstream
       
      //-Prueva del metodo buscarProducto <-------------------------------------
//      ProductoData pd=new ProductoData();
//      Producto producto=pd.buscarProducto(1);
//      System.out.println("Producto "+producto.getNombreProducto());
      //-Prueva del metodo modificarProducto <----------------------------------
//      producto.setStock(550);
//      pd.modificarProducto(producto);
      //-Prueva del metodo eliminarProducto <-----------------------------------
//      pd.eliminarProducto(1);
       
       
       

        
        //----------prueba método listar proveedores
//        List <Proveedor> proveedorLi = proveedorData1.listarProveedores();
//        System.out.println("Lista de inscripciones: \n");
//                   for (Proveedor aux : proveedorLi) {
//                       System.out.println("Id proveedor: " + proveedor1.getIdProvedor());
//                       System.out.println("Nombre: " + proveedor1.getNombre());
//                       System.out.println("Razon social: " + proveedor1.getRazonSocial());
//                       System.out.println("Telefono: " + proveedor1.getTelefono());
//                       System.out.println("\n");
//                   }  
                   
    //-Prueva del metodo buscarCompra <-----------------------------------------
    CompraData cd=new CompraData();
    Compra compra=cd.buscarCompra(4);
        System.out.println("Compra: "+compra.toString());





    }    
}
