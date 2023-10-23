
package BOOK4U;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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

    try (PreparedStatement st = con.prepareStatement(sql)) {
        st.setString(1, "pau@pau.com");
        st.setString(2, "470adaa55fab37a1a00db983fcc022a1dbb13fc7361937f36cdc5f14de19f6ce" );

        
        try (ResultSet rs = st.executeQuery()) {
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



/*'SELECT * FROM USUARIO WHERE "PASSWORD" = '470adaa55fab37a1a00db983fcc022a1dbb13fc7361937f36cdc5f14de19f6ce' AND NAME = 'Pau';' */

/*INSERT INTO USUARIO ( email , ids , keygen , nombre , password1 ) 
values ('admin@admin.com',GENERAID.nextval,'OmoiLl#4fU27epqXg9115','Admin','Admin');*/
}


/*INSERT INTO USUARIO ( email , ids , keygen , nombre , password1 ) 
values ('admin@admin.com',GENERAID.nextval,'OmoiLl#4fU27epqXg9115','Admin','Admin');*/