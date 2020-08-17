public class ThreadGroupExample {
    public static void main(String[] args) {

        final Runnable runnable1 = ()->{
            System.out.println("Runnable One");
        };

        final Runnable runnable2 = ()->{
            System.out.println("Runnable Two");
        };

        final Runnable runnable3 = ()->{
            System.out.println("Runnable Three");
        };

        final Runnable runnable4 = ()->{
            System.out.println("Runnable Four");
        };

        final ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");

        final Thread thread1 = new Thread(threadGroup, runnable1, "ThreadOne");
        final Thread thread2 = new Thread(threadGroup, runnable2, "ThreadTwo");
        final Thread thread3 = new Thread(threadGroup, runnable3, "ThreadThree");
        final Thread thread4 = new Thread(threadGroup, runnable4, "ThreadFour");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        threadGroup.list();

    }
}
