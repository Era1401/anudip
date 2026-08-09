package entity;

public class Diesel implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine");
    }
}
