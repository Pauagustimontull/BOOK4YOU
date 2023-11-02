package BOOK4U;

import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author Pau
 */
public class BD {

    private static String USER = "23_24_DAM2_CUCOTUCSI";
    private static String PWD = "cucorulo";
    private static String URL = "jdbc:oracle:thin:@oracle.ilerna.com:1521:XE";
    private static String SECOND_URL = "jdbc:oracle:thin:@192.168.3.26:1521:XE"; // Segunda URL (comentada)

    public static Connection makeConnection() {
        System.out.println("Connecting to the database...");
        Connection conn = null;

        try {
            // Intenta la primera URL
            System.out.println("Trying the home URL: ");
            conn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connection established using the home URL!");
        } catch (SQLException e) {
            // Si la primera URL falla, intenta la segunda
            System.out.println("Failed to connect to the the home URL: ");
            System.out.println("Trying the ILERNA URL: ");

            try {
                conn = DriverManager.getConnection(SECOND_URL, USER, PWD);
                System.out.println("Connection established using the ILERNA URL!");
            } catch (SQLException e2) {
                throw new IllegalStateException("Cannot connect to the database!", e2);
            }
        }

        return conn;
    }

    /**
     *
     * @param con
     */
    public static void closeConnection(Connection con) {
        //cierra la conexión
        try {
            con.close();

        } catch (SQLException e) {
            System.out.println("Error closing connection!!" + e);

        }

    }

    public static Usuario login(Connection con, String nombreUsuario, String passwordHasheada) {
        System.out.println(nombreUsuario);
        System.out.println(passwordHasheada);
        Usuario usuario = null;
        String sql = "SELECT * FROM USUARIO WHERE EMAIL = ? AND PASSWORD = ?";

        try ( PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, nombreUsuario);
            st.setString(2, passwordHasheada);

            try ( ResultSet rs = st.executeQuery()) {
                System.out.println(sql);
                if (rs.next()) {
                    usuario = new Usuario(
                            rs.getInt("ID"),
                            rs.getString("NAME"),
                            rs.getString("EMAIL"), // Agrega email al constructor
                            rs.getString("PASSWORD"),
                            rs.getBlob("IMAGE"),
                            rs.getInt("COINS"),
                            rs.getString("DNII"),
                            rs.getString("SURNAME"),
                            rs.getString("ADRESS"),
                            rs.getBoolean("ACTIVE")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }

        return usuario;
    }

    public static Usuario register(Connection con, String name, String email, String password, String dnii, String surname) {
        String sql = "INSERT INTO USUARIO (name, email, password, image, coins, dnii, surname, adress, active) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Usuario usuario = null;
        try ( PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, password);
            st.setString(4, null);
            st.setInt(5, 0);
            st.setString(6, dnii);
            st.setString(7, surname);
            st.setString(8, null);
            st.setBoolean(9, true);

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, email, password);
        return usuario;
    }

    public static Usuario Imagen(Connection con, byte[] imagenBytes) {
        String sql = "UPDATE USUARIO SET IMAGE = ? WHERE EMAIL = ?";

        Usuario usuario = null;
        try ( PreparedStatement st = con.prepareStatement(sql)) {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(imagenBytes);
            st.setBinaryStream(1, inputStream, imagenBytes.length);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }
        System.out.println(Controlador.getUsuarioInside().name+": nom");
        System.out.println(Controlador.getUsuarioInside().password+": pass");
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        System.out.println(usuario.toString());
        Blob blob = usuario.image;
        byte[] imagenByte = null;
        try {
            imagenBytes = blob.getBytes(1, (int) blob.length());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ImageIcon icono = new ImageIcon(imagenBytes);
        ProfilePage.Negro.setVisible(true);
        ProfilePage.Carga.setVisible(true);
        for (int i = 1; i > 0; i--) {
            System.out.println("Quedan " + i + " segundos.");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ProfilePage.jLabel2.setIcon(icono);
        ProfilePage.Negro.setVisible(false);
        ProfilePage.Carga.setVisible(false);
        return usuario;
    }
 public static Usuario dni(Connection con, String dni) {
      
        Usuario usuario = null;
        String sql = "UPDATE USUARIO SET dnii = ? WHERE EMAIL = ?";

        try ( PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dni);
             st.setString(2, Controlador.getUsuarioInside().email);
            

             int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        return usuario;
    }
    }

    /*'SELECT * FROM USUARIO WHERE "PASSWORD" = '470adaa55fab37a1a00db983fcc022a1dbb13fc7361937f36cdc5f14de19f6ce' AND NAME = 'Pau';' */

 /*INSERT INTO USUARIO ( email , ids , keygen , nombre , password1 ) 
values ('admin@admin.com',GENERAID.nextval,'OmoiLl#4fU27epqXg9115','Admin','Admin');*/



/*INSERT INTO USUARIO ( email , ids , keygen , nombre , password1 ) 
values ('admin@admin.com',GENERAID.nextval,'OmoiLl#4fU27epqXg9115','Admin','Admin');*/
