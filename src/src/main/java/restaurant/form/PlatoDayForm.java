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

        jTablePlatosDia.setModel(tablePlatos);

        setTitle("Restaurante Nestor");
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
        bntVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextReceta = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jTextTiemp = new javax.swing.JTextField();
        jTextDescPlato = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePlatosDia = new javax.swing.JTable();
        btnAgregarPlato = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

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

        bntVolver.setText("VOLVER");
        bntVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVolverActionPerformed(evt);
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

        jTablePlatosDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PLATO", "CATEGORIA", "PRECIO", "TIEMPO DE ESPERA", "RECETA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePlatosDia.setComponentPopupMenu(jPopupMenu2);
        jTablePlatosDia.getTableHeader().setResizingAllowed(false);
        jTablePlatosDia.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePlatosDia);
        if (jTablePlatosDia.getColumnModel().getColumnCount() > 0) {
            jTablePlatosDia.getColumnModel().getColumn(0).setResizable(false);
            jTablePlatosDia.getColumnModel().getColumn(1).setResizable(false);
            jTablePlatosDia.getColumnModel().getColumn(2).setResizable(false);
            jTablePlatosDia.getColumnModel().getColumn(3).setResizable(false);
            jTablePlatosDia.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAgregarPlato.setText("AGREGAR PLATO");
        btnAgregarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlatoActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPlatoLayout = new javax.swing.GroupLayout(jPanelPlato);
        jPanelPlato.setLayout(jPanelPlatoLayout);
        jPanelPlatoLayout.setHorizontalGroup(
            jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bntVolver)
                .addGap(94, 94, 94))
            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlatoLayout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPlatoLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTiemp))
                            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLPlato)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextPrecio)
                                    .addComponent(jTextDescPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarPlato)
                                    .addComponent(jTextReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
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
                .addGap(18, 18, 18)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnAgregarPlato)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(bntVolver)
                    .addComponent(btnDelete))
                .addContainerGap(35, Short.MAX_VALUE))
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
    private void bntVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVolverActionPerformed

    }//GEN-LAST:event_bntVolverActionPerformed

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


    private void btnAgregarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlatoActionPerformed

       
       
        String[] plato = new String[5];
        plato[0] = jTextDescPlato.getText();
        plato[1] = jCBCategoria.getSelectedItem().toString();
        plato[2] = jTextPrecio.getText();
        plato[3] = jTextTiemp.getText();
        plato[4] = jTextReceta.getText();
        
        
         for(int i = 20; i<jTablePlatosDia.getRowCount();i++){
            tablePlatos.removeRow(i);
            i-=1;
        }   
        
         jTextDescPlato.setText("");
        jCBCategoria.setSelectedItem(ABORT);
        jTextPrecio.setText("");
        jTextTiemp.setText("");
        jTextReceta.setText("");
        tablePlatos.addRow(plato);


    }//GEN-LAST:event_btnAgregarPlatoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        //ELIMINAR DATOS EN TABLA
        this.tablePlatos.removeRow(this.jTablePlatosDia.getSelectedRow());

        jTextDescPlato.setText("");
        jCBCategoria.setSelectedItem(ABORT);
        jTextPrecio.setText("");
        jTextReceta.setText("");
        jTextTiemp.setText("");


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTableModel tablaplato = (DefaultTableModel) MenuDayForm.jTableMenuDia.getModel();
        int filasele = jTablePlatosDia.getSelectedRow();
        String[] menudia = new String[5];
        menudia[0] = jTablePlatosDia.getValueAt(filasele, 0).toString();
        menudia[1] = jTablePlatosDia.getValueAt(filasele, 1).toString();
        menudia[2] = jTablePlatosDia.getValueAt(filasele, 2).toString();
        menudia[3] = jTablePlatosDia.getValueAt(filasele, 3).toString();
        menudia[4] = jTablePlatosDia.getValueAt(filasele, 4).toString();
        tablaplato.addRow(menudia);
        MenuDayForm.jTableMenuDia.setModel(tablaplato);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

        DefaultTableModel tablaplato = (DefaultTableModel) MenuDayForm.jTableMenuDia.getModel();
        int filasele = jTablePlatosDia.getSelectedRow();
        String[] menudia = new String[5];
        menudia[0] = jTablePlatosDia.getValueAt(filasele, 0).toString();
        menudia[1] = jTablePlatosDia.getValueAt(filasele, 1).toString();
        menudia[2] = jTablePlatosDia.getValueAt(filasele, 2).toString();
        menudia[3] = jTablePlatosDia.getValueAt(filasele, 3).toString();
        menudia[4] = jTablePlatosDia.getValueAt(filasele, 4).toString();
        tablaplato.addRow(menudia);
        MenuDayForm.jTableMenuDia.setModel(tablaplato);
        
          dispose();

    }//GEN-LAST:event_btnAceptarMouseClicked

    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatoDayForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntVolver;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarPlato;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JLabel jLPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPlato;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePlatosDia;
    private javax.swing.JTextField jTextDescPlato;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextReceta;
    private javax.swing.JTextField jTextTiemp;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {

    }
}
