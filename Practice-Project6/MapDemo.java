package Maps;
import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // map

        // HashMap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Tim");
        hm.put(2, "Mary");
        hm.put(3, "Catie");

        System.out.println("\nThe elements of HashMap are ");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // HashTable

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(4, "Ales");
        ht.put(5, "Rosy");
        ht.put(6, "Jack");
        ht.put(7, "John");

        System.out.println("\nThe elements of HashTable are ");
        for (Map.Entry<Integer, String> n : ht.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }


        // TreeMap

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(8, "Annie");
        map.put(9, "Carlotte");
        map.put(10, "Catie");

        System.out.println("\nThe elements of TreeMap are ");
        for (Map.Entry<Integer, String> l : map.entrySet()) {
            System.out.println(l.getKey() + " " + l.getValue());
        }
    }
}

