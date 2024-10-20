//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}