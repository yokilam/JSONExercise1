package nyc.c4q.jsonexercise1;

/**
 * Created by yokilam on 12/10/17.
 */

public class Message {

    private String status;
    private String[] message;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String[] getMessage() {
        return message;
    }
}
