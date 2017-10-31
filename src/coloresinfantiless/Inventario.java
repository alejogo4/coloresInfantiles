/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloresinfantiless;
import Clase.*;
import classDAO.InventarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alejandro
 */
public class Inventario extends javax.swing.JPanel {

   DefaultTableModel Model;
   Validation v;
   ConectaBD c; 
   Connection co;
    public Inventario() {
        initComponents();
       
        Model = new DefaultTableModel();
        Model.addColumn("NIT");
        Model.addColumn("Nombre");
        Model.addColumn("Descripcion");
        Model.addColumn("Existencia");
        this.TBL_Productos.setModel(Model);
        v = new Validation();
        
        c = new ConectaBD();
        co  = c.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablainventario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        TXT_NIT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXT_IDpr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_Nompr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXT_Unpr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_DESCpr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXT_Prepr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXT_IVApr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BTN_Add = new javax.swing.JButton();
        cmb_activo = new javax.swing.JComboBox<>();
        BTN_Buscarproducto = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Nuestros Productos");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        tablainventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablainventario);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTA", jPanel4);

        TXT_NIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NITKeyTyped(evt);
            }
        });

        jLabel1.setText("NIT");

        TBL_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TBL_Productos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_NIT)
                        .addGap(119, 119, 119)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(TXT_NIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BUSCAR", jPanel1);

        jLabel2.setText("IDProducto");

        TXT_IDpr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_IDprKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre");

        TXT_Nompr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_NomprKeyTyped(evt);
            }
        });

        jLabel4.setText("Unidades");

        TXT_Unpr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_UnprKeyTyped(evt);
            }
        });

        jLabel5.setText("Descripción");

        jLabel6.setText("Precio");

        TXT_Prepr.setToolTipText("");
        TXT_Prepr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PreprKeyTyped(evt);
            }
        });

        jLabel7.setText("Iva");

        TXT_IVApr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_IVAprKeyTyped(evt);
            }
        });

        jLabel8.setText("Activo");

        BTN_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar-documentos.png"))); // NOI18N
        BTN_Add.setText("Agregar");
        BTN_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddActionPerformed(evt);
            }
        });

        cmb_activo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar --", "TRUE", "FALSE", " " }));

        BTN_Buscarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando.png"))); // NOI18N
        BTN_Buscarproducto.setText("BUSCAR");
        BTN_Buscarproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_BuscarproductoMouseClicked(evt);
            }
        });
        BTN_Buscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarproductoActionPerformed(evt);
            }
        });

        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_DESCpr, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTN_Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTN_Buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnActualizar)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Prepr)
                            .addComponent(TXT_IVApr)
                            .addComponent(TXT_IDpr)
                            .addComponent(TXT_Nompr)
                            .addComponent(TXT_Unpr)
                            .addComponent(cmb_activo, 0, 210, Short.MAX_VALUE))
                        .addGap(181, 181, 181))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_IDpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXT_Nompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXT_Unpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Prepr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TXT_IVApr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXT_DESCpr, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Add)
                    .addComponent(BTN_Buscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INSERTAR", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IDproducto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Unidades");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Iva");
        modelo.addColumn("Activo");

        tablainventario.setModel(modelo);
        Object[] arrinventario = new Object[7];
        for(classVO.Inventario inventario: InventarioDAO.getListProductos()){
            arrinventario[0] = inventario.getIdproducto();
            arrinventario[1] = inventario.getNombre();
            arrinventario[2] = inventario.getUnidades();
            arrinventario[3] = inventario.getDescripcion();
            arrinventario[4] = inventario.getPrecio();
            arrinventario[5] = inventario.getIva();
            arrinventario[6] = inventario.getActivo();

            modelo.addRow(arrinventario);
        }
        tablainventario.setModel(modelo);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void BTN_BuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_BuscarproductoActionPerformed

    private void BTN_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = co.prepareStatement("INSERT INTO productos (IDproducto,nombre,unidades,descripcion,precio,iva,activo) VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, TXT_IDpr.getText());
            pst.setString(2, TXT_Nompr.getText());
            pst.setString(3, TXT_Unpr.getText());
            pst.setString(4, TXT_DESCpr.getText());
            pst.setString(5, TXT_Prepr.getText());
            pst.setString(6, TXT_IVApr.getText());
            pst.setString(7, (String) cmb_activo.getSelectedItem());

            pst.executeUpdate();

            TXT_IDpr.setText("");
            TXT_Nompr.setText("");
            TXT_Unpr.setText("");
            TXT_DESCpr.setText("");
            TXT_Prepr.setText("");
            TXT_IVApr.setText("");

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_BTN_AddActionPerformed

    private void TXT_IVAprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_IVAprKeyTyped
        v.Onlynumber(evt.getKeyChar(), evt);
    }//GEN-LAST:event_TXT_IVAprKeyTyped

    private void TXT_PreprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PreprKeyTyped
        v.Onlynumber(evt.getKeyChar(), evt);
    }//GEN-LAST:event_TXT_PreprKeyTyped

    private void TXT_UnprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_UnprKeyTyped
        v.Onlynumber(evt.getKeyChar(), evt);
    }//GEN-LAST:event_TXT_UnprKeyTyped

    private void TXT_NomprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NomprKeyTyped
        v.Onlytext(evt.getKeyChar(), evt);
    }//GEN-LAST:event_TXT_NomprKeyTyped

    private void TXT_IDprKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_IDprKeyTyped
        v.validar1(evt.getKeyChar(), evt, TXT_IDpr.getText().length());
    }//GEN-LAST:event_TXT_IDprKeyTyped

    private void TXT_NITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_NITKeyTyped
        v.validar1(evt.getKeyChar(), evt, TXT_NIT.getText().length());
    }//GEN-LAST:event_TXT_NITKeyTyped

    private void BTN_BuscarproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_BuscarproductoMouseClicked
     classVO.Inventario prod = InventarioDAO.buscarProductos(TXT_IDpr.getText());
     
        TXT_IDpr.setText(prod.getIdproducto()+"");
        TXT_Nompr.setText(prod.getNombre());
        TXT_Unpr.setText(prod.getUnidades().toString());
        TXT_Prepr.setText(prod.getPrecio().toString());
        TXT_IVApr.setText(prod.getIva().toString());
        TXT_DESCpr.setText(prod.getDescripcion());
       
    }//GEN-LAST:event_BTN_BuscarproductoMouseClicked

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // TODO add your handling code here:
        classVO.Inventario prod = new classVO.Inventario();
        prod.setIdproducto(Integer.parseInt(TXT_IDpr.getText()));
        prod.setNombre(TXT_Nompr.getText());
        prod.setUnidades(Integer.parseInt(TXT_Unpr.getText()));
        prod.setPrecio(Integer.parseInt(TXT_Prepr.getText()));
        prod.setIva(Integer.parseInt(TXT_IVApr.getText()));
        prod.setDescripcion(TXT_DESCpr.getText());
        prod.setActivo((String) cmb_activo.getSelectedItem());
        
        InventarioDAO.actualizarProveedores(prod);
  
        TXT_IDpr.setText("");
        TXT_Nompr.setText("");
        TXT_Unpr.setText("");
        TXT_Prepr.setText("");
        TXT_IVApr.setText("");
        TXT_DESCpr.setText("");
        
    }//GEN-LAST:event_BtnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Add;
    private javax.swing.JButton BTN_Buscarproducto;
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JTable TBL_Productos;
    private javax.swing.JTextField TXT_DESCpr;
    private javax.swing.JTextField TXT_IDpr;
    private javax.swing.JTextField TXT_IVApr;
    private javax.swing.JTextField TXT_NIT;
    private javax.swing.JTextField TXT_Nompr;
    private javax.swing.JTextField TXT_Prepr;
    private javax.swing.JTextField TXT_Unpr;
    private javax.swing.JComboBox<String> cmb_activo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablainventario;
    // End of variables declaration//GEN-END:variables
}
