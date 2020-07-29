package join;

public class Task implements Runnable{

    private long sleep;
    private int sum;

    public Task(final long sleep){
        this.sleep = sleep;
    }

    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " Adding " + i);
            sum += i;
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getSum(){
        return this.sum;
    }


}
