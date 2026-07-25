import java.util.*;
public class TreeMapImp {
    public static void main(String[] args){
        TreeMap <Integer, String> map = new TreeMap <> ();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}