import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        ArrayList trin = ConsultarDatos.consultarDatos("sucursal");
        System.out.println(trin);
    }
}
