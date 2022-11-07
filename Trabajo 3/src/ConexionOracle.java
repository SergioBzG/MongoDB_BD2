import java.sql.*;

public class ConexionOracle {
    private static final String HOST = "DESKTOP-9VLDUT1";
    private static final String PORT = "1521";
    private static final String USER = "cassandra";
    private static final String PASSWORD = "pi3141592";
    public static Connection conectar() {
        Connection conn = null;
        System.out.println("Conectando a la base de datos...");
        try { // Cargar el driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
        }

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + HOST +":" + PORT + ":xe", USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("No hay conexion con la base de datos");
        }
        return (conn);
    }
}