/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author carlo
 */
public class vPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vPrincipal
     */
    public vPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelRegistro.setVisible(false);
        jButton2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelLocPaquete = new javax.swing.JPanel();
        textoUsuario4 = new javax.swing.JLabel();
        textoUsuario5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        panelLogin = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonEntrar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        textoUsuario3 = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        textoUsuario6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoUsuario7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        textoUsuario8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        textoUsuario9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        textoUsuario10 = new javax.swing.JLabel();
        textoUsuario11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLocPaquete.setBackground(new java.awt.Color(255, 255, 255));
        panelLocPaquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelLocPaquete.setForeground(new java.awt.Color(255, 255, 255));
        panelLocPaquete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario4.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario4.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario4.setText("Localizador de paquetes");
        panelLocPaquete.add(textoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        textoUsuario5.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario5.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Cardboard_Box_30px.png"))); // NOI18N
        textoUsuario5.setText("Identificador:");
        panelLocPaquete.add(textoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        panelLocPaquete.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 450, 10));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(null);
        panelLocPaquete.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 250, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Search_30px.png"))); // NOI18N
        jButton4.setActionCommand("botonBuscar");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelLocPaquete.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        panelBase.add(panelLocPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 740, 290));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario.setText("Contraseña:");
        panelLogin.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Male_User_100px.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, 110));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 230, 10));

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setBorder(null);
        panelLogin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_User_32px.png"))); // NOI18N
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Key_2_28px.png"))); // NOI18N
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(65, 105, 225));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(null);
        botonRegistrarse.setContentAreaFilled(false);
        botonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        panelLogin.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 120, 30));

        botonEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botonEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(65, 105, 225));
        botonEntrar.setText("Entrar");
        botonEntrar.setBorder(null);
        botonEntrar.setContentAreaFilled(false);
        botonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        panelLogin.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 100, 30));

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setBorder(null);
        panelLogin.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 170, 30));

        textoUsuario3.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario3.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario3.setText("Usuario:");
        panelLogin.add(textoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        panelBase.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelLogo.setForeground(new java.awt.Color(255, 255, 255));
        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Captura_2.JPG"))); // NOI18N
        panelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 200));

        panelBase.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 740, 260));

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario6.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario6.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario6.setText("Registro de un nuevo usuario");
        panelRegistro.add(textoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelRegistro.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_User_32px.png"))); // NOI18N
        panelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        textoUsuario7.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario7.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario7.setText("Nombre:");
        panelRegistro.add(textoUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelRegistro.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));

        textoUsuario8.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario8.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario8.setText("DNI:");
        panelRegistro.add(textoUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelRegistro.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 220, 30));

        textoUsuario9.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario9.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario9.setText("ID:");
        panelRegistro.add(textoUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelRegistro.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 220, 30));

        textoUsuario10.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario10.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario10.setText("Email:");
        panelRegistro.add(textoUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        textoUsuario11.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario11.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario11.setText("Teléfono:");
        panelRegistro.add(textoUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        panelRegistro.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Unchecked_Checkbox_36px_1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRegistro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 30, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Checked_Checkbox_36px_1.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelRegistro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 30, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/captcha_1.JPG"))); // NOI18N
        panelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 80));
        panelRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, -1));

        panelBase.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Multiply_30px.png"))); // NOI18N
        botonCerrar.setActionCommand("botonBuscar");
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        panelBase.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 30));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        panelLocPaquete.setVisible(false);
        panelLogin.setVisible(false);
        panelRegistro.setVisible(true);
        panelRegistro.setLocation(0, 0);
        panelRegistro.setSize(310,580);

    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        jButton2.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelLocPaquete;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JLabel textoUsuario10;
    private javax.swing.JLabel textoUsuario11;
    private javax.swing.JLabel textoUsuario3;
    private javax.swing.JLabel textoUsuario4;
    private javax.swing.JLabel textoUsuario5;
    private javax.swing.JLabel textoUsuario6;
    private javax.swing.JLabel textoUsuario7;
    private javax.swing.JLabel textoUsuario8;
    private javax.swing.JLabel textoUsuario9;
    // End of variables declaration//GEN-END:variables
}
