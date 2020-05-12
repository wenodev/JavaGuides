package weno.di;

public class EmailService implements MessageService{
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
