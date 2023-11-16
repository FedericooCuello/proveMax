  
package vista;
 
import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import entidades.DetalleCompra;
import accesoADatos.ProductoData;
import accesoADatos.ProveedorData;
import entidades.Compra; 
import entidades.Producto;
import entidades.Proveedor;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioAltaCompra extends javax.swing.JInternalFrame {

    /**
     *  
     */
    
    private CompraData compraData = new CompraData();
    private Compra compraActual = null;
    private DetalleCompra detCompra ;
    private ProveedorData provData;
    private ProductoData prodData;
    private List <Proveedor> listaProveedor;
    private List <Producto> listaProducto; 
    private List <DetalleCompra> listaDetalleCompras=null; 
    private List <Compra> listaCompras=null; 
    private DetalleCompraData detalleCompraData;
    private DefaultTableModel modeloTabla;
      
    public FormularioAltaCompra() {
        initComponents();
        provData = new ProveedorData();
        prodData=new ProductoData();
        detalleCompraData = new DetalleCompraData();
        listaProveedor =provData.listarProveedores();
        listaProducto=prodData.listaProductos();
        cargarProveedores();
        cargarProductos();
        armarCabecera();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Materiattulo = new javax.swing.JLabel();
        jLabel_codigoMat = new javax.swing.JLabel();
        jTextField_cod = new javax.swing.JTextField();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_cant = new javax.swing.JTextField();
        jLabel_razonSocial = new javax.swing.JLabel();
        jTextField_precio = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jCheckBox_Activo = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_nuevo2 = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jLabel_domicilio = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cBoxProducto = new javax.swing.JComboBox<>();
        jcBoxProveedor = new javax.swing.JComboBox<>();
        jLabel_fecha1 = new javax.swing.JLabel();
        jButton_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Compras");
        setToolTipText("");

        jLabel_Materiattulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Materiattulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/compras (1).png"))); // NOI18N
        jLabel_Materiattulo.setText(" Compra");

        jLabel_codigoMat.setText("Código: ");

        jLabel_nombre.setText("Cantidad:");

        jTextField_cant.setText(" ");
        jTextField_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cantActionPerformed(evt);
            }
        });

        jLabel_razonSocial.setText("Precio:");

        jTextField_precio.setText(" ");
        jTextField_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precioActionPerformed(evt);
            }
        });

        jLabel_estado.setText("Activo:");

        jCheckBox_Activo.setSelected(true);
        jCheckBox_Activo.setText("Si");
        jCheckBox_Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ActivoActionPerformed(evt);
            }
        });

        jButton_nuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mas.png"))); // NOI18N
        jButton_nuevo2.setText("Nuevo");
        jButton_nuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevo2ActionPerformed(evt);
            }
        });

        jButton_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar-el-archivo.png"))); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        jButton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });

        jLabel_domicilio.setText("Producto:");

        jLabel_fecha.setText("Fecha de compra: ");

        cBoxProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jcBoxProveedor.setToolTipText("");

        jLabel_fecha1.setText("Proveedor:");

        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrador.png"))); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_domicilio)
                            .addComponent(jLabel_razonSocial)
                            .addComponent(jLabel_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_codigoMat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_estado)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_fecha)
                        .addGap(66, 66, 66)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(jLabel_Materiattulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel_fecha1)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox_Activo))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_Materiattulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigoMat)
                    .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_razonSocial)
                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_domicilio)
                    .addComponent(cBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_fecha)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_fecha1)
                    .addComponent(jcBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_estado)
                    .addComponent(jCheckBox_Activo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevo2ActionPerformed
        // TODO add your handling code here:
        limpiarCamposPantalla();
        compraActual = null;
    }//GEN-LAST:event_jButton_nuevo2ActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
 
       try {
        // Validación de Campos
        Integer cantidad = Integer.parseInt(jTextField_cant.getText().trim());
        Double precio = Double.parseDouble(jTextField_precio.getText().trim());

        // Obtener otros valores necesarios
        Proveedor proveedor = (Proveedor) jcBoxProveedor.getSelectedItem();
        Producto producto = (Producto) cBoxProducto.getSelectedItem();
        LocalDate fechaCompra = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = jCheckBox_Activo.isSelected();

        // Guardar o Modificar la Compra
        if (compraActual == null) {
            compraActual = new Compra(proveedor, fechaCompra, estado);
        } else {
            compraActual.setProvedor(proveedor);
            compraActual.setFecha(fechaCompra);
            compraActual.setEstado(estado);
            compraData.modificarCompra(compraActual);
        }

        // Guardar o Modificar el Detalle de la Compra
        if (detCompra == null) {
            detCompra = new DetalleCompra(cantidad, precio, compraActual, producto, estado);
        } else {
            detCompra.setCantidad(cantidad);
            detCompra.setPrecioCosto(precio);
            detCompra.setCompra(compraActual);
            detCompra.setProducto(producto);
            detCompra.setEstado(estado);
            detalleCompraData.modificarDetalleCompra(detCompra);
        }

        // Mensaje de Éxito
        JOptionPane.showMessageDialog(this, "Detalles de compras guardados correctamente");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Datos incorrectos, reintente nuevamente");
        e.printStackTrace();
        limpiarCamposPantalla();
    }



    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        // TODO add your handling code here:
        //se llama al metodo simplemente
        dispose();
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jCheckBox_ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ActivoActionPerformed

    private void jTextField_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precioActionPerformed

    private void jTextField_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cantActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

        if (compraActual!=null) {
            ///---------------------------------------Necesario eliminar en ambas tablas y tablas anexadas?
            compraData.eliminarCompra(compraActual.getIdCompra());
            // compraData.eliminarCompra(compraActual.getIdProvedor() );
            compraActual=null;
            limpiarCamposPantalla();
            JOptionPane.showMessageDialog(this, "Compra eliminado");
        } else  {
            JOptionPane.showMessageDialog(this, "No hay una compra seleccionado");
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:

        try {
            Integer cod = Integer.parseInt(jTextField_cod.getText());
            compraActual = compraData.buscarCompra(cod);

            if (compraActual != null) {
                int codCompra = compraActual.getIdCompra();
                detCompra = detalleCompraData.buscarDetalleCompra(codCompra);

                if (detCompra != null) {
                    Producto auxProducto = detCompra.getProducto();
                    modeloTabla.addRow(new Object[]{
                        auxProducto.getIdProducto(),
                        detCompra.getCantidad(),
                        detCompra.getPrecioCosto(),
                        compraActual.getFecha(),
                        compraActual.getProveedor()
                    });
                } else {
                    JOptionPane.showMessageDialog(this, "No existe detalle de compra para el código ingresado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe compra para el código ingresado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un código válido");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //        try {
        //         materiaActual= materiaData.buscarMateria(Integer.parseInt(jTextField_codMateria.getText()));
        //
        //            if (materiaActual!=null) {
        //                jTextField_nombreMateria.setText(materiaActual.getNombre());
        //                jTextField_anioMateria1.setText( Integer.toString (materiaActual.getAnioMateria() ) );
        //                jCheckBox_Activo.setSelected(materiaActual.isActivo());
        //            } else {
        //                 JOptionPane.showMessageDialog(this, "código ingresado no corresponde a una materia registrada");
                //                 limpiarCamposPantalla();
                //            }
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(this, "Datos incorrectos, reintente nuevamente");
            //            e.printStackTrace();
            //            limpiarCamposPantalla();
            //        }

    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void armarCabecera() {
    if (modeloTabla == null) {
            modeloTabla = new DefaultTableModel();
        }

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Id producto");
        filaCabecera.add("Cantidad");
        filaCabecera.add("Precio");
        filaCabecera.add("Fecha de compra");
        filaCabecera.add("Proveedor");

        for (Object aux : filaCabecera) {
            modeloTabla.addColumn(aux);
        }

        jTable1.setModel(modeloTabla);
    }

    private void cargarCompras() {
//        for (Compras  : compr.verBomberos()) {
        for (Compra aux : listaCompras) {
            for (DetalleCompra det : listaDetalleCompras) {
                for (Producto p : listaProducto) {

                    modeloTabla.addRow(new Object[]{
                        det.getProducto(),
                        det.getCantidad(),
           det.getPrecioCosto(),
           p.getNombreProducto(),
           aux.getFecha(),
           aux.getProveedor()
       });
            
        } 
    }
}}
         

    private void limpiarCamposPantalla() {
        jTextField_cant.setText("");
        jTextField_cod.setText("");
        jTextField_precio.setText("");
        jCheckBox_Activo.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Producto> cBoxProducto;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_buscarMateria;
    private javax.swing.JButton jButton_buscarMateria1;
    private javax.swing.JButton jButton_buscarMateria2;
    private javax.swing.JButton jButton_buscarMateria3;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_nuevo2;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JCheckBox jCheckBox_Activo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel_Materiattulo;
    private javax.swing.JLabel jLabel_codigoMat;
    private javax.swing.JLabel jLabel_domicilio;
    private javax.swing.JLabel jLabel_estado;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fecha1;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_razonSocial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_cant;
    private javax.swing.JTextField jTextField_cod;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JComboBox<Proveedor> jcBoxProveedor;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores() {
        Proveedor vacio=new Proveedor();
        vacio.setNombre("Lista de Proveedores");
        vacio.setRazonSocial("Razon Social");
        vacio.setIdProvedor(0);
        jcBoxProveedor.addItem(vacio);
        for (Proveedor proveedor : listaProveedor) {
           jcBoxProveedor.addItem(proveedor);
        }
    }

    private void cargarProductos() {
        Producto vacio=new Producto();
        vacio.setNombreProducto("Lista de Productos");
        vacio.setDescripcion("Descripcion");
        vacio.setIdProducto(0);
        cBoxProducto.addItem(vacio);
        for (Producto producto : listaProducto) {
            cBoxProducto.addItem(producto);
        }
    }
}
