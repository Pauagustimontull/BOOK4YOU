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
public class PanelBase extends javax.swing.JPanel {

    public PanelBase() {
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
        jButton10 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

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

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Login.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Login_hover.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Login_hover.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 770, 460, 90));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 255, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Create Account ");
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
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 900, 260, 40));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 51, 0));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 720, 410, 40));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Don´t have Account? ");
        jTextArea3.setBorder(null);
        add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 900, 350, 40));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("pau@pau.com");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 400, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sin-tick.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 50, 50));

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setText("pau");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 390, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2200, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        System.out.println("oleee");
        JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new Register());
        marco.setVisible(true);
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        System.out.println("oleee");
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Controlador.isSelected() == false) {
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png")));
            Controlador.setSelected(true);
        } else {
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sin-tick.png")));
            Controlador.setSelected(false);
        }
        System.out.println(Controlador.isSelected());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Controlador.setUser(jTextField3.getText());
        Controlador.setPassw(jPasswordField1.getText());
        //System.out.println(Controlador.getPassw());   

        Controlador.setUsuarioInside(BD.login(Controlador.con, Controlador.getUser(), Controlador.getPassw()));
        if (Controlador.getUsuarioInside() != null) {

            JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
            marco.remove(this);
            marco.add(new ProfilePage());
            marco.setVisible(true);
            Controlador.Setimage();
            setearPerfil();
            /*NewBookPage.Barcelona.setVisible(false);
            NewBookPage.Madrid.setVisible(false);
            NewBookPage.Sevilla.setVisible(false);
            NewBookPage.Coruña.setVisible(false);
            NewBookPage.Zaragoza.setVisible(false);
            NewBookPage.Valencia.setVisible(false);
            NewBookPage.Valladolid.setVisible(false);
            NewBookPage.Asturias.setVisible(false);
            NewBookPage.Murcia.setVisible(false);*/
            System.out.println(Controlador.getUsuarioInside());
        } else {
            jTextArea2.setText("Usuario o contraseña incorrectos");
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    public void setearPerfil() {
        ProfilePage.Carga.setVisible(false);
        ProfilePage.Negro.setVisible(false);
        ProfilePage.jButton13.setVisible(false);
        ProfilePage.jLabel3.setVisible(false);
        ProfilePage.jLabel4.setVisible(false);
        ProfilePage.jLabel5.setVisible(false);
        ProfilePage.jLabel6.setVisible(false);
        ProfilePage.jLabel7.setVisible(false);
        ProfilePage.jLabel8.setVisible(false);
        ProfilePage.jLabel9.setText("Credits: " + Controlador.getUsuarioInside().coins);
        ProfilePage.jTextField4.setText("" + Controlador.getUsuarioInside().dni);
        ProfilePage.jTextField3.setText("" + Controlador.getUsuarioInside().name);
        ProfilePage.jTextField5.setText("" + Controlador.getUsuarioInside().surname);
        ProfilePage.jTextField6.setText("" + Controlador.getUsuarioInside().adress);
        ProfilePage.jTextField7.setText("" + Controlador.getUsuarioInside().email);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
