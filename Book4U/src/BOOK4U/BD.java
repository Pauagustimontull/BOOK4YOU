package BOOK4U;

import java.awt.List;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
            st.setString(1, nombreUsuario);
            st.setString(2, passwordHasheada);

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

    public static Usuario register(Connection con, String name, String email, String password, String dnii, String surname) {
        String sql = "INSERT INTO USUARIO (name, email, password, image, coins, dnii, surname, adress, active) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Usuario usuario = null;
        try (PreparedStatement st = con.prepareStatement(sql)) {
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
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(imagenBytes);
            st.setBinaryStream(1, inputStream, imagenBytes.length);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }
        System.out.println(Controlador.getUsuarioInside().name + ": nom");
        System.out.println(Controlador.getUsuarioInside().password + ": pass");
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

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, dni);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        return usuario;
    }
 public static Usuario update(Connection con, String dni,String name) {

        Usuario usuario = null;
        String sql = "UPDATE USUARIO SET "+name+" = ? WHERE EMAIL = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
           
            st.setString(1, dni);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        return usuario;
    }
 
    public static Usuario shop(Connection con, int mon) {

        Usuario usuario = null;
        String sql = "UPDATE USUARIO SET COINS = ? WHERE EMAIL = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, mon);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        return usuario;
    }

    public static Usuario Search(Connection con, String ciudad) {
        Controlador.apartamentos.clear();
        Usuario usuario = null;
        System.out.println(ciudad);
        String sql = "SELECT * FROM APARTMENT where city = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, ciudad);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    // Crear instancia de Apartamento y establecer sus atributos
                    int id = rs.getInt("ID");
                    String name = rs.getString("NAME");
                    Blob image = rs.getBlob("IMAGE");
                    int price = rs.getInt("PRICE");
                    String place = rs.getString("PLACE");
                    boolean avaliable = rs.getBoolean("AVALIABLE");
                    String cityResult = rs.getString("CITY");
                    int id_owner = rs.getInt("ID_OWNER");

                    Apartamento apartamento = new Apartamento(id, name, image, price, place, avaliable, cityResult, id_owner);

                    // Agregar el objeto Apartamento a la lista
                    Controlador.apartamentos.add(apartamento);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }

        return usuario;
    }

    public static Usuario Imagencasa(Connection con, byte[] imagenBytes, int id) {
        String sql = "UPDATE APARTMENT SET IMAGE = ? WHERE ID = ?";

        Usuario usuario = null;
        try (PreparedStatement st = con.prepareStatement(sql)) {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(imagenBytes);
            st.setBinaryStream(1, inputStream, imagenBytes.length);
            st.setInt(2, id);

            int rowsAffected = st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }
        return usuario;
    }

    public static void insertBooking(Connection con, String dateStr1, String dateStr2, int idApartment, int price, String place) {
 String name = "test";
    int idUser = Controlador.getUsuarioInside().id;
    int idHistoric = 1;
    int paid = 1;
    int status = 1;

    if (Controlador.getUsuarioInside().coins - price > 0) {
        restcoins(Controlador.con, Controlador.getUsuarioInside().coins - price);

        // Verificar disponibilidad
        String checkAvailabilitySql = "SELECT COUNT(*) FROM BOOKING WHERE ID_APARTMENT = ? AND ((DATEE <= ? AND DATES >= ?) OR (DATEE <= ? AND DATES >= ?))";
        try (PreparedStatement checkAvailabilitySt = con.prepareStatement(checkAvailabilitySql)) {
            checkAvailabilitySt.setInt(1, idApartment);

            // Utilizar el formato "dd-MM-yyyy" para la fecha en el select
            DateTimeFormatter formatterSelect = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date1 = LocalDate.parse(dateStr1, formatterSelect);
            LocalDate date2 = LocalDate.parse(dateStr2, formatterSelect);

            // Convertir las fechas al formato de java.sql.Date
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(date1);
            java.sql.Date sqlDate2 = java.sql.Date.valueOf(date2);

            checkAvailabilitySt.setDate(2, sqlDate1);
            checkAvailabilitySt.setDate(3, sqlDate2);
            checkAvailabilitySt.setDate(4, sqlDate1);
            checkAvailabilitySt.setDate(5, sqlDate2);

            ResultSet resultSet = checkAvailabilitySt.executeQuery();
            resultSet.next();
            int existingBookings = resultSet.getInt(1);

            if (existingBookings > 0) {
                // El apartamento está ocupado en las fechas dadas
                NewbookPageCalendar.jTextArea9.setText("El apartamento ya está ocupado en esas fechas. No se puede realizar la reserva.");
            } else {
                String sql = "INSERT INTO BOOKING (NAME, PRICE, ID_USER, PLACE, ID_HISTORIC, DATEE, ID_APARTMENT, PAID, STATUS, DATES) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement st = con.prepareStatement(sql)) {
                    st.setString(1, name);
                    st.setInt(2, price);
                    st.setInt(3, idUser);
                    st.setString(4, place);
                    st.setInt(5, idHistoric);

                    // Utilizar el formato "dd-MM-yyyy" para la fecha en el insert
                    st.setDate(6, sqlDate1);

                    st.setInt(7, idApartment);
                    st.setInt(8, paid);
                    st.setInt(9, status);

                    // Utilizar el formato "dd-MM-yyyy" para la fecha en el insert
                    st.setDate(10, sqlDate2);

                    int rowsAffected = st.executeUpdate();
                    System.out.println("Filas afectadas: " + rowsAffected);
                } catch (SQLException e) {
                    System.out.println("Error en la consulta de inserción: " + e);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar la disponibilidad: " + e);
        }
    } else {
        System.out.println("Error: no hay suficientes monedas");
    }
    }

    public static void Reserva(Connection con) {

        String sql = "SELECT * FROM BOOKING where ID_USER = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, Controlador.getUsuarioInside().id);

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("ID");
                    String name = rs.getString("NAME");
                    double price = rs.getDouble("PRICE");
                    int id_user = rs.getInt("ID_USER");
                    String place = rs.getString("PLACE");
                    int id_historic = rs.getInt("ID_HISTORIC");
                    Date datee = rs.getDate("DATEE");
                    int id_apartment = rs.getInt("ID_APARTMENT");
                    int paid = rs.getInt("PAID");
                    int status = rs.getInt("STATUS");
                    Date dates = rs.getDate("DATES");

                    Reserva reserva = new Reserva(id, name, price, id_user, place, id_historic, datee, id_apartment, paid, status, dates);
                    Controlador.res.add(reserva);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Manejar la excepción según tus necesidades
            
           } 
        }catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        
        }
  
    }
    public static Usuario restcoins(Connection con, int coins ){
     Usuario usuario = null;
        String sql = "UPDATE USUARIO SET COINS = ? WHERE EMAIL = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, coins);
            st.setString(2, Controlador.getUsuarioInside().email);

            int rowsAffected = st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);

        }
        usuario = login(con, Controlador.getUsuarioInside().email, Controlador.getUsuarioInside().password);
        return usuario;
    }
      public static void obtenerApartamentos(Connection con) {
        String sql = "select * from apartment";
        try (PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
             while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                Blob image = rs.getBlob("IMAGE");
                int price = rs.getInt("PRICE");
                String place = rs.getString("PLACE");
                boolean avaliable = rs.getBoolean("AVALIABLE");
                String city = rs.getString("CITY");
                int id_owner = rs.getInt("ID_OWNER");

                // Crear un objeto Apartamento con los datos obtenidos
                Apartamento apartamento = new Apartamento(id, name, image, price, place, avaliable, city, id_owner);

                // Añadir el apartamento a la lista
                
                Controlador.apartamentos.add(apartamento);
            }

        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }
    }
      public static void updateBookingStatus(Connection con, int bookingId, int coins) {
    String sql = "UPDATE booking SET status = 0 WHERE id = ?";

    try (PreparedStatement st = con.prepareStatement(sql)) {
        st.setInt(1, bookingId);

        int rowsAffected = st.executeUpdate();
        System.out.println(rowsAffected + " row(s) updated in booking table.");
        

    } catch (SQLException e) {
        System.out.println("Error en la consulta: " + e);
    }
}

}

   //select * from apartment where city= 'Barcelona';
