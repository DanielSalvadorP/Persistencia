/*
*int id_message = id_mensaje;
    String message = mensaje;
    String autorMessage = autor_mensaje;
    String dateMessage = fecha_mensaje;
 */
public class Message {
    int id_message;
    String message;
    String autorMessage;
    String dateMessage;

    public Message(){
    }

    public Message(String message, String autorMessage, String dateMessage) {
        this.message = message;
        this.autorMessage = autorMessage;
        this.dateMessage = dateMessage;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAutorMessage() {
        return autorMessage;
    }

    public void setAutorMessage(String autorMessage) {
        this.autorMessage = autorMessage;
    }

    public String getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }
}
