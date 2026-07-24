public class ThreadEx2 extends Thread{
    @Override
    public void run(){
        for (int i = 0 ; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.yield();
        }
    }

    public static void main(String[] args){
        ThreadEx2 obj1 = new ThreadEx2();
        ThreadEx2 obj2 = new ThreadEx2();

        obj1.start();
        obj2.start();
    }
}