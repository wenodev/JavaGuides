public class InstantiateUsingRunnable {
    public static void main(String[] args) {

        System.out.println("Thread main started");

        Thread thread = new Thread(new WorkerThread("Process data through Runnable interface"));
        thread.setName("Demo thread");
        thread.start();

        System.out.println("Thread main finished");

    }
}
