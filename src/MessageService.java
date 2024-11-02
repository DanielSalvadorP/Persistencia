import java.util.Scanner;

public class MessageService {

    public static void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mensaje:");
        String message = sc.nextLine();
        System.out.println("Autor:");
        String autor = sc.nextLine();
        MensajeDao.createMessageDb(message, autor);
    }

    public static void read(){
        MensajeDao.readMessageDb();
    }

    public static void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id:");
        int id = Integer.valueOf(sc.nextLine());
        System.out.println("Mensaje:");
        String message = sc.nextLine();
        MensajeDao.updateMessageDb(id, message);
    }

    public static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id");
        int id = sc.nextInt();
        MensajeDao.deleteMessage(id);
    }
}
