public class ThreadSleepExample {
    public static void main(String[] args) {
        System.out.println("Thread main started : " + Thread.currentThread().getName());


        
        final Thread thread1 = new Thread(new WorkerThread("1"));
        thread1.setName("Worker Thread 1");

        final Thread thread2 = new Thread(new WorkerThread("2"));
        thread2.setName("Worker Thread 2");

        thread1.start();
        thread2.start();



        System.out.println("Thread main finished : " + Thread.currentThread().getName());
    }
}
