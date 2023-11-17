/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import accesoADatos.ProveedorData;
import entidades.Compra;
import entidades.DetalleCompra;
import entidades.Proveedor;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaCompraProveedores extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    private DefaultTableModel modeloTabla2;

    private List<Proveedor> listaProveedor = null;
    private List<DetalleCompra> listaCompras = null;

    private ProveedorData provData = null;
    private CompraData compData = null;
    private DetalleCompraData detCompData = null;

    public ListaCompraProveedores() {
        initComponents();
        provData = new ProveedorData();
        listaProveedor = provData.listarProveedores();

         modeloTabla = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
                 return false;
            }
        };
        
        modeloTabla2 = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
                 return false;
            }
        };

        cargarProveedores();

        armarCabeceraTabla();
        armarCabeceraTabla2();
        
    }

    private void cargarProveedores() {
        for (Proveedor aux : listaProveedor) {
            jcomboBoxProveedor.addItem(aux);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1_fechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel_fechaCompra = new javax.swing.JLabel();
        jLabel_compra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_listadoProveedores = new javax.swing.JTable();
        jDateChooser1_fechaFinal = new com.toedter.calendar.JDateChooser();
        jcomboBoxProveedor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton_buscarProveedorFecha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1_listadoCompraProveedores = new javax.swing.JTable();
        jButton1_prodXproveedor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado de compras a proveedores");
        setToolTipText("");

        jDateChooser1_fechaInicial.setToolTipText("fecha inicial");
        jDateChooser1_fechaInicial.setMaximumSize(null);

        jLabel_fechaCompra.setText("Fecha de compra:");
        jLabel_fechaCompra.setMaximumSize(null);

        jLabel_compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/proveedor.png"))); // NOI18N
        jLabel_compra.setText("Listado de compras a proveedores");
        jLabel_compra.setMaximumSize(null);

        jScrollPane1.setMaximumSize(null);

        jTable1_listadoProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1_listadoProveedores.setToolTipText("Tabla información de proveedores");
        jScrollPane1.setViewportView(jTable1_listadoProveedores);

        jDateChooser1_fechaFinal.setToolTipText("fecha final");
        jDateChooser1_fechaFinal.setMaximumSize(null);

        jcomboBoxProveedor.setToolTipText(" ");
        jcomboBoxProveedor.setMaximumSize(null);
        jcomboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxProveedorActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija un proveedor: ");
        jLabel1.setMaximumSize(null);

        jButton_buscarProveedorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jButton_buscarProveedorFecha.setText("Buscar");
        jButton_buscarProveedorFecha.setToolTipText("Clic derecho para buscar compras a proveedores en el intervalo de fechas");
        jButton_buscarProveedorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarProveedorFechaActionPerformed(evt);
            }
        });

        jScrollPane2.setMaximumSize(null);

        jTable1_listadoCompraProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1_listadoCompraProveedores.setToolTipText("Tabla información de productos");
        jScrollPane2.setViewportView(jTable1_listadoCompraProveedores);

        jButton1_prodXproveedor.setText("Buscar productos por proveedor");
        jButton1_prodXproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_prodXproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1_fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jDateChooser1_fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jButton_buscarProveedorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_prodXproveedor)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_buscarProveedorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1_fechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1_fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1_prodXproveedor)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscarProveedorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarProveedorFechaActionPerformed
        Proveedor provSeleccionado = (Proveedor) jcomboBoxProveedor.getSelectedItem();
        borrarFilas();
        borrarFilas2();

        modeloTabla.addRow(new Object[]{
            provSeleccionado.getIdProvedor(),
            provSeleccionado.getNombre(),
            provSeleccionado.getRazonSocial(),
            provSeleccionado.getDomicilio(),
            provSeleccionado.getTelefono()
        });

        java.util.Date d1 = jDateChooser1_fechaInicial.getDate();
        java.util.Date d2 = jDateChooser1_fechaFinal.getDate();

        // Chequeo que las fechas no estén vacías
        if (d1 != null && d2 != null) {
            LocalDate f1 = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate f2 = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Verificar que f1 sea anterior o igual a f2
            if (!f1.isAfter(f2)) {
                detCompData = new DetalleCompraData();
                listaCompras = detCompData.buscarComprasProveedor(provSeleccionado.getIdProvedor(), Date.valueOf(f1), Date.valueOf(f2));

                if (!listaCompras.isEmpty()) {
                    for (DetalleCompra aux : listaCompras) {
                        modeloTabla2.addRow(new Object[]{
                            aux.getCompra().getFecha(),
                            aux.getProducto(),
                            aux.getCantidad(),
                            aux.getCantidad()
                        });
                    }
                }else {
                    JOptionPane.showMessageDialog(this, "No hay compras registradas entre las fechas seleccionadas.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
               
                JOptionPane.showMessageDialog(this, "La fecha inicial debe ser anterior o igual a la fecha final.", "Error de fecha", JOptionPane.ERROR_MESSAGE);
            }
        } else {
          
            //JOptionPane.showMessageDialog(this, "Ambas fechas son requeridas.", "Error de fecha", JOptionPane.ERROR_MESSAGE);
            detCompData = new DetalleCompraData();
            listaCompras = detCompData.ListarComprasAProveedor(provSeleccionado.getIdProvedor());
            if (!listaCompras.isEmpty()) {
                    for (DetalleCompra aux : listaCompras) {
                        modeloTabla2.addRow(new Object[]{
                            aux.getCompra().getFecha(),
                            aux.getProducto(),
                            aux.getCantidad(),
                            aux.getPrecioCosto()
                        });
                    }
                }
        }

    }//GEN-LAST:event_jButton_buscarProveedorFechaActionPerformed

    private void jcomboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxProveedorActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        borrarFilas2();
        Proveedor provSeleccionado = (Proveedor) jcomboBoxProveedor.getSelectedItem();
        detCompData = new DetalleCompraData();
        //llenado de tabla 1 con datos de proveedor
        for (Proveedor proveedor : provData.listarProveedoresPorID(provSeleccionado.getIdProvedor())) {
            modeloTabla.addRow(new Object[]{
                proveedor.getIdProvedor(),
                proveedor.getNombre(),
                proveedor.getRazonSocial(),
                proveedor.getDomicilio(),
                proveedor.getTelefono()
            });

        }

        listaCompras = detCompData.ListarComprasAProveedor(provSeleccionado.getIdProvedor());

        if (!listaCompras.isEmpty()) {
            for (DetalleCompra aux : listaCompras) {
                modeloTabla2.addRow(new Object[]{
                    aux.getCompra().getFecha(),
                    aux.getProducto(),
                    aux.getCantidad(),
                    aux.getPrecioCosto()
                });

            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay compras registradas bajo ese proveedor.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jcomboBoxProveedorActionPerformed

    private void jButton1_prodXproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_prodXproveedorActionPerformed
        // TODO add your handling code here:
        borrarFilas();
       int filaSeleccionada = jTable1_listadoCompraProveedores.getSelectedRow();
       jcomboBoxProveedor.setEnabled(false);
       jDateChooser1_fechaFinal.setEnabled(false);
       jDateChooser1_fechaFinal.setEnabled(false);
       if (filaSeleccionada!=-1 ) {
           // extraccion de dato de la col 1 producto
            Integer idProducto = (Integer) jTable1_listadoCompraProveedores.getValueAt(filaSeleccionada, 2);
            
        }else {
            JOptionPane.showConfirmDialog(this, "No hay fila seleccionada, por favor seleccione un alumno a editar");
        }
                   
       
    }//GEN-LAST:event_jButton1_prodXproveedorActionPerformed

    private void borrarFilas() {
        //devuelve la cant de fila = getRowCount, que va a ser usada como indice por eso se resta -1
        int indiceFila = modeloTabla.getRowCount() - 1;
        for (int i = indiceFila; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void borrarFilas2() {
        
        int indiceFila = modeloTabla2.getRowCount() - 1;
        for (int i = indiceFila; i >= 0; i--) {
            modeloTabla2.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Id");
        filaCabecera.add("Nombre");
        filaCabecera.add("Razón social");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Telefono");
        for (Object aux : filaCabecera) {
            modeloTabla.addColumn(aux);
        }
        jTable1_listadoProveedores.setModel(modeloTabla);
    }

    private void armarCabeceraTabla2() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Fecha de Compra");
        filaCabecera.add("Producto");
        filaCabecera.add("Cantidad");
        filaCabecera.add("Precio");
        for (Object aux : filaCabecera) {
            modeloTabla2.addColumn(aux);
        }
        jTable1_listadoCompraProveedores.setModel(modeloTabla2);
    }
    
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_prodXproveedor;
    private javax.swing.JButton jButton_buscarProveedorFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1_fechaFinal;
    private com.toedter.calendar.JDateChooser jDateChooser1_fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_compra;
    private javax.swing.JLabel jLabel_fechaCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_listadoCompraProveedores;
    private javax.swing.JTable jTable1_listadoProveedores;
    private javax.swing.JComboBox<Proveedor> jcomboBoxProveedor;
    // End of variables declaration//GEN-END:variables
}
