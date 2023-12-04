/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOOK4U;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alumnat
 */
public class ShopPage extends javax.swing.JPanel {

    boolean selected = false;
    byte[] imageData = null;

    public ShopPage() {
        initComponents();
        Carga.setVisible(false);
        boton_paypal.setVisible(false);
        base_paypal.setVisible(false);
        User_Paypal.setVisible(false);
        password_paypal.setVisible(false);
        jButton16.setVisible(false);
        User_Paypal1.setVisible(false);
        jLabel9.setText("Credits: " + Controlador.getUsuarioInside().coins);
        jLabel10.setText(Controlador.getUsuarioInside().name);

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
        jButton16 = new javax.swing.JButton();
        password_paypal = new javax.swing.JPasswordField();
        User_Paypal1 = new javax.swing.JTextField();
        User_Paypal = new javax.swing.JTextField();
        base_paypal = new javax.swing.JLabel();
        Carga = new javax.swing.JLabel();
        boton_paypal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        base_paypal.setText(String.valueOf(Controlador.getCont()));
        jLabel12 = new javax.swing.JLabel();
        base_paypal.setText(String.valueOf(Controlador.getCont()));
        jLabel11 = new javax.swing.JLabel();
        base_paypal.setText(String.valueOf(Controlador.getCont()));
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
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

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pay.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusPainted(false);
        jButton16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pay_hover.png"))); // NOI18N
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pay_hover.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, 360, 80));

        password_paypal.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        password_paypal.setForeground(new java.awt.Color(102, 102, 102));
        password_paypal.setText("password");
        password_paypal.setBorder(null);
        password_paypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_paypalMouseClicked(evt);
            }
        });
        password_paypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_paypalActionPerformed(evt);
            }
        });
        add(password_paypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 350, 40));

        User_Paypal1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        User_Paypal1.setForeground(new java.awt.Color(0, 153, 255));
        User_Paypal1.setBorder(null);
        User_Paypal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_Paypal1MouseClicked(evt);
            }
        });
        User_Paypal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_Paypal1ActionPerformed(evt);
            }
        });
        add(User_Paypal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 440, 30));

        User_Paypal.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        User_Paypal.setForeground(new java.awt.Color(102, 102, 102));
        User_Paypal.setText("E-Mail");
        User_Paypal.setBorder(null);
        User_Paypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User_PaypalMouseClicked(evt);
            }
        });
        User_Paypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_PaypalActionPerformed(evt);
            }
        });
        add(User_Paypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 350, 30));

        base_paypal.setForeground(new java.awt.Color(102, 102, 102));
        base_paypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paypal.png"))); // NOI18N
        add(base_paypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 600, 620));

        Carga.setForeground(new java.awt.Color(102, 102, 102));
        Carga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/03-42-15-221_512.gif"))); // NOI18N
        Carga.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                CargaComponentHidden(evt);
            }
        });
        add(Carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 210, 240));

        boton_paypal.setForeground(new java.awt.Color(102, 102, 102));
        boton_paypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/negro.png"))); // NOI18N
        add(boton_paypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2200, 1080));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel13.setText("Cost: 0 €");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 480, 240, 60));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel12.setText("0");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setAutoscrolls(true);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 400, 140, 60));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel11.setText("Value: 10€");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 240, 60));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Credits:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 980, 400, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel8.setText("SHOP");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 770, 120, 50));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BOOKING DETAILS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 380, 50));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NEW BOOKING");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 310, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BOOKING HISTORY");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 400, 50));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROFILE");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 180, 50));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/flecha.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 70, 80));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sidebar.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2200, 1080));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Buy.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Buy_hover.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Buy_hover.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 740, 460, 90));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mas.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusPainted(false);
        jButton15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mas_hover.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 410, 40, 40));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menos.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menos_hover.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, 30, 40));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu (1).png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 60));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOut.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOut_hover_big.png"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOut_hover.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 20, 60, 70));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 30, 310, 50));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shop.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2200, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Controlador.setUser(null);
        System.out.println(Controlador.getUser());
        JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new PanelBase());
        marco.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CargaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CargaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaComponentHidden

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton13.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new NewBookPage());
        marco.setVisible(true);
        NewBookPage.jLabel9.setText("Credits: " + Controlador.getUsuarioInside().coins);
        NewBookPage.Barcelona.setVisible(false);
        NewBookPage.Madrid.setVisible(false);
        NewBookPage.Sevilla.setVisible(false);
        NewBookPage.Coruña.setVisible(false);
        NewBookPage.Zaragoza.setVisible(false);
        NewBookPage.Valencia.setVisible(false);
        NewBookPage.Valladolid.setVisible(false);
        NewBookPage.Asturias.setVisible(false);
        NewBookPage.Murcia.setVisible(false);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(Controlador.getCont()>0){
            Controlador.setCont(Controlador.getCont() - 1);
        jLabel12.setText(String.valueOf(Controlador.getCont()));
        jLabel13.setText("Cost: " + Controlador.getCont() * 10 + " €");
        }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Controlador.setCont(Controlador.getCont() + 1);
        jLabel12.setText(String.valueOf(Controlador.getCont()));
        jLabel13.setText("Cost: " + Controlador.getCont() * 10 + " €");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Carga.setVisible(true);
        boton_paypal.setVisible(true);

        for (int i = 2; i > 0; i--) {
            System.out.println("Quedan " + i + " segundos.");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        base_paypal.setVisible(true);
        User_Paypal.setVisible(true);
        User_Paypal1.setVisible(true);
        if (Controlador.cont < 0) {
            int pos = Math.abs(Controlador.cont);
            User_Paypal1.setText("Are you going to make a transaction with the refund of " + pos + "0 €?");
        } else {
            User_Paypal1.setText("Are you going to make a transaction with the amount of " + Controlador.cont + "0 €?");

        }
        password_paypal.setVisible(true);
        jButton16.setVisible(true);

// Luego, en el manejador de eventos para mostrar el cuadro de diálogo:

    }//GEN-LAST:event_jButton10ActionPerformed

    private void password_paypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_paypalMouseClicked
        password_paypal.setText("");
    }//GEN-LAST:event_password_paypalMouseClicked

    private void password_paypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_paypalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_paypalActionPerformed

    private void User_PaypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_PaypalMouseClicked
        User_Paypal.setText("");
    }//GEN-LAST:event_User_PaypalMouseClicked

    private void User_PaypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_PaypalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_PaypalActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        boton_paypal.setVisible(false);
        Carga.setVisible(false);
        for (int i = 2; i > 0; i--) {
            System.out.println("Quedan " + i + " segundos.");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        Controlador.setUsuarioInside(BD.shop(Controlador.con, Controlador.getUsuarioInside().coins + Controlador.cont));
        jLabel9.setText("Credits: " + Controlador.getUsuarioInside().coins);
        base_paypal.setVisible(false);
        User_Paypal.setVisible(false);
        User_Paypal1.setVisible(false);
        User_Paypal1.setText("");
        password_paypal.setVisible(false);
        jButton16.setVisible(false);
        jLabel12.setText("0");
        jLabel13.setText("Cost: 0 €");
        Controlador.cont = 0;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void User_Paypal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_Paypal1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_User_Paypal1MouseClicked

    private void User_Paypal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_Paypal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_Paypal1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new ProfilePage());
        marco.setVisible(true);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new UserHistory());
        marco.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed
    public void carga10() {

        int segundos = 5;
        BD.Imagen(Controlador.con, imageData);

        for (int i = segundos; i > 0; i--) {
            System.out.println("Quedan " + i + " segundos.");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Controlador.Setimage();
        Carga.setVisible(false);
        boton_paypal.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Carga;
    private javax.swing.JTextField User_Paypal;
    private javax.swing.JTextField User_Paypal1;
    public static javax.swing.JLabel base_paypal;
    public static javax.swing.JLabel boton_paypal;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton16;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password_paypal;
    // End of variables declaration//GEN-END:variables
}
