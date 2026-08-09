package entity;

public class Principal {
    private static Principal principle = new Principal();
    private Principal(){}

    public static Principal getInstance(){
        return principle;
    }
}
