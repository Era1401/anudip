import java.util.*;
public class LinkedHM {
    public static void main(String[] args){
        LinkedHashMap <Integer, Integer> count = new LinkedHashMap<> ();
        count.put(1, 2);
        count.put(2, 1);
        count.put(3, 4);
        count.put(4, 2);
        count.remove(3);

        System.out.println("4th item: " + count.get(4));
        System.out.println("Size of Linked HashMap: " + count.size());
        count.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}