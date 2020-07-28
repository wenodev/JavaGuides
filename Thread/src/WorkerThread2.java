public class WorkerThread2 extends Thread{
    private String anyData;

    public WorkerThread2(final String anyData){
        this.anyData = anyData;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + "  data="+this.anyData + " Message " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }



}
