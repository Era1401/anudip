package entity;

public class AnimalFactory {

    public static Animal getSound(String animal){
        if(animal.equalsIgnoreCase("Lion")){
            return new Lion();
        }
        else if(animal.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        else{
            return new Dog();

        }

    }
}
