
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
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
// 
       
      //-Prueva del metodo buscarProducto <-------------------------------------
//      ProductoData pd=new ProductoData();
//      Producto producto=pd.buscarProducto(1);
//      System.out.println("Producto "+producto.getNombreProducto());
      //-Prueva del metodo modificarProducto <----------------------------------
//      producto.setStock(550);
//      pd.modificarProducto(producto);
      //-Prueva del metodo eliminarProducto <-----------------------------------
//      pd.eliminarProducto(1);
       
       
       

        
       // ----------prueba método listar proveedores
//          ProveedorData proveedorData1 = new ProveedorData();
//          //Proveedor proveedor1 = new Proveedor("Distribuidora Del Sur ", "Comestibles SRL ", "Sucre 545", "26645777114", true);
//        List <Proveedor> proveedorLi = proveedorData1.listarProveedores();
//        System.out.println("Lista de proveedores: \n");
//                   for (Proveedor aux : proveedorLi) {
//                       System.out.println("Id proveedor: " + aux.getIdProvedor());
//                       System.out.println("Nombre: " + aux.getNombre());
//                       System.out.println("Razon social: " + aux.getRazonSocial());
//                       System.out.println("Telefono: " + aux.getTelefono());
//                       System.out.println("\n");
//                   }  
                   
    //-Prueba del metodo buscarCompra <-----------------------------------------
//    CompraData cd=new CompraData();
//    Compra compra=cd.buscarCompra(4);
//        System.out.println("Compra: "+compra.toString());
//
        
        //-Prueva del metodo buscarComprasProveedor() <-----------------------------------
//        System.out.println("Test");
//      
//        DetalleCompraData dc=new DetalleCompraData();
//        List<DetalleCompra> compras=new ArrayList<>();
//        List<DetalleCompra> compras2=new ArrayList<>();
//        
//        LocalDate lc1=LocalDate.of(2023, 1, 1);
//        LocalDate lc2=LocalDate.of(2023,12,30);
//        
//        compras=dc.buscarComprasProveedor(2,Date.valueOf(lc1),Date.valueOf(lc2));
//        System.out.println("Lista de compras a un Proveedor entre fechas");
//        
//        for(DetalleCompra aux:compras){
//            System.out.println(aux.getProducto().getNombreProducto());
//        }
//        
//        System.out.println("Lista de compras a un Proveedor");
//        
//        compras2=dc.ListarComprasAProveedor(2);
//        for(DetalleCompra aux:compras2){
//            System.out.println(aux.getProducto().getNombreProducto());
//        }
        
        //-Prueva del metodo listarDetallesCompras() <-----------------------------------
        DetalleCompraData dc=new DetalleCompraData();
        List<DetalleCompra> compras=new ArrayList<>();
        compras=dc.listarDetallesCompra(11);
         for(DetalleCompra aux:compras){
            System.out.println(aux.getProducto().getNombreProducto());
        }
         
         
         ProductoData prodData = new ProductoData();
         Producto p1= null;
          //Proveedor proveedor1 = new Proveedor("Distribuidora Del Sur ", "Comestibles SRL ", "Sucre 545", "26645777114", true);
          List <Producto> prodStockMinimo = prodData.listaProductosMin(1);
        System.out.println("Lista de prod minimos: \n");
                   for (Producto aux : prodStockMinimo) {
                       System.out.println(aux.getIdProducto());
                       System.out.println("Nombre: " + aux.getNombreProducto());
                       System.out.println("Razon social: " + aux.getStock());
               
                   }  
        //-----------prueba busqueda por coincidencia de proveedor
        ProveedorData provData = new ProveedorData();
        String proveedorTipeado = "a";
        List<Proveedor> resultado = provData.buscarProveedorPorCoincidencia(proveedorTipeado);
        System.out.println("COincidencia");
        for (Proveedor proveedor : resultado) {
            
            System.out.println(proveedor);
            System.out.println("-");
        }
        
        
                //-----------prueba busqueda por coincidencia de prodcuto
           //   ProductoData prodData = new ProductoData();
        String prodTipeado = "a";
        List<Producto> resultadoProd = prodData.buscarProdPorCoincidencia(prodTipeado);
        System.out.println("COincidencia de prod");
        for (Producto aux : resultadoProd) {
            System.out.println(aux);
            System.out.println("-");
        }

        }
         
         
        
}
