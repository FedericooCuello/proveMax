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
import javax.swing.table.DefaultTableModel;




  
public class ListaProveedores extends javax.swing.JInternalFrame {

private DefaultTableModel modeloTabla;
private DefaultTableModel modeloTabla2;

private List <Proveedor> listaProveedor=null;
private List <DetalleCompra> listaCompras=null; 

private ProveedorData provData=null;
private CompraData compData=null;
private DetalleCompraData detCompData=null;

    public ListaProveedores() {
        initComponents();
        provData=new ProveedorData();
        listaProveedor = provData.listarProveedores();
        
        modeloTabla = new DefaultTableModel();
        modeloTabla2= new DefaultTableModel();
        
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
        jLabel1_fInicial = new javax.swing.JLabel();
        jLabel_fFinal = new javax.swing.JLabel();
        jcomboBoxProveedor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton_buscarProveedorFecha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1_listadoCompraProveedores = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de compras");
        setToolTipText("");

        jLabel_fechaCompra.setText("Fecha de compra:");

        jLabel_compra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/proveedor.png"))); // NOI18N
        jLabel_compra.setText("Listado de compras a proveedores");

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
        jScrollPane1.setViewportView(jTable1_listadoProveedores);

        jDateChooser1_fechaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1_fechaFinalMouseClicked(evt);
            }
        });

        jLabel1_fInicial.setText("Inicio");

        jLabel_fFinal.setText("Final");

        jcomboBoxProveedor.setToolTipText("");
        jcomboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBoxProveedorActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija un proveedor: ");

        jButton_buscarProveedorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        jButton_buscarProveedorFecha.setToolTipText("Clic derecho para buscar compras a proveedores en el intervalo de fechas");
        jButton_buscarProveedorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarProveedorFechaActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1_listadoCompraProveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_fInicial)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1_fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel_fFinal)
                                .addGap(30, 30, 30)
                                .addComponent(jDateChooser1_fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_buscarProveedorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel_fechaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel_compra)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel_compra)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jLabel_fechaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser1_fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser1_fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1_fInicial))
                            .addComponent(jLabel_fFinal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButton_buscarProveedorFecha))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscarProveedorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarProveedorFechaActionPerformed
        Proveedor provSeleccionado = (Proveedor) jcomboBoxProveedor.getSelectedItem();
        borrarFilas();
        borrarFilas2();
        modeloTabla.addRow(new Object [] {
                    provSeleccionado.getIdProvedor(),
                    provSeleccionado.getNombre(),
                    provSeleccionado.getRazonSocial(),
                    provSeleccionado.getDomicilio(),
                    provSeleccionado.getTelefono()
                });     
        java.util.Date d1=jDateChooser1_fechaInicial.getDate();
        java.util.Date d2=jDateChooser1_fechaFinal.getDate();
        LocalDate f1=d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate f2=d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        detCompData=new DetalleCompraData();
        listaCompras=detCompData.buscarComprasProveedor(provSeleccionado.getIdProvedor(),Date.valueOf(f1),Date.valueOf(f2));
        if(!listaCompras.isEmpty()){
            for(DetalleCompra aux:listaCompras){
                modeloTabla2.addRow(new Object[]{
                    aux.getCompra().getFecha(),
                    aux.getProducto(),
                    aux.getCantidad(),
                    aux.getCantidad()
                }
                );
            }
        }
    }//GEN-LAST:event_jButton_buscarProveedorFechaActionPerformed

    private void jcomboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBoxProveedorActionPerformed
//        borrarFilas();
//        Proveedor provSeleccionado = (Proveedor) jcomboBoxProveedor.getSelectedItem();
//        //obt lista 
//        listaProveedor = provData.listarProveedoresPorID(provSeleccionado.getIdProvedor());
//        if(!listaProveedor.isEmpty()) {
//            for ( Proveedor aux : listaProveedor  ) {
//                modeloTabla.addRow(new Object [] {
//                    aux.getIdProvedor(),
//                    aux.getNombre(),
//                    aux.getRazonSocial(),
//                    aux.getDomicilio(),
//                    aux.getTelefono()
//                });
//            }
//        }
    }//GEN-LAST:event_jcomboBoxProveedorActionPerformed

    private void jDateChooser1_fechaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1_fechaFinalMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jDateChooser1_fechaFinalMouseClicked

    
        private void borrarFilas () {
        //devuelve la cant de fila = getRowCount, que va a ser usada como indice por eso se resta -1
        int indiceFila = modeloTabla.getRowCount()-1;
        for(int i=indiceFila; i>=0;  i--) {
            modeloTabla.removeRow(i);
        }
        }
        private void borrarFilas2 () {
        //devuelve la cant de fila = getRowCount, que va a ser usada como indice por eso se resta -1
        int indiceFila = modeloTabla2.getRowCount()-1;
        for(int i=indiceFila; i>=0;  i--) {
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
         
        private void armarCabeceraTabla2(){
            ArrayList<Object> filaCabecera=new ArrayList<>();
            filaCabecera.add("Fecha de Compra");
            filaCabecera.add("Prodructo");
            filaCabecera.add("Cantidad");
            filaCabecera.add("Precio");
            for(Object aux:filaCabecera){
                modeloTabla2.addColumn(aux);
            }
            jTable1_listadoCompraProveedores.setModel(modeloTabla2);
        } 
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscarProveedorFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1_fechaFinal;
    private com.toedter.calendar.JDateChooser jDateChooser1_fechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_fInicial;
    private javax.swing.JLabel jLabel_compra;
    private javax.swing.JLabel jLabel_fFinal;
    private javax.swing.JLabel jLabel_fechaCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_listadoCompraProveedores;
    private javax.swing.JTable jTable1_listadoProveedores;
    private javax.swing.JComboBox<Proveedor> jcomboBoxProveedor;
    // End of variables declaration//GEN-END:variables
}
