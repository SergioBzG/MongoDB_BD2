import java.sql.*;
import java.util.*;

public class ConsultarDatos {
    public static ArrayList consultarDatos(String tabla) throws SQLException {
        ArrayList datosTabla = new ArrayList();

        Connection conn = ConexionOracle.conectar();
        ResultSet resultado;
        Statement sentencia;

        sentencia = conn.createStatement();

        if (tabla.equals("sucursal")){
            try {
                resultado = sentencia.executeQuery("SELECT codigo, nombre FROM sucursal");
                // Se recorren las tuplas retornadas
                while (resultado.next()) {
                    ArrayList entrada = new ArrayList();
                    entrada.add(resultado.getInt("codigo"));
                    entrada.add(resultado.getString("nombre"));
                    datosTabla.add(entrada);
                }
                conn.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (tabla.equals("vendedor")){
            try {
                resultado = sentencia.executeQuery("SELECT codigo, nombre FROM vendedor");
                // Se recorren las tuplas retornadas
                while (resultado.next()) {
                    ArrayList entrada = new ArrayList();
                    entrada.add(resultado.getInt("codigo"));
                    entrada.add(resultado.getString("nombre"));
                    datosTabla.add(entrada);
                }
                conn.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (tabla.equals("cliente")){
            try {
                resultado = sentencia.executeQuery("SELECT codigo, nombre, genero FROM cliente");
                // Se recorren las tuplas retornadas
                while (resultado.next()) {
                    ArrayList entrada = new ArrayList();
                    entrada.add(resultado.getInt("codigo"));
                    entrada.add(resultado.getString("nombre"));
                    entrada.add(resultado.getString("genero"));
                    datosTabla.add(entrada);
                }
                conn.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (tabla.equals("producto")){
            try {
                resultado = sentencia.executeQuery("SELECT codigo, nombre, tipo, marca FROM producto");
                // Se recorren las tuplas retornadas
                while (resultado.next()) {
                    ArrayList entrada = new ArrayList();
                    entrada.add(resultado.getInt("codigo"));
                    entrada.add(resultado.getString("nombre"));
                    entrada.add(resultado.getString("tipo"));
                    entrada.add(resultado.getString("marca"));
                    datosTabla.add(entrada);
                }
                conn.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (tabla.equals("venta")){
            try {
                resultado = sentencia.executeQuery("SELECT codventa, sucursal, vendedor, cliente, producto, nro_unidades FROM venta");
                // Se recorren las tuplas retornadas
                while (resultado.next()) {
                    ArrayList entrada = new ArrayList();
                    entrada.add(resultado.getInt("codventa"));
                    entrada.add(resultado.getInt("sucursal"));
                    entrada.add(resultado.getInt("vendedor"));
                    entrada.add(resultado.getInt("cliente"));
                    entrada.add(resultado.getInt("producto"));
                    entrada.add(resultado.getInt("nro_unidades"));
                    datosTabla.add(entrada);
                }
                conn.close();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return (datosTabla);

    }
}
