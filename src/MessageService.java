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

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id");
        int id = sc.nextInt();
        MensajeDao.deleteMessage(id);
    }


    public static void editMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id del mensaje a editar");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("mensaje nuevo");
        String newMessage = sc.nextLine();

        MensajeDao.updateMessageDb(id,newMessage);

    }
}
