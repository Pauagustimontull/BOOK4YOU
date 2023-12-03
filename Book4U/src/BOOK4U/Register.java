/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOOK4U;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;

/**
 *
 * @author alumnat
 */
public class Register extends javax.swing.JPanel {

    boolean selected = false;

    public Register() {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        Surname = new javax.swing.JTextField();
        Dni = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        jButton10 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        Base = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(25, 25));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setFocusable(false);
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 830, 500, 50));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 840, 350, 40));

        Surname.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Surname.setForeground(new java.awt.Color(102, 102, 102));
        Surname.setBorder(null);
        Surname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SurnameMouseClicked(evt);
            }
        });
        Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameActionPerformed(evt);
            }
        });
        add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 370, 50));

        Dni.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Dni.setForeground(new java.awt.Color(102, 102, 102));
        Dni.setBorder(null);
        Dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DniMouseClicked(evt);
            }
        });
        Dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniActionPerformed(evt);
            }
        });
        add(Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 370, 50));

        Name.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setBorder(null);
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, 380, 50));

        Email.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setBorder(null);
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 370, 50));

        Password.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setToolTipText("");
        Password.setBorder(null);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 390, 30));

        ConfirmPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        ConfirmPassword.setForeground(new java.awt.Color(102, 102, 102));
        ConfirmPassword.setBorder(null);
        ConfirmPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmPasswordMouseClicked(evt);
            }
        });
        ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordActionPerformed(evt);
            }
        });
        add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, 390, 40));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Register.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Register_hover.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Register_hover.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 740, 460, 90));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 255, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Sign In");
        jTextArea1.setBorder(null);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 890, 110, 50));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Do you have Account? ");
        jTextArea2.setBorder(null);
        add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 890, 350, 50));

        Base.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register.png"))); // NOI18N
        add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2200, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        System.out.println("oleee");
        JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new PanelBase());
        marco.setVisible(true);

    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        System.out.println("oleee");
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        if (Controlador.esDNIValido(Dni.getText())) {
            
        
        if (!Name.getText().isEmpty() && !Email.getText().isEmpty() && !Password.getText().isEmpty() && !Dni.getText().isEmpty() && !Surname.getText().isEmpty()) {

            if (Password.getText().equals(ConfirmPassword.getText()) && Dni.getText().length() == 9) {
                Controlador.setUsuarioInside(BD.register(Controlador.con, Name.getText(), Email.getText(), Controlador.hash(Password.getText()), Dni.getText(), Surname.getText()));
                if (Controlador.getUsuarioInside() != null) {

                    JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
                    marco.remove(this);
                    marco.add(new NewBookPage());
                    marco.setVisible(true);
                    NewBookPage.Barcelona.setVisible(false);
                    NewBookPage.Madrid.setVisible(false);
                    NewBookPage.Sevilla.setVisible(false);
                    NewBookPage.Coruña.setVisible(false);
                    NewBookPage.Zaragoza.setVisible(false);
                    NewBookPage.Valencia.setVisible(false);
                    NewBookPage.Valladolid.setVisible(false);
                    NewBookPage.Asturias.setVisible(false);
                    NewBookPage.Murcia.setVisible(false);
                    System.out.println(Controlador.getUsuarioInside());
                }
            } else {

                jTextArea3.setText("Registro fallido, datos incorrectos");
                Name.setText("");
                Email.setText("");
                Password.setText("");
                ConfirmPassword.setText("");
                Dni.setText("");
                Surname.setText("");
            }
        } else {
            jTextArea3.setText("Por favor rellena todos los campos!");
            Name.setText("");
            Email.setText("");
            Password.setText("");
            ConfirmPassword.setText("");
            Dni.setText("");
            Surname.setText("");
        }
        } else {
            jLabel15.setText("El DNI no es válido.");
        }
        //System.out.println(Controlador.getPassw());
        //Controlador.setUsuarioInside(BD.login(Controlador.con,  Controlador.getUser(), Controlador.getPassw()));

    }//GEN-LAST:event_jButton10ActionPerformed

    private void SurnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SurnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameMouseClicked

    private void SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurnameActionPerformed

    private void DniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DniMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DniMouseClicked

    private void DniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DniActionPerformed

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked

    }//GEN-LAST:event_PasswordMouseClicked

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void ConfirmPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPasswordMouseClicked

    }//GEN-LAST:event_ConfirmPasswordMouseClicked

    private void ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordActionPerformed

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NameMouseClicked

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailMouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Base;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JTextField Dni;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Surname;
    private javax.swing.JButton jButton10;
    private javax.swing.JFrame jFrame1;
    public static javax.swing.JLabel jLabel15;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
