import java.util.*;

public class HashSetImp {
    public static void main(String[] args){
        HashSet <Integer> marks = new HashSet <> ();
        LinkedHashSet<String> teams = new LinkedHashSet <> ();
        TreeSet<Double> freq = new TreeSet <> ();

        //HashSet
        marks.add(45);
        marks.add(50);
        marks.add(38);
        marks.remove(38);

        System.out.println("Size of the set: " + marks.size());
        System.out.println("Does set contain 38: " + marks.contains(38));
        
        Iterator<Integer> it_marks = marks.iterator();
        while (it_marks.hasNext()) {
            System.out.print(it_marks.next() + " "); 
        }
        System.out.println();

        //LinkedHashSet
        teams.add("Spain");
        teams.add("Argetina");
        teams.add("France");
        teams.remove("France");
        teams.add("Scotland");

        System.out.println("Size of the set: " + teams.size());
        System.out.println("Does set contain England: " + teams.contains("England"));
        Iterator<String> it_teams = teams.iterator();
        while (it_teams.hasNext()) {
            System.out.print(it_teams.next() + " "); 
        }
        System.out.println();

        //TreeSet
        freq.add(60.30);
        freq.add(50.50);
        freq.add(98.20);
        freq.add(70.00);

        System.out.println("Size of the set: " + freq.size());
        System.out.println("Does set contain 50.00: " + freq.contains(50.00));
        Iterator<Double> it_freq = freq.iterator();
        while (it_freq.hasNext()) {
            System.out.print(it_freq.next() + " "); 
        }
        System.out.println();


    }
}