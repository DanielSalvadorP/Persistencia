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
        System.out.println("Opciones");
        option = sc.nextInt();
        do {
            switch (option) {
                case 1:
                case 2:
                case 3:
                case 4:

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