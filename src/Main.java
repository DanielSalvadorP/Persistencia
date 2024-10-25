//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("----------");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Leer mensaje");
            System.out.println("3. Actualizar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");

            //Leer la opcion que brinda el usuario
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listerMessage();
                    break;
                case 3:
                    MessageService.editMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    System.out.println("Vuelva pronto");
                    break;

            }
        }while(opcion != 5);
        
        /*Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }
}