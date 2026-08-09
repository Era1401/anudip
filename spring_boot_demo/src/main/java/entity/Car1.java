package entity;

public class Car1 {
    //Engine obj = new Engine(); // Tight coupling

    Engine engine; // Loose Coupling

    public Car1(Engine engine){
        this.engine = engine;
    }


}
