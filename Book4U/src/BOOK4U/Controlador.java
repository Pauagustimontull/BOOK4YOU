/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOOK4U;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
/**
 *
 * @author Pau
 */
public class Controlador {
   private static boolean selected = false;
   private static String user = "";
   private static String passw = "";
   private static Usuario usuarioInside = null;
   public static Connection con;
    public static Usuario getUsuarioInside() {
        return usuarioInside;
    }

    public static void setUsuarioInside(Usuario usuarioInside) {
        Controlador.usuarioInside = usuarioInside;
    }
   
    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Controlador.user = user;
    }

    public static String getPassw() {
        return passw;
    }

    public static void setPassw(String passw) {
        Controlador.passw = hashPassword(passw);
        //System.out.println(Controlador.passw);
    }
   
    public static boolean isSelected() {
        return selected;
    }

    public static void setSelected(boolean selected) {
        Controlador.selected = selected;
    }

   
    public static String hashPassword(String password) {
        try {
            // Crear una instancia de MessageDigest con el algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Obtener el arreglo de bytes de la contraseña
            byte[] passwordBytes = password.getBytes(StandardCharsets.UTF_8);

            // Calcular el hash
            byte[] hash = digest.digest(passwordBytes);

            // Convertir el hash a una representación en hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
  
   
}
