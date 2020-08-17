public class WorkerThread implements Runnable{

    private String name;

    public WorkerThread(final String name){
        this.name = name;
    }

    @Override
    public void run() {

        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + "   data = " + name + " message num : " + i);
        }
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
