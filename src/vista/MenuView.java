 
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MeniView
     */
    public MenuView() {
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

        ImageIcon iconoEscritorio = new ImageIcon(getClass().getResource("/recursos/imagenDesktop.jpg"));
        Image escritorioImagen = iconoEscritorio.getImage();
        jDesktopPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(escritorioImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_detalleCompra = new javax.swing.JMenu();
        jMenuItem1_detalleCompra = new javax.swing.JMenuItem();
        jMenuItem1_listaComprasAproveedores = new javax.swing.JMenuItem();
        jMenuItem1_detalleDeCompra = new javax.swing.JMenuItem();
        jMenuCompraSugerida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_altaProducto = new javax.swing.JMenuItem();
        jMenuItem1_listaProducto = new javax.swing.JMenuItem();
        jMenu2_altaModificacionProveedor = new javax.swing.JMenu();
        jMenuItem1_altaProveedor = new javax.swing.JMenuItem();
        jMenuItem1_listaProveedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProveMax - Gestión de ventas");

        jDesktopPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPrincipalLayout = new javax.swing.GroupLayout(jDesktopPrincipal);
        jDesktopPrincipal.setLayout(jDesktopPrincipalLayout);
        jDesktopPrincipalLayout.setHorizontalGroup(
            jDesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPrincipalLayout.setVerticalGroup(
            jDesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jMenu1_detalleCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/transaccion.png"))); // NOI18N
        jMenu1_detalleCompra.setText(" Compras    ");
        jMenu1_detalleCompra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem1_detalleCompra.setText("Comprar");
        jMenuItem1_detalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_detalleCompraActionPerformed(evt);
            }
        });
        jMenu1_detalleCompra.add(jMenuItem1_detalleCompra);

        jMenuItem1_listaComprasAproveedores.setText("Lista de compras");
        jMenuItem1_listaComprasAproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_listaComprasAproveedoresActionPerformed(evt);
            }
        });
        jMenu1_detalleCompra.add(jMenuItem1_listaComprasAproveedores);

        jMenuItem1_detalleDeCompra.setText("Detalle de compras");
        jMenuItem1_detalleDeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_detalleDeCompraActionPerformed(evt);
            }
        });
        jMenu1_detalleCompra.add(jMenuItem1_detalleDeCompra);

        jMenuCompraSugerida.setText("Compra sugerida");
        jMenuCompraSugerida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCompraSugeridaActionPerformed(evt);
            }
        });
        jMenu1_detalleCompra.add(jMenuCompraSugerida);

        jMenuBar1.add(jMenu1_detalleCompra);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/producto logo.png"))); // NOI18N
        jMenu3.setText("  Productos      ");
        jMenu3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem_altaProducto.setText("Formulario de alta / busqueda de producto");
        jMenuItem_altaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_altaProductoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_altaProducto);

        jMenuItem1_listaProducto.setText("Lista de productos");
        jMenuItem1_listaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_listaProductoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1_listaProducto);

        jMenuBar1.add(jMenu3);

        jMenu2_altaModificacionProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/repartidor (2).png"))); // NOI18N
        jMenu2_altaModificacionProveedor.setText(" Proveedores");
        jMenu2_altaModificacionProveedor.setToolTipText("");
        jMenu2_altaModificacionProveedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem1_altaProveedor.setText("Formulario alta / busqueda de proveedor");
        jMenuItem1_altaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_altaProveedorActionPerformed(evt);
            }
        });
        jMenu2_altaModificacionProveedor.add(jMenuItem1_altaProveedor);

        jMenuItem1_listaProveedor.setText("Lista de proveedores");
        jMenuItem1_listaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_listaProveedorActionPerformed(evt);
            }
        });
        jMenu2_altaModificacionProveedor.add(jMenuItem1_listaProveedor);

        jMenuBar1.add(jMenu2_altaModificacionProveedor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_listaComprasAproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_listaComprasAproveedoresActionPerformed
        // TODO add your handling code here:
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        ListaCompraProveedores listaCompraProveedores = new ListaCompraProveedores();
        listaCompraProveedores.setVisible(true);
        jDesktopPrincipal.add(listaCompraProveedores);
        jDesktopPrincipal.moveToFront(listaCompraProveedores);
        listaCompraProveedores.getContentPane().setBackground(new Color(232, 248, 245  ));
    }//GEN-LAST:event_jMenuItem1_listaComprasAproveedoresActionPerformed

    private void jMenuItem1_altaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_altaProveedorActionPerformed
        // TODO add your handling code here:
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        FormularioAltaProveedor formularioAltaProveedor = new FormularioAltaProveedor();
        formularioAltaProveedor.setVisible(true);
        jDesktopPrincipal.add(formularioAltaProveedor);
        jDesktopPrincipal.moveToFront(formularioAltaProveedor);
        formularioAltaProveedor.getContentPane().setBackground(new Color(209, 242, 235 ));
    }//GEN-LAST:event_jMenuItem1_altaProveedorActionPerformed

    private void jMenuItem_altaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_altaProductoActionPerformed
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        FormularioAltaProducto formProducto = new FormularioAltaProducto ();
        formProducto.setVisible(true);
        jDesktopPrincipal.add(formProducto);
        jDesktopPrincipal.moveToFront(formProducto);
        formProducto.getContentPane().setBackground(new Color(227, 242, 253));
    }//GEN-LAST:event_jMenuItem_altaProductoActionPerformed

    private void jMenuItem1_detalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_detalleCompraActionPerformed
        // TODO add your handling code here:
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        FormularioAltaCompra formularioAltaCompra = new FormularioAltaCompra();
        formularioAltaCompra.setVisible(true);
        jDesktopPrincipal.add(formularioAltaCompra);
        jDesktopPrincipal.moveToFront(formularioAltaCompra);
        formularioAltaCompra.getContentPane().setBackground(new Color(251, 238, 230 ));
    }//GEN-LAST:event_jMenuItem1_detalleCompraActionPerformed

    private void jMenuItem1_listaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_listaProductoActionPerformed
        // TODO add your handling code here:
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        ListaProducto listaProducto = new ListaProducto();
        listaProducto.setVisible(true);
         jDesktopPrincipal.add(listaProducto);
        jDesktopPrincipal.moveToFront(listaProducto);
        listaProducto.getContentPane().setBackground(new Color(249, 235, 234 ));
        
//        ListaCompraProveedores formListaProducto = new ListaCompraProveedores();
//        formListaProducto.setVisible(true);
//        jDesktopPrincipal.add(formListaProducto);
//        jDesktopPrincipal.moveToFront(formListaProducto);
//        formListaProducto.getContentPane().setBackground(new Color(249, 235, 234 ));

    }//GEN-LAST:event_jMenuItem1_listaProductoActionPerformed

    private void jMenuItem1_listaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_listaProveedorActionPerformed
         jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        ListaProveedor listaProveedor = new ListaProveedor();
        listaProveedor.setVisible(true);
         jDesktopPrincipal.add(listaProveedor);
        jDesktopPrincipal.moveToFront(listaProveedor);
        listaProveedor.getContentPane().setBackground(new Color(244, 246, 246 ));
    }//GEN-LAST:event_jMenuItem1_listaProveedorActionPerformed

    private void jMenuItem1_detalleDeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_detalleDeCompraActionPerformed
        // TODO add your handling code here:
          jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        FormularioDetalleCompra formularioDetalleCompra = new FormularioDetalleCompra();
        formularioDetalleCompra.setVisible(true);
        jDesktopPrincipal.add(formularioDetalleCompra);
        jDesktopPrincipal.moveToFront(formularioDetalleCompra);
        formularioDetalleCompra.getContentPane().setBackground(new Color(240, 240, 246 ));
        
    }//GEN-LAST:event_jMenuItem1_detalleDeCompraActionPerformed

    private void jMenuCompraSugeridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCompraSugeridaActionPerformed
        jDesktopPrincipal.removeAll();
        jDesktopPrincipal.repaint();
        CompraSugerida comprasugerida = new CompraSugerida();
        comprasugerida.setVisible(true);
        jDesktopPrincipal.add(comprasugerida);
        jDesktopPrincipal.moveToFront(comprasugerida);
        comprasugerida.getContentPane().setBackground(new Color(240, 240, 246 ));
        
    }//GEN-LAST:event_jMenuCompraSugeridaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPrincipal;
    private javax.swing.JMenu jMenu1_detalleCompra;
    private javax.swing.JMenu jMenu2_altaModificacionProveedor;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCompraSugerida;
    private javax.swing.JMenuItem jMenuItem1_altaProveedor;
    private javax.swing.JMenuItem jMenuItem1_detalleCompra;
    private javax.swing.JMenuItem jMenuItem1_detalleDeCompra;
    private javax.swing.JMenuItem jMenuItem1_listaComprasAproveedores;
    private javax.swing.JMenuItem jMenuItem1_listaProducto;
    private javax.swing.JMenuItem jMenuItem1_listaProveedor;
    private javax.swing.JMenuItem jMenuItem_altaProducto;
    // End of variables declaration//GEN-END:variables
}
