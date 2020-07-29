package join;

public class ThreadJoinExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Thread main started");

        Task task1 = new Task(500l);
        Task task2 = new Task(1000l);
        Task task3 = new Task(2000l);
        Task task4 = new Task(50l);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.setName("thread-1");
        thread2.setName("thread-2");
        thread3.setName("thread-3");
        thread4.setName("thread-4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("[" + Thread.currentThread().getName() + "] waiting for " + thread1.getName());
//        thread1.join();
        System.out.println(thread1.getName() + " finished! Result: " + task1.getSum());

        System.out.println("[" + Thread.currentThread().getName() + "] waiting for " + thread2.getName());
//        thread2.join();
        System.out.println(thread2.getName() + " finished! Result: " + task2.getSum());

        System.out.println("[" + Thread.currentThread().getName() + "] waiting for " + thread3.getName());
//        thread3.join();
        System.out.println(thread3.getName() + " finished! Result: " + task3.getSum());

        // As thread-4 already finished (smaller sleep time), the join call only immediately
        // returns the control to the caller thread
        System.out.println("[" + Thread.currentThread().getName() + "] waiting for " + thread4.getName());
//        thread4.join();
        System.out.println(thread4.getName() + " finished! Result: " + task4.getSum());

        System.out.println("Thread main finished");

    }

}

