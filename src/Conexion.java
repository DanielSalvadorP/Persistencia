import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection connection = null;
        try {
            // Cadena de conexión
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mensajes_app?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF-8",
                    "root", // Usuario
                    ""      // Contraseña (vacía)
            );
            if (connection != null) {
                System.out.println("Conexión Exitosa");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir error de conexión
        }
        return connection; // Retornar la conexión
    }
}
