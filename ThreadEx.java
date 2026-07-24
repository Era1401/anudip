public class ThreadEx extends Thread{
    @Override
    public void run(){
        int i = 1;
        for(; ; ){
            System.out.println("World" + i);
            i++;
        }
    }

    void main(String[] args){
        ThreadEx obj = new ThreadEx();
        obj.start();

        for(; ; ){
            System.out.println("Hello");
        }
    }
    
}