/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOOK4U;

import static BOOK4U.ProfilePage.Carga;
import static BOOK4U.ProfilePage.Negro;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Pau
 */
public class Controlador {
    public static ArrayList<Apartamento> apartamentos = new ArrayList<>();
     public static ArrayList<Reserva> res = new ArrayList<>();
    private static boolean selected = false;
    private static String user = "";
    private static String passw = "";
    private static Usuario usuarioInside = null;
    public static Connection con;
    public static int cont = 0;

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Controlador.cont = cont;
    }

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

    public static String hash(String pass) {
        return hashPassword(pass);
    }

    public static void Setimage() {
        Blob blob = usuarioInside.image;
        byte[] imagenBytes = null;
        try {
            imagenBytes = blob.getBytes(1, (int) blob.length());
        } catch (SQLException e) {
            e.printStackTrace();
        }

// Convierte los datos binarios en un ImageIcon
        ImageIcon icono = new ImageIcon(imagenBytes);

// Asigna el ImageIcon al JLabel
        ProfilePage.jLabel2.setIcon(icono);

    }
    public static Blob buscar(int in){
       
Apartamento apartamentoEncontrado = null;

for (Apartamento apartamento : Controlador.apartamentos) {
    
    if (apartamento.id == in) {
        apartamentoEncontrado = apartamento;
    
        break;  // Terminamos el bucle una vez que encontramos el apartamento
    }
}
        
return apartamentoEncontrado.getImage();
    }
public static boolean esDNIValido(String dni) {
        // Expresión regular para un DNI español (8 dígitos seguidos de una letra)
        String regex = "\\d{8}[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        // Comprobar si la cadena coincide con la expresión regular
        return matcher.matches();
    }
}
