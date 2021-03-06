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
public class VRegistro extends javax.swing.JPanel {
    private aplicacion.FachadaAplicacion fa;
    private boolean captcha;
    private VPrincipal vp;

    /**
     * Creates new form VRegistro
     */
    public VRegistro(aplicacion.FachadaAplicacion fa, VPrincipal vp) {
        initComponents();
        this.fa = fa;
        this.setVisible(false);
        captcha = false;
        this.vp = vp;
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

        panelRegistro = new javax.swing.JPanel();
        textoUsuario6 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoUsuario7 = new javax.swing.JLabel();
        textDni = new javax.swing.JTextField();
        textoUsuario8 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textoUsuario9 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        textoUsuario10 = new javax.swing.JLabel();
        textoUsuario11 = new javax.swing.JLabel();
        unchecked = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        textoUsuario12 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textoUsuario13 = new javax.swing.JLabel();
        textContraseña = new javax.swing.JPasswordField();
        textoUsuario14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textSexo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(214, 225, 254));
        panelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario6.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoUsuario6.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario6.setText("Nuevo usuario");
        panelRegistro.add(textoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        textNombre.setBackground(new java.awt.Color(214, 225, 254));
        textNombre.setForeground(new java.awt.Color(153, 153, 153));
        textNombre.setBorder(null);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        panelRegistro.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_User_32px.png"))); // NOI18N
        panelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        textoUsuario7.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario7.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario7.setText("Nombre:");
        panelRegistro.add(textoUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        textDni.setBackground(new java.awt.Color(214, 225, 254));
        textDni.setForeground(new java.awt.Color(153, 153, 153));
        textDni.setBorder(null);
        panelRegistro.add(textDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 240, 30));

        textoUsuario8.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario8.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario8.setText("DNI:");
        panelRegistro.add(textoUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        textID.setBackground(new java.awt.Color(214, 225, 254));
        textID.setForeground(new java.awt.Color(153, 153, 153));
        textID.setBorder(null);
        panelRegistro.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 30));

        textoUsuario9.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario9.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario9.setText("ID:");
        panelRegistro.add(textoUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        textEmail.setBackground(new java.awt.Color(214, 225, 254));
        textEmail.setForeground(new java.awt.Color(153, 153, 153));
        textEmail.setBorder(null);
        panelRegistro.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 30));

        textoUsuario10.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario10.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario10.setText("Email:");
        panelRegistro.add(textoUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        textoUsuario11.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario11.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario11.setText("Contraseña:");
        panelRegistro.add(textoUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        unchecked.setBackground(new java.awt.Color(255, 255, 255));
        unchecked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Unchecked_Checkbox_36px_1.png"))); // NOI18N
        unchecked.setBorderPainted(false);
        unchecked.setContentAreaFilled(false);
        unchecked.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        unchecked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uncheckedActionPerformed(evt);
            }
        });
        panelRegistro.add(unchecked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 50, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Checked_Checkbox_36px_1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelRegistro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 30, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/captcha_1.JPG"))); // NOI18N
        panelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 300, 70));
        panelRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, -1));

        textoUsuario12.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario12.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario12.setText("Teléfono:");
        panelRegistro.add(textoUsuario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        textTelefono.setBackground(new java.awt.Color(214, 225, 254));
        textTelefono.setForeground(new java.awt.Color(153, 153, 153));
        textTelefono.setBorder(null);
        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });
        panelRegistro.add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, 30));

        textDireccion.setBackground(new java.awt.Color(214, 225, 254));
        textDireccion.setForeground(new java.awt.Color(153, 153, 153));
        textDireccion.setBorder(null);
        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });
        panelRegistro.add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 190, 30));

        textoUsuario13.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario13.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario13.setText("Dirección:");
        panelRegistro.add(textoUsuario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        textContraseña.setBackground(new java.awt.Color(214, 225, 254));
        textContraseña.setBorder(null);
        panelRegistro.add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 30));

        textoUsuario14.setBackground(new java.awt.Color(65, 105, 225));
        textoUsuario14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textoUsuario14.setForeground(new java.awt.Color(65, 105, 225));
        textoUsuario14.setText("Sexo: (H/M)");
        panelRegistro.add(textoUsuario14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 51, 255));
        panelRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 20));

        textSexo.setBackground(new java.awt.Color(214, 225, 254));
        textSexo.setForeground(new java.awt.Color(153, 153, 153));
        textSexo.setBorder(null);
        textSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSexoActionPerformed(evt);
            }
        });
        panelRegistro.add(textSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 190, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 160, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 51, 153));
        panelRegistro.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 160, 10));

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Registrarse");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, 20));

        panelRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-izquierda-círculo-24.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void uncheckedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uncheckedActionPerformed
        // TODO add your handling code here:
        unchecked.setVisible(false);
        jButton2.setVisible(true);
        captcha = true;

    }//GEN-LAST:event_uncheckedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void textDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSexoActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
         String nombre = textNombre.getText();
        String dni = textDni.getText();
        String email = textEmail.getText();
        String direccion = textDireccion.getText();
        String telefono = textTelefono.getText();
        String contraseña = textContraseña.getText();
        String id = textID.getText();
        String sexo = textSexo.getText();
        if(nombre!=null && dni!=null && email!=null && contraseña!=null && id!=null && captcha==true){
            if(!nombre.equals("") && !dni.equals("") && !email.equals("") && !contraseña.equals("") && !id.equals("")){
            fa.registrarUsuario(id, contraseña, dni, nombre, email, direccion, telefono, sexo);
            vp.ventanaUsuario(fa.consultarUsuario(id, contraseña));
            }
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        vp.ventanaPrincipal();
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textSexo;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JLabel textoUsuario10;
    private javax.swing.JLabel textoUsuario11;
    private javax.swing.JLabel textoUsuario12;
    private javax.swing.JLabel textoUsuario13;
    private javax.swing.JLabel textoUsuario14;
    private javax.swing.JLabel textoUsuario6;
    private javax.swing.JLabel textoUsuario7;
    private javax.swing.JLabel textoUsuario8;
    private javax.swing.JLabel textoUsuario9;
    private javax.swing.JButton unchecked;
    // End of variables declaration//GEN-END:variables
}
