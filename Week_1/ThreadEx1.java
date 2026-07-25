public class ThreadEx1 implements Runnable {
    
    @Override
    public void run(){
        //int i = 1;
        //for(; ; ){
        //    System.out.println("World" + i);
        //    i++;

        System.out.println("Thread is running");
        for(int i = 1; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println(Thread.currentThread().getName()
                + "Priority" + Thread.currentThread().getPriority() 
                + "Count: " + i );

                try{
                    Thread.sleep(2000);

                }catch(InterruptedException e){
                    System.out.println("Thread Interrupted");
                }
            }
        }
    }

    public static void main(String[] args){
        ThreadEx1 obj = new ThreadEx1();
        ThreadEx1 obj1 = new ThreadEx1();
        ThreadEx1 obj2 = new ThreadEx1();

        Thread tobj = new Thread(obj);
        Thread tobj1 = new Thread(obj1);
        Thread tobj2 = new Thread(obj2);

        tobj.setPriority(Thread.MIN_PRIORITY);
        tobj1.setPriority(5);
        tobj2.setPriority(Thread.MAX_PRIORITY);

        tobj.start();
        tobj1.start();
        tobj1.interrupt();
        tobj2.start();

        //for(; ; ){
        //    System.out.println("Hello");
        //}

    }
}