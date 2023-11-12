  
package vista;
 
import accesoADatos.CompraData;
import accesoADatos.ProveedorData;
import entidades.Compra; 
import entidades.Producto;
import entidades.Proveedor;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;


public class FormularioAltaCompra extends javax.swing.JInternalFrame {

    /**
     *  
     */
    
    private CompraData compraData = new CompraData();
    private Compra compraActual = null;
    private ProveedorData provData;
    private List <Proveedor> listaProveedor;
    private List <Producto> listaProducto; 
      
      
    public FormularioAltaCompra() {
        initComponents();
        provData = new ProveedorData();
        listaProveedor = provData.listarProveedores();
        cargarProveedores () ;
        cargarProductos () ;
        
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
        jButton_buscar = new javax.swing.JButton();
        jTextField_cod = new javax.swing.JTextField();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_cant = new javax.swing.JTextField();
        jLabel_razonSocial = new javax.swing.JLabel();
        jTextField_precio = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jCheckBox_Activo = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_nuevo2 = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jLabel_domicilio = new javax.swing.JLabel();
        jLabel_fecha = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jcomboBox_Producto = new javax.swing.JComboBox<>();
        jcomboBoxProveedor1 = new javax.swing.JComboBox<>();
        jLabel_fecha1 = new javax.swing.JLabel();
        jLabel_fecha2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Compras");
        setToolTipText("");

        jLabel_Materiattulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Materiattulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/compras (1).png"))); // NOI18N
        jLabel_Materiattulo.setText(" Compras");

        jLabel_codigoMat.setText("Código: ");

        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

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

        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrador.png"))); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcomboBox_Producto.setToolTipText("");
        jcomboBox_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBox_ProductoActionPerformed(evt);
            }
        });

        jcomboBoxProveedor1.setToolTipText("");
        jcomboBoxProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxProveedor1ActionPerformed(evt);
            }
        });

        jLabel_fecha1.setText("Proveedor:");

        jLabel_fecha2.setText("Productos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_codigoMat)
                            .addComponent(jLabel_domicilio))
                        .addGap(303, 303, 303)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_razonSocial)
                            .addComponent(jLabel_nombre))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_fecha2)
                                .addGap(60, 60, 60)
                                .addComponent(jcomboBox_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_fecha)
                                    .addComponent(jLabel_fecha1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcomboBoxProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_estado)
                                .addGap(42, 42, 42)
                                .addComponent(jCheckBox_Activo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Materiattulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton_nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_Materiattulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigoMat)
                    .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar))
                .addGap(28, 28, 28)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboBoxProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_fecha1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboBox_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_estado)
                    .addComponent(jCheckBox_Activo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_nuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:
      
        try {
         compraActual= compraData.buscarCompra(Integer.parseInt(jTextField_cod.getText().trim()));
           
            if (compraActual!=null) {
                 
//                jTextField_telefono.setText( compraActual.getTelefono() );
//                jCheckBox_Activo.setSelected(compraActual.isEstado() ); 
            } else {
                 JOptionPane.showMessageDialog(this, "código ingresado no corresponde a un proveedor registrado");
                 limpiarCamposPantalla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos, reintente nuevamente");
            e.printStackTrace();
            limpiarCamposPantalla();
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton_nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevo2ActionPerformed
        // TODO add your handling code here:
        limpiarCamposPantalla();
        compraActual=null;
    }//GEN-LAST:event_jButton_nuevo2ActionPerformed

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

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        //-----------------------ARREGLAR
        try { 
            Integer cantidad = Integer.parseInt (jTextField_cant.getText().trim() );
            Double precio = Double.parseDouble(jTextField_precio.getText().trim()); 
            boolean activo = jCheckBox_Activo.isSelected();
            
//            if ( ) {
//                if (compraActual == null) {
//                    compraActual = new Compra(proveedor, detalleCompra, LocalDate.MIN, activo);
//                    compraData.regristrarProveedor(compraActual);
//                } else {
//                    compraActual.setDetalleCompra(detalleCompra);
//                    
//                    
//                    compraActual.setEstado(activo);
//                    compraData.modificarDatosProveedor(compraActual);
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "No pueden existir campos vacios");
//                return;
//            }
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

    private void jcomboBox_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBox_ProductoActionPerformed
        // TODO add your handling code here:
        //------------------------REVISAR , debe ir asociado al jDateCHooser luego de ingresar los intervalos de fehca
 
    }//GEN-LAST:event_jcomboBox_ProductoActionPerformed

    private void jcomboBoxProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboBoxProveedor1ActionPerformed

    
       private void limpiarCamposPantalla() {
        jTextField_cant.setText("");
        jTextField_cod.setText("");
        jTextField_precio.setText("");
        jCheckBox_Activo.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_nuevo2;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JCheckBox jCheckBox_Activo;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel_Materiattulo;
    private javax.swing.JLabel jLabel_codigoMat;
    private javax.swing.JLabel jLabel_domicilio;
    private javax.swing.JLabel jLabel_estado;
    private javax.swing.JLabel jLabel_fecha;
    private javax.swing.JLabel jLabel_fecha1;
    private javax.swing.JLabel jLabel_fecha2;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_razonSocial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_cant;
    private javax.swing.JTextField jTextField_cod;
    private javax.swing.JTextField jTextField_precio;
    private javax.swing.JComboBox<Proveedor> jcomboBoxProveedor1;
    private javax.swing.JComboBox<Producto> jcomboBox_Producto;
    // End of variables declaration//GEN-END:variables

    private void cargarProveedores() {
        for (Proveedor proveedor : listaProveedor) {
           // jcomboBoxProveedor1.addItem();
        }
    }

    private void cargarProductos() {
        for (Producto producto : listaProducto) {
            jcomboBox_Producto.addItem(producto);
        }
    }
}
