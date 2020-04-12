package src.main.java.restaurant.form;

public class MainMenuForm extends javax.swing.JFrame {

    
    public MainMenuForm() {
        initComponents();
        
       setTitle("RESTAURANTE NESTOR");
          setLayout(null);
        setSize(600, 500);
        setLocationRelativeTo(null);
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbAgregarMenu = new javax.swing.JRadioButton();
        btnAccept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jrbConsultarMenu = new javax.swing.JRadioButton();
        jrbVentas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jrbAgregarMenu);
        jrbAgregarMenu.setText("AGREGAR MENU DEL DIA");
        jrbAgregarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAgregarMenuActionPerformed(evt);
            }
        });

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jLabel1.setText("RESTAURANT NESTOR");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbConsultarMenu);
        jrbConsultarMenu.setText("CONSULTAR MENU DEL DIA");

        buttonGroup1.add(jrbVentas);
        jrbVentas.setText("VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jrbAgregarMenu)
                            .addComponent(jrbConsultarMenu)
                            .addComponent(jrbVentas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnAccept)
                        .addGap(80, 80, 80)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jrbAgregarMenu)
                .addGap(18, 18, 18)
                .addComponent(jrbConsultarMenu)
                .addGap(18, 18, 18)
                .addComponent(jrbVentas)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnExit))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
       
        if(jrbAgregarMenu.isSelected()){
            MenuDayForm menu = new MenuDayForm();
        menu.setVisible(true);
        dispose();
        }
        
        if(jrbConsultarMenu.isSelected()){
            MenuFinal consultar = new MenuFinal();
        consultar.setVisible(true);
        dispose();
        }
        
        if(jrbVentas.isSelected()){
            VentasDayForm ventas = new VentasDayForm();
            ventas.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jrbAgregarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAgregarMenuActionPerformed

        
    }//GEN-LAST:event_jrbAgregarMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAgregarMenu;
    private javax.swing.JRadioButton jrbConsultarMenu;
    private javax.swing.JRadioButton jrbVentas;
    // End of variables declaration//GEN-END:variables
}
