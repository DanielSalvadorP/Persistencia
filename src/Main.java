//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 5) {

            System.out.println(" ----Opciones----");
            System.out.println("1. Crear\n"+
                                "2. Leer\n"+
                    "3. Actualizar\n"+
                    "4. Eliminar");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    MessageService.create();
                    break;
                case 2:
                    MessageService.read();
                    break;
                case 3:
                    MessageService.update();
                    break;
                case 4:
                    MessageService.delete();
                    break;
                case 5:
                    System.out.println("La buena rey");
                default:

            }
        }while(option != 5);

    }

    /*Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

    }catch (SQLException e) {
        throw new RuntimeException(e);
    }*/

}