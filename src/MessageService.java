import java.util.Scanner;

public class MessageService {
    public static void  createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mensaje:");
        String message = sc.nextLine();

        System.out.println("Tu nombre");
        String name = sc.nextLine();

        System.out.println();

        Message register = new Message();
        register.setMessage(message);
        register.setAutorMessage(name);
        MensajeDao.createMessageDb(register);
    }

    public static void listerMessage(){
        MensajeDao.readMessageDb();
    }

    public static void deleteMessage(){}

    public static void editMessage(){}
}
