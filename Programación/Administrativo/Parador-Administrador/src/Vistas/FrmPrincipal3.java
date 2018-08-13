/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Vistas.PanelesMenuPrincipal.PanelAlmacen;
import Vistas.PanelesMenuPrincipal.PanelCompras;
import Vistas.PanelesMenuPrincipal.PanelProductos;
import Vistas.PanelesMenuPrincipal.PanelVentas;
import java.awt.BorderLayout;

/**
 *
 * @author Usuario
 */
public class FrmPrincipal3 extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal3
     */
    public FrmPrincipal3() {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JPanel();
        escritorioPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlmacen = new javax.swing.JMenu();
        menuCompras = new javax.swing.JMenu();
        menuProductos = new javax.swing.JMenu();
        menuVentas = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout escritorioPrincipalLayout = new javax.swing.GroupLayout(escritorioPrincipal);
        escritorioPrincipal.setLayout(escritorioPrincipalLayout);
        escritorioPrincipalLayout.setHorizontalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioPrincipalLayout.setVerticalGroup(
            escritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(246, 30));

        menuAlmacen.setText("Almacen");
        menuAlmacen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlmacenMouseClicked(evt);
            }
        });
        menuAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlmacenActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuAlmacen);

        menuCompras.setText("Compras");
        menuCompras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuComprasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCompras);

        menuProductos.setText("Productos");
        menuProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuProductos);

        menuVentas.setText("Ventas");
        menuVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuVentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorioPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorioPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlmacenActionPerformed

    }//GEN-LAST:event_menuAlmacenActionPerformed

    private void menuAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlmacenMouseClicked
        // TODO add your handling code here:
        PanelAlmacen panel = new PanelAlmacen();
        panel.setSize(1138, 104);
        panel.setLocation(0, 2);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(panel,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_menuAlmacenMouseClicked

    private void menuComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuComprasMouseClicked
        // TODO add your handling code here:
        PanelCompras panel = new PanelCompras();
        panel.setSize(1138, 104);
        panel.setLocation(0, 2);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(panel,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_menuComprasMouseClicked

    private void menuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductosMouseClicked
        // TODO add your handling code here:
        PanelProductos panel = new PanelProductos();
        panel.setSize(1138, 104);
        panel.setLocation(0, 2);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(panel,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_menuProductosMouseClicked

    private void menuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentasMouseClicked
        // TODO add your handling code here:
        PanelVentas panel = new PanelVentas();
        panel.setSize(1138, 104);
        panel.setLocation(0, 2);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(panel,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_menuVentasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorioPrincipal;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuVentas;
    public javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
