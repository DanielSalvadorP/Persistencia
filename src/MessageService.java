import java.util.Scanner;

public class MessageService {

    public static void create() {
        String message = "";
        String autor = "";
        MensajeDao.createMessageDb(message, autor);
    }

    public static void read(){
        MensajeDao.readMessageDb();
    }

    public static void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id");
        int id = Integer.valueOf(sc.nextLine());
        System.out.println();
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
