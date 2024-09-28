import java.util.*;
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();

        // insert - 0(1)
        hm.put("india",100);
        hm.put("china",150);
        hm.put("US",50);
        System.out.println(hm);

        // Get  - 0(1)
     //int population = hm.get("india");
      //  System.out.println(population);
        System.out.println( hm.get("india"));

        System.out.println(hm.get("indo"));

        // containsKey  0(1)

        System.out.println(hm.containsKey("india")); // true
        System.out.println(hm.containsKey("indonesia")); // false

        // Remove  0(1)

//        System.out.println(hm.remove("china"));
//        System.out.println(hm);


        // Size

        System.out.println(hm.size());


        // Is Empty

        hm.clear();
        System.out.println(hm.isEmpty());

        // clear








    }
}
