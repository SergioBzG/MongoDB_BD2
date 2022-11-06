import java.sql.*;

public class ConexionOracle {
    public static Connection conectar() {
        Connection conn = null;
        System.out.println("Conectando a la base de datos...");
        try { // Cargar el driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
        }

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@SP-INTEL-240-DECIMA:1522:xe", "jruedat", "sagitario10");
        } catch (Exception e) {
            System.out.println("No hay conexion con la base de datos");
        }
        return (conn);
    }
}