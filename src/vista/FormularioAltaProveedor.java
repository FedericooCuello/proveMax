  
package vista;
 
import accesoADatos.ProveedorData;
import entidades.Proveedor;
import javax.swing.JOptionPane;


public class FormularioAltaProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioProveedor
     */
    
    private ProveedorData proveedorData = new ProveedorData();
    private Proveedor proveedorActual = null;
      
    public FormularioAltaProveedor() {
        initComponents();
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
        jTextField_nombre = new javax.swing.JTextField();
        jLabel_razonSocial = new javax.swing.JLabel();
        jTextField_razonSOcial = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jCheckBox_Activo = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_nuevo2 = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jTextField_domicilio = new javax.swing.JTextField();
        jLabel_domicilio = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel_domicilio1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario de alta de proveedor");
        setToolTipText("");

        jLabel_Materiattulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Materiattulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/repartidor (2).png"))); // NOI18N
        jLabel_Materiattulo.setText("  Proveedor");

        jLabel_codigoMat.setText("Código: ");

        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jLabel_nombre.setText("Nombre");

        jTextField_nombre.setText(" ");
        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        jLabel_razonSocial.setText("Razon social:");

        jTextField_razonSOcial.setText(" ");
        jTextField_razonSOcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_razonSOcialActionPerformed(evt);
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

        jTextField_domicilio.setText(" ");
        jTextField_domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_domicilioActionPerformed(evt);
            }
        });

        jLabel_domicilio.setText("Domicilio:");

        jTextField_telefono.setText(" ");
        jTextField_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telefonoActionPerformed(evt);
            }
        });

        jLabel_domicilio1.setText("Teléfono: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Materiattulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_codigoMat)
                            .addComponent(jLabel_domicilio)
                            .addComponent(jLabel_estado)
                            .addComponent(jLabel_domicilio1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_domicilio)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(133, 133, 133)
                                                .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 24, Short.MAX_VALUE)))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_Activo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_razonSocial)
                            .addComponent(jLabel_nombre))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_razonSOcial, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_razonSocial)
                    .addComponent(jTextField_razonSOcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_domicilio)
                    .addComponent(jTextField_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_domicilio1)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
         proveedorActual= proveedorData.buscarProveedor(Integer.parseInt(jTextField_cod.getText().trim()));
           
            if (proveedorActual!=null) {
                jTextField_nombre.setText(proveedorActual.getNombre());
                jTextField_razonSOcial.setText( proveedorActual.getRazonSocial() );
                jTextField_domicilio.setText(proveedorActual.getDomicilio());
                jTextField_telefono.setText( proveedorActual.getTelefono() );
                jCheckBox_Activo.setSelected(proveedorActual.isEstado() ); 
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

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jTextField_razonSOcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_razonSOcialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_razonSOcialActionPerformed

    private void jButton_nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevo2ActionPerformed
        // TODO add your handling code here:
        limpiarCamposPantalla();
        proveedorActual=null;
    }//GEN-LAST:event_jButton_nuevo2ActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
 
        if (proveedorActual!=null) {
            proveedorData.eliminarProveedor(proveedorActual.getIdProvedor() );
            proveedorActual=null;
            limpiarCamposPantalla();
              JOptionPane.showMessageDialog(this, "Proveedor eliminado");
        } else  {
            JOptionPane.showMessageDialog(this, "No hay un proveedor seleccionado");
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        
        try { 
            String nombre = jTextField_nombre.getText();
            String razonSocial = jTextField_razonSOcial.getText();
            String domicilio = jTextField_domicilio.getText();
            String telefono = jTextField_telefono.getText();
            boolean activo = jCheckBox_Activo.isSelected();
            if (!nombre.isEmpty() && !razonSocial.isEmpty() && !domicilio.isEmpty()) {
                if (proveedorActual == null) {
                    proveedorActual = new Proveedor(nombre, razonSocial, domicilio, telefono, activo);
                    int clave=proveedorData.regristrarProveedor(proveedorActual);
                    jTextField_cod.setText(""+clave);
                } else {
                    proveedorActual.setNombre(nombre);
                    proveedorActual.setRazonSocial(razonSocial);
                    proveedorActual.setDomicilio(domicilio);
                    proveedorActual.setTelefono(telefono);
                    proveedorActual.setEstado(activo);
                    proveedorData.modificarDatosProveedor(proveedorActual);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No pueden existir campos vacios");
                return;
            }
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

    private void jTextField_domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_domicilioActionPerformed

    private void jTextField_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoActionPerformed

    
        private void limpiarCamposPantalla() {
       jTextField_cod.setText("");
       jTextField_domicilio.setText("");
        jTextField_nombre.setText("");
        jTextField_razonSOcial.setText("");
        jTextField_telefono.setText("");
        jCheckBox_Activo.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_nuevo2;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JCheckBox jCheckBox_Activo;
    private javax.swing.JLabel jLabel_Materiattulo;
    private javax.swing.JLabel jLabel_codigoMat;
    private javax.swing.JLabel jLabel_domicilio;
    private javax.swing.JLabel jLabel_domicilio1;
    private javax.swing.JLabel jLabel_estado;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_razonSocial;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_cod;
    private javax.swing.JTextField jTextField_domicilio;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_razonSOcial;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
