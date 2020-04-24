package ioc;

public class HelloWorld {

    private String message;

    public HelloWorld(){
        System.out.println("HelloWorld 빈 등록");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("My Message : " + message);
    }


}
