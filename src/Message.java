/*
*int id_message = id_mensaje;
    String message = mensaje;
    String autorMessage = autor_mensaje;
    String dateMessage = fecha_mensaje;
    *
    * Clase constructora
 */
public class Message {
    int idMessage;
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

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
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
