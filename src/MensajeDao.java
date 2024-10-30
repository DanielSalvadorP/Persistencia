import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
* Clase donde tendremos el CRUD (Create, Read, Update and Delete)
 */
public class MensajeDao {
    public static void createMessageDb(Message message){
        Conexion dbConnect = new Conexion();
        try(Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query="INSERT INTO mensajes (MENSAJE, AUTOR_MENSAJE, FECHA_MENSAJE) VALUES (?,?,CURRENT_TIMESTAMP);";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2,message.getAutorMessage());
                ps.executeUpdate();
                System.out.println("Done");
            }catch (SQLException e){
                System.out.println(e);
            }
        }
        catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public static void readMessageDb() {
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()) {
            String query = "SELECT * FROM mensajes;";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_MENSAJE"));
                System.out.println("Mensaje: " + rs.getString("MENSAJE"));
                System.out.println("Autor: " + rs.getString("AUTOR_MENSAJE"));
                System.out.println("Fecha: " + rs.getString("FECHA_MENSAJE"));
                System.out.println("");
            }

        } catch (SQLException e) {
            System.out.println("Ups!");
            System.out.println(e);
        }
    }
    public static void updateMessageDb(int idMessage, String newMessage){
        Conexion dbConnect = new Conexion();

        try(Connection connection = dbConnect.get_connection()){
            //String query = "UPDATE mensajes SET MENSAJE = ? WHERE ID_MENSAJE = ?;";
            //ps=connection.prepareStatement(query);
            PreparedStatement ps = connection.prepareStatement("UPDATE mensajes SET MENSAJE = ? WHERE ID_MENSAJE = ?;");

            ps.setString(1,newMessage);
            ps.setInt(2, idMessage);
            ps.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void deleteMessage(int id){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;

        try(Connection connection = dbConnect.get_connection()){
            String query = "DELETE FROM mensajes WHERE ID_MENSAJE = ?;";
            ps= connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Mensaje borrado");

            readMessageDb();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
