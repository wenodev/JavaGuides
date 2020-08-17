package interrupt;

public class TerminateTaskUsingThreadAPI {

    public static void main(String[] args) {

        System.out.println("Thread started");

        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());

        thread1.setName("THREAD-1");
        thread2.setName("THREAD-2");

        thread1.start();
        thread2.start();
        thread1.interrupt();

        System.out.println("Thread finished");
    }
}
