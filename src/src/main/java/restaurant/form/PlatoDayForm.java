package src.main.java.restaurant.form;


import javax.swing.table.DefaultTableModel;
import src.main.java.restaurant.form.MenuDayForm;

public class PlatoDayForm extends javax.swing.JFrame {

    DefaultTableModel tablePlatos = new DefaultTableModel();

    public PlatoDayForm() {

        initComponents();

        tablePlatos.addColumn("PLATO");
        tablePlatos.addColumn("CATEGORIA");
        tablePlatos.addColumn("PRECIO");
        tablePlatos.addColumn("TIEMPO DE ESPERA");
        tablePlatos.addColumn("RECETA");

       

        setTitle("RESTAURANTE NESTOR");
        setLayout(null);
        setSize(500, 600);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanelPlato = new javax.swing.JPanel();
        jLPlato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        bntCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextReceta = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextTiemp = new javax.swing.JTextField();
        jTextDescPlato = new javax.swing.JTextField();

        jMenuItem1.setText("Enviar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPlato.setVerifyInputWhenFocusTarget(false);

        jLPlato.setText("Plato");

        jLabel1.setText("Categoria");

        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato Entrante", "Plato Fuerte", "Bebidas", "Postres", "Ensaladas" }));
        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        jLabel3.setText("Tiempo Espera");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.setComponentPopupMenu(jPopupMenu2);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        bntCancel.setText("CANCEL");
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });

        jLabel4.setText("Receta");

        jTextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioActionPerformed(evt);
            }
        });
        jTextPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioKeyTyped(evt);
            }
        });

        jTextTiemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTiempKeyTyped(evt);
            }
        });

        jTextDescPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescPlatoActionPerformed(evt);
            }
        });
        jTextDescPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDescPlatoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelPlatoLayout = new javax.swing.GroupLayout(jPanelPlato);
        jPanelPlato.setLayout(jPanelPlatoLayout);
        jPanelPlatoLayout.setHorizontalGroup(
            jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPlatoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTiemp))
                    .addGroup(jPanelPlatoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPlatoLayout.createSequentialGroup()
                        .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLPlato)
                            .addComponent(jLabel2))
                        .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlatoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextDescPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jCBCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(64, 64, 64)
                .addComponent(bntCancel)
                .addGap(131, 131, 131))
        );
        jPanelPlatoLayout.setVerticalGroup(
            jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPlato)
                    .addComponent(jTextDescPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextTiemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(bntCancel))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPlato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCategoriaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

       
         
        /*
        PlatoDayEntity platoDayEntity = new PlatoDayEntity();

        platoDayEntity.setPlato(jTextDescPlato.getText());
        platoDayEntity.setCategoria(jCBCategoria.getActionCommand()); // CONVERTIR
        platoDayEntity.setPrecio(Float.parseFloat(jTextPrecio.getText()));
        platoDayEntity.setTiempoEspera(Integer.parseInt(jTextTiemp.getText())); //CONVERTIR
         */

    }//GEN-LAST:event_btnAceptarActionPerformed
    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed

        MainMenuForm principal = new MainMenuForm();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntCancelActionPerformed

    private void jTextPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextPrecioKeyTyped

    private void jTextTiempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTiempKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextTiempKeyTyped

    private void jTextDescPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescPlatoActionPerformed

    private void jTextDescPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescPlatoKeyTyped

        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextDescPlatoKeyTyped


    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

        DefaultTableModel tablaplato = (DefaultTableModel) MenuDayForm.jTableMenuDia.getModel();
        
        String[] menudia = new String[5];
        menudia[0] = jTextDescPlato.getText();
        menudia[1] = jCBCategoria.getSelectedItem().toString();
        menudia[2] = jTextPrecio.getText();
        menudia[3] = jTextReceta.getText();
        menudia[4] = jTextTiemp.getText();
        tablaplato.addRow(menudia);
        MenuDayForm.jTableMenuDia.setModel(tablaplato);
        
          this.dispose();

    }//GEN-LAST:event_btnAceptarMouseClicked

    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatoDayForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JLabel jLPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPlato;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JTextField jTextDescPlato;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextReceta;
    private javax.swing.JTextField jTextTiemp;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {

    }
}
