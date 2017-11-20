/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloresinfantiless;

import java.awt.BorderLayout;

/**
 *
 * @author Alejandro
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        IngresoClientes c = new IngresoClientes();
        c.setSize(600,600);
        c.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(c, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_cliente2 = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JLabel();
        btn_pendiente = new javax.swing.JLabel();
        btn_descuento = new javax.swing.JLabel();
        btn_facturas = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        menu_load = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(41, 128, 185));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 500));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Alejandro Giraldo Duque");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pendiente.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/promocion.png"))); // NOI18N
        jLabel18.setToolTipText("");

        btn_cliente2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_cliente2.setForeground(new java.awt.Color(255, 255, 255));
        btn_cliente2.setText("Clientes");
        btn_cliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cliente2MouseClicked(evt);
            }
        });

        btn_inventario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(255, 255, 255));
        btn_inventario.setText("Inventario");
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseClicked(evt);
            }
        });

        btn_pendiente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_pendiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_pendiente.setText("Pendientes");
        btn_pendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pendienteMouseClicked(evt);
            }
        });

        btn_descuento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_descuento.setForeground(new java.awt.Color(255, 255, 255));
        btn_descuento.setText("Descuentos");
        btn_descuento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_descuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_descuentoMouseClicked(evt);
            }
        });

        btn_facturas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_facturas.setForeground(new java.awt.Color(255, 255, 255));
        btn_facturas.setText("Facturas");
        btn_facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_facturasMouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facturas.png"))); // NOI18N
        jLabel20.setToolTipText("");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(btn_facturas))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_cliente2))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_inventario))
                                .addComponent(jLabel14))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(btn_descuento)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pendiente)
                        .addGap(28, 28, 28)))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(72, 72, 72)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cliente2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_inventario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pendiente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_descuento)))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_facturas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_load.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menu_loadLayout = new javax.swing.GroupLayout(menu_load);
        menu_load.setLayout(menu_loadLayout);
        menu_loadLayout.setHorizontalGroup(
            menu_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        menu_loadLayout.setVerticalGroup(
            menu_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addComponent(menu_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cliente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cliente2MouseClicked
        // TODO add your handling code here:
        
        Clientes c = new Clientes();
        c.setSize(600,600);
        c.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(c, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();

    }//GEN-LAST:event_btn_cliente2MouseClicked

    private void btn_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseClicked
        // TODO add your handling code here:
        Inventario i = new Inventario();
        i.setSize(600,600);
        i.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(i, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();
       
    }//GEN-LAST:event_btn_inventarioMouseClicked

    private void btn_pendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pendienteMouseClicked
        // TODO add your handling code here:
        Pendientes P = new Pendientes();
        P.setSize(600,600);
        P.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(P, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();
    }//GEN-LAST:event_btn_pendienteMouseClicked

    private void btn_descuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descuentoMouseClicked
        // TODO add your handling code here:
        Descuentos D = new Descuentos();
        D.setSize(600,600);
        D.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(D, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();
    }//GEN-LAST:event_btn_descuentoMouseClicked

    private void btn_facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturasMouseClicked
        // TODO add your handling code here:
        Facturas F = new Facturas();
        F.setSize(600,600);
        F.setLocation(5, 5);
        
        menu_load.removeAll();
        menu_load.add(F, BorderLayout.CENTER);
        menu_load.revalidate();
        menu_load.repaint();
        
    }//GEN-LAST:event_btn_facturasMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cliente2;
    private javax.swing.JLabel btn_descuento;
    private javax.swing.JLabel btn_facturas;
    private javax.swing.JLabel btn_inventario;
    private javax.swing.JLabel btn_pendiente;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JPanel menu_load;
    // End of variables declaration//GEN-END:variables
}
