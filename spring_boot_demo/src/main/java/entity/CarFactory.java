package entity;

public class CarFactory {
    public static Car getCar(String type){
        if(type.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        else{
            return new Mercedes();
        }
    }
}
