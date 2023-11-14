 
package vista;

import accesoADatos.ProveedorData;
import entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class ListaProveedor extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    private List <Proveedor> listaProveedorProveedor=null;
    private ProveedorData proveedorData = null ;

    /**
     * Creates new form ListaProveedor
     */
    public ListaProveedor() {
        initComponents();
        proveedorData = new ProveedorData();
        //seteo de tabla p/que no sea editable
        modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                // Devolver false para que todas las celdas no sean editables
                return false;
            }
        };
        cargarComboBox();
        armarCabeceraTabla();
    }

 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_compra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcomboBoxProveedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_listadoProveedor = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de proveedores ");

        jLabel_compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/productoalta.png"))); // NOI18N
        jLabel_compra.setText("Listado de proveedores");

        jLabel1.setText("Ingrese un proveedor: ");

        jcomboBoxProveedor.setEditable(true);
        jcomboBoxProveedor.setToolTipText("");
        jcomboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxProveedorActionPerformed(evt);
            }
        });
        jcomboBoxProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcomboBoxProveedorKeyReleased(evt);
            }
        });

        jTable1_listadoProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1_listadoProveedor);

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Elija un proveedor: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_compra)
                            .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel_compra)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboBoxProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcomboBoxProveedorKeyReleased
        // Limpiar la tabla antes de agregar nuevas filas
        limpiarTabla();

        // Obtener el texto ingresado en el JComboBox
        String textoIngresado = ((JTextComponent) jcomboBoxProveedor.getEditor().getEditorComponent()).getText();

        // Verificar si el texto ingresado está en la lista de proveedores
        List<Proveedor> proveedoresCoincidentes = proveedorData.buscarProveedorPorCoincidencia(textoIngresado);

        // Llenar la tabla con los proveedores coincidentes
        for (Proveedor proveedor : proveedoresCoincidentes) {
            modeloTabla.addRow(new Object[]{
                proveedor.getIdProvedor(),
                proveedor.getNombre(),
                proveedor.getRazonSocial(),
                proveedor.getTelefono(),
                proveedor.getDomicilio()
            });
        }

    }//GEN-LAST:event_jcomboBoxProveedorKeyReleased

    private void jcomboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxProveedorActionPerformed
        // TODO add your handling code here:
         // Limpiar la tabla antes de agregar nuevas filas
        limpiarTabla();

        // Obtener el texto ingresado en el JComboBox
        String textoIngresado = ((JTextComponent) jcomboBoxProveedor.getEditor().getEditorComponent()).getText();

        // Verificar si el texto ingresado está en la lista de proveedores
        List<Proveedor> proveedoresCoincidentes = proveedorData.buscarProveedorPorCoincidencia(textoIngresado);

        // Llenar la tabla con los proveedores coincidentes
        for (Proveedor proveedor : proveedoresCoincidentes) {
            modeloTabla.addRow(new Object[]{
                proveedor.getIdProvedor(),
                proveedor.getNombre(),
                proveedor.getRazonSocial(),
                proveedor.getTelefono(),
                proveedor.getDomicilio()
            });
        }
    }//GEN-LAST:event_jcomboBoxProveedorActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        limpiarTabla();

        // Obtener el texto ingresado en el JTextField
        String textoIngresado = jTextField1.getText();

        // Verificar si el texto ingresado está en la lista de proveedores
        List<Proveedor> listaDeprovBusqCoincidencia = proveedorData.buscarProveedorPorCoincidencia(textoIngresado);

        // Llenar la tabla con los proveedores coincidentes
        for (Proveedor proveedor : listaDeprovBusqCoincidencia) {
            modeloTabla.addRow(new Object[]{
                proveedor.getIdProvedor(),
                proveedor.getNombre(),
                proveedor.getRazonSocial(),
                proveedor.getTelefono(),
                proveedor.getDomicilio()
            });
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Id proveedor");
        filaCabecera.add("Nombre");
        filaCabecera.add("Razon social");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Telefono");
        for (Object aux : filaCabecera) {
            modeloTabla.addColumn(aux);
        }
        jTable1_listadoProveedor.setModel(modeloTabla);
    }

    private void cargarComboBox() {
        for (Proveedor aux : proveedorData.listarProveedores()) {
            jcomboBoxProveedor.addItem(aux);
        }
    }

    private void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_compra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_listadoProveedor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<Proveedor> jcomboBoxProveedor;
    // End of variables declaration//GEN-END:variables
}
