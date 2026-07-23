import java.util.*;
public class HashMapImp{

    public static void main(String[] args){
        HashMap <Integer, String> hm = new HashMap <> ();
        hm.put(1, "Argentina");
        hm.put(2, "Spain");
        hm.put(3, "France");
        hm.put(4, "England");
        hm.putifAbsent(5, "Portugal");
        
        hm.remove(3);

        System.out.println("Item at key 2: " + hm.get(2));
        System.out.println("Hashmap size: " + hm.size());
        System.out.println("HashMap is empty: " + hm.isEmpty());

        System.out.println("\n" + "Keys: ");
        hm.forEach((key, value) -> System.out.print(key + " "));

        System.out.println("\n" + "Values: ");
        hm.forEach((key, value) -> System.out.print(value + " "));

        System.out.println("\n");
        hm.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}