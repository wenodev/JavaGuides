public class ThreadPriorityExample {

    public static void main(String[] args) {

        final Runnable runnable = () ->{
            System.out.println("Running thread name : " + Thread.currentThread().getName() + "and it's priority : " + Thread.currentThread().getPriority());
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
