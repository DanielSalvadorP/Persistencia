import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* Clase donde tendremos el CRUD (Create, Read, Update and Delete)
 */
public class MensajeDao {
    public static void createMessageDb(String message, String autor){
        Conexion bdConnection = new Conexion();

        PreparedStatement ps =null;
        try(Connection connection = bdConnection.get_connection()){

            ps.executeQuery("ISERT INTO mensajes (MENSAJE,");

        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Crear");
            throw new RuntimeException(e);
        }
    }

    public static void readMessageDb(){
        Conexion bdConnection = new Conexion();

        PreparedStatement ps = null;
        try(Connection conecction = bdConnection.get_connection()){
            ps.executeQuery("SELECT * FROM mensajes;");
            ps.execute();
            ps.close();
        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Mostrar");
            throw new RuntimeException(e);
        }
    }

    public static void updateMessageDb(int idMessage, String message){
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Actualizar");
            throw new RuntimeException(e);
        }
    }

    public static void deleteMessage(int idMessage){
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al eliminar");
            throw new RuntimeException(e);
        }
    }

}
