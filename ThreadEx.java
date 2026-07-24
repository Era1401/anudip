public class ThreadEx extends Thread{
    @Override
    public void run(){
        int i = 1;
        //for(; ; ){
        //    System.out.println("World" + i);
        //    i++;
        System.out.println("Running");
        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws InterruptedException{
        ThreadEx obj = new ThreadEx();
        System.out.println("New");
        obj.start();
        System.out.println(obj.getState());//Runnable
        Thread.sleep(2000);
        System.out.println(obj.getState());//Timed Waiting
        obj.join();
        System.out.println(obj.getState());//Terminated

        //for(; ; ){
        //    System.out.println("Hello");
        //}
    }
    
}