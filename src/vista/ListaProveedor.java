package vista;

import accesoADatos.ProveedorData;
import entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class ListaProveedor extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    //   private List <Proveedor> listaProveedorProveedor=null;
    private ProveedorData proveedorData = null;
    private List <Proveedor> listaProveedors=null;

    /**
     * Creates new form ListaProveedor
     */
    public ListaProveedor() {
        initComponents();
        proveedorData = new ProveedorData();
         
        modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        cargarComboBox();
        armarCabeceraTabla();
        cargarDatosEnTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_listadoProveedor = new javax.swing.JTable();
        jTextField1_BusquedaProv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBmostrar = new javax.swing.JButton();
        jComboBox_Proveedor = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de proveedores ");

        jLabel_compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/listadoProv 64.png"))); // NOI18N
        jLabel_compra.setText("Listado de proveedores");

        jLabel1.setText("Escriba el nombre del proveedor: ");

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

        jTextField1_BusquedaProv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1_BusquedaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_BusquedaProvActionPerformed(evt);
            }
        });
        jTextField1_BusquedaProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_BusquedaProvKeyReleased(evt);
            }
        });

        jLabel2.setText("Elija un proveedor: ");

        jLabel3.setText("Proveedores inactivos");

        jBmostrar.setText("Mostrar");
        jBmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmostrarActionPerformed(evt);
            }
        });

        jComboBox_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_compra)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField1_BusquedaProv, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(51, 51, 51)
                            .addComponent(jComboBox_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jBmostrar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_compra)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_BusquedaProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_BusquedaProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_BusquedaProvKeyReleased
        // Limpia la tabla antes de agregar nuevas filas
        limpiarCampos();
        limpiarComboBox();
        // Verificar lo ingresado está en la lista de  
        String textoIngresadoTf = jTextField1_BusquedaProv.getText().trim();
        try {
            List<Proveedor> proveedoresCoincidentes = proveedorData.buscarProveedorPorCoincidencia(textoIngresadoTf);

            //  modelo de la tabla no sea nulo
            if (modeloTabla != null) {

                for (Proveedor proveedor : proveedoresCoincidentes) {
                    modeloTabla.addRow(new Object[]{
                        proveedor.getIdProvedor(),
                        proveedor.getNombre(),
                        proveedor.getRazonSocial(),
                        proveedor.getTelefono()
                    });
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay datos cargados. Debe dar de alta un proveedor a traves de formulario");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error, reintente nuevamente");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1_BusquedaProvKeyReleased


    private void jTextField1_BusquedaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_BusquedaProvActionPerformed
      
    }//GEN-LAST:event_jTextField1_BusquedaProvActionPerformed




    private void jBmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmostrarActionPerformed
        limpiarCampos();
        limpiarComboBox();
        jTextField1_BusquedaProv.setText("");
        cargarProveedoresInactivos();
    }//GEN-LAST:event_jBmostrarActionPerformed

    private void jComboBox_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ProveedorActionPerformed
        // TODO add your handling code here:
            limpiarCampos(); 
        Proveedor provElegido = (Proveedor) jComboBox_Proveedor.getSelectedItem();
        
        listaProveedors = proveedorData.listarProveedoresPorID(provElegido.getIdProvedor());
        if(!listaProveedors.isEmpty() ) {
              for (Proveedor aux : listaProveedors) {
            modeloTabla.addRow(new Object[]{
                aux.getIdProvedor(),
                aux.getNombre(),
                aux.getRazonSocial(),
                aux.getTelefono(),
                aux.getDomicilio()
            });
        }
        }
      
    }//GEN-LAST:event_jComboBox_ProveedorActionPerformed

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
            jComboBox_Proveedor.addItem(aux);
        }
    }

    private void limpiarCampos() {
        modeloTabla.setRowCount(0);
       
    }
    
    private void limpiarComboBox () {
        
         jComboBox_Proveedor.setSelectedItem("Seleccione");
    }
    
 

    private void cargarDatosEnTabla() {

        listaProveedors = proveedorData.listarProveedores();

        //  modelo de la tabla no sea nulo
        if (modeloTabla != null) {

            for (Proveedor proveedor : listaProveedors) {
                modeloTabla.addRow(new Object[]{
                    proveedor.getIdProvedor(),
                    proveedor.getNombre(),
                    proveedor.getRazonSocial(),
                    proveedor.getTelefono()
                });
            }
        }  
    }
            
    
            
    

    private void cargarProveedoresInactivos() {
        
        List<Proveedor> proveedoresInactivos = proveedorData.listarProveedoresInactivos();
        for (Proveedor proveedoresI : proveedoresInactivos) {
            modeloTabla.addRow(new Object[]{
                proveedoresI.getIdProvedor(),
                proveedoresI.getNombre(),
                proveedoresI.getRazonSocial(),
                proveedoresI.getTelefono(),
                proveedoresI.getDomicilio()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBmostrar;
    private javax.swing.JComboBox<Proveedor> jComboBox_Proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_compra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_listadoProveedor;
    private javax.swing.JTextField jTextField1_BusquedaProv;
    // End of variables declaration//GEN-END:variables
}
