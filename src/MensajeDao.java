import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
* Clase donde tendremos el CRUD (Create, Read, Update and Delete)
 */
public class MensajeDao {
    public static void createMessageDb(String message, String autor){
        Conexion bdConnection = new Conexion();

        try(Connection connection = bdConnection.get_connection()){
            PreparedStatement ps=connection.prepareStatement("insert into mensajes (MENSAJE, AUTOR_MENSAJE,FECHA_MENSAJE) values (?, ?, CURRENT_TIMESTAMP);");
            ps.setString(1,message);
            ps.setString(2,autor);
            ps.execute();
            ps.close();
        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Crear");
            throw new RuntimeException(e);
        }
    }

    public static void readMessageDb(){
        Conexion bdConnection = new Conexion();

        try(Connection conecction = bdConnection.get_connection()){
            PreparedStatement ps = conecction.prepareStatement("SELECT * FROM mensajes;");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Id:" + rs.getString("ID_MENSAJE"));
                System.out.println("Mensaje:" + rs.getString("MENSAJE"));
                System.out.println("Autor:" + rs.getString("AUTOR_MENSAJE"));
                System.out.println("Fecha:" + rs.getString("FECHA_MENSAJE"));
            }
            ps.close();
        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Mostrar");
            throw new RuntimeException(e);
        }
    }

    public static void updateMessageDb(int idMessage, String message){
        Conexion bdConnection = new Conexion();

        try(Connection connection = bdConnection.get_connection()){
            PreparedStatement ps = connection.prepareStatement("UPDATE mensajes SET MENSAJE = ? WHERE ID_MENSAJE = ?;");
            ps.setString(1,message);
            ps.setInt(2,idMessage);
            ps.execute();
            ps.close();
            System.out.println("Actualizado");
        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al Actualizar\n");
            throw new RuntimeException(e);
        }
    }

    public static void deleteMessage(int idMessage){
        Conexion bdConnection = new Conexion();
        try(Connection connection = bdConnection.get_connection()){
            PreparedStatement ps = connection.prepareStatement("DELETE FROM mensajes WHERE ID_MENSAJE = ?");
            ps.setInt(1,idMessage);
            ps.execute();
            ps.close();
            System.out.println("Eliminado\n");

        }catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error al eliminar");
            throw new RuntimeException(e);
        }
    }

}
