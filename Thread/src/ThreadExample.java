public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Thread main started");

        final Thread thread = new WorkerThread2("Process data using WorkerThread");

        thread.start();
        thread.setName("WorkerThread");

        System.out.println("Thread main finished");
    }


}
