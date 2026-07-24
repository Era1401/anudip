public class ThreadEx1 implements Runnable {
    @Override
    public void run(){
        int i = 1;
        for(; ; ){
            System.out.println("World" + i);
            i++;
        }
    }

    public static void main(String[] args){
        ThreadEx1 obj = new ThreadEx1();
        Thread obj1 = new Thread(obj);
        obj1.start();

        for(; ; ){
            System.out.println("Hello");
        }

    }
}