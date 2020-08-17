package interrupt;

public class Task implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + "  Message : " + i);

            if (Thread.interrupted()){
                System.out.println("This thread was interruped by someone calling this Thread.interrupt()");
                System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
                System.out.println("After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
                break;
            }


        }
    }
}
