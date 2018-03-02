/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import Clases.Metodos;
import com.sun.glass.events.KeyEvent;
import javax.swing.*;

/**
 *
 * @author crash
 */
public class Login extends javax.swing.JFrame {
static boolean sesion =  true;
static boolean registrar = true;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        userName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sesionBox = new javax.swing.JComboBox<>();
        icon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        registrarBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        repeatPass = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        magicPass = new javax.swing.JPasswordField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/rain.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        passWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordActionPerformed(evt);
            }
        });
        passWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passWordKeyPressed(evt);
            }
        });

        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Iniciar sesión como");

        sesionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));
        sesionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionBoxActionPerformed(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Estrella copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(17, 17, 17))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(sesionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sesionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Iniciar Sesión", jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Crear nueva cuenta como");

        registrarBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente" }));
        registrarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre de usuario:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Repetir contraseña:");

        jButton3.setText("Crear cuenta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Contraseña maestra:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(pass)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(47, 47, 47)
                                .addComponent(jButton3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(registrarBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repeatPass)
                            .addComponent(magicPass))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(repeatPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(magicPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrarse", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit (0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registrarBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBoxActionPerformed
        String itemSeleccionado = (String)registrarBox.getSelectedItem();
        if ("Administrador".equals(itemSeleccionado)) {
            this.registrar = true;
        } else {
            this.registrar = false;
        }      
    }//GEN-LAST:event_registrarBoxActionPerformed

    private void sesionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionBoxActionPerformed
        String itemSeleccionado = (String)sesionBox.getSelectedItem();
        String url = "multimedia/Estrella copy.png";
        String url2 = "multimedia/rain.gif";
        if ("Administrador".equals(itemSeleccionado)) {
            this.sesion = true;
            icon.setText(url);
        } else {
            this.sesion = false;
            icon.setText (url2);
        }
        
        
    }//GEN-LAST:event_sesionBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String usuario;
        String passw;
        String repeatPassw;
        String contraMaestra = "54321";
        
        Metodos ft=new Metodos();
        usuario = jTextField2.getText();
        passw = pass.getText();
        repeatPassw = repeatPass.getText();
        
        if (magicPass.getText().equals(contraMaestra)) {
            if (passw.equals(repeatPassw)) {
                if (registrar == true) {
                    int control;
                    control=ft.inserDatosAdmin(usuario, passw);
                    dispose ();
                    Sistema sistema = new Sistema ();
                    sistema.setVisible(true);
                    sistema.setResizable(false);
                    sistema.setLocationRelativeTo(null);
                } else {
                    int control;
                    control=ft.inserDatosAdmin(usuario, passw);
                    dispose ();
                    SistemaUser sistema = new SistemaUser ();
                    sistema.setVisible(true);
                    sistema.setResizable(false);
                    sistema.setLocationRelativeTo(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                pass.setText("");
                repeatPass.setText("");
                magicPass.setText ("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sólo el administrador sabe la contraseña maestra", "Error", JOptionPane.ERROR_MESSAGE);
            pass.setText("");
            repeatPass.setText("");
            magicPass.setText ("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (sesion == true) {
            Metodos ft = new Metodos();
            String usuario = userName.getText();
            String contraseña = passWord.getText();
            int control;
            control=ft.SelectDatosAdmin(usuario, contraseña);
            if(control==1){
                dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido\nHas ingresado"+" satisfactoriamente al sistema", "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
                Sistema sistema = new Sistema();
                sistema.setTitle ("Bievendio Administrador");
                sistema.setSize(800, 350);
                sistema.setVisible (true);
                sistema.setResizable (false);
                sistema.setLocationRelativeTo (null);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        if (sesion == false) {
            Metodos ft = new Metodos();
            String usuario = userName.getText();
            String contraseña = passWord.getText();
            int control;
            control=ft.SelectDatos(usuario, contraseña);
            if(control==1){
                dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido\nHas ingresado"+" satisfactoriamente al sistema", "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
                SistemaUser sistema = new SistemaUser ();
                sistema.setTitle ("Bienvenido Cliente");
                sistema.setSize (700, 350);
                sistema.setLocationRelativeTo (null);
                sistema.setVisible(true);
                sistema.setResizable (false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passWordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (sesion == true) {
            Metodos ft = new Metodos();
            String usuario = userName.getText();
            String contraseña = passWord.getText();
            int control;
            control=ft.SelectDatosAdmin(usuario, contraseña);
            if(control==1){
                dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido\nHas ingresado"+" satisfactoriamente al sistema", "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
                Sistema sistema = new Sistema();
                sistema.setTitle ("Bievendio Administrador");
                sistema.setSize(700, 350);
                sistema.setVisible (true);
                sistema.setResizable (false);
                sistema.setLocationRelativeTo (null);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        if (sesion == false) {
            Metodos ft = new Metodos();
            String usuario = userName.getText();
            String contraseña = passWord.getText();
            int control;
            control=ft.SelectDatos(usuario, contraseña);
            if(control==1){
                dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido\nHas ingresado"+" satisfactoriamente al sistema", "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
                SistemaUser sistema = new SistemaUser ();
                sistema.setTitle ("Bienvenido Cliente");
                sistema.setSize (600, 350);
                sistema.setLocationRelativeTo (null);
                sistema.setVisible(true);
                sistema.setResizable (false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        }
    }//GEN-LAST:event_passWordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField magicPass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JComboBox<String> registrarBox;
    private javax.swing.JPasswordField repeatPass;
    private javax.swing.JComboBox<String> sesionBox;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
