
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fesco
 */
public class ConexionBD {

    private static String usuario = "root";
    private static String pass = "admin";
    private static String bd = "libreria";

    public static Connection obtenerConexion() {
        Connection con = null;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
         

            String urlConexion = "jdbc:mysql://localhost:3306/" + bd + "?serverTimezone=UTC";
            con = DriverManager.getConnection(urlConexion, usuario, pass);
            System.out.println("Conexion establecida " + bd);
        } catch (Exception ex) {
            System.out.println("Conexion con problemas " + bd);
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
