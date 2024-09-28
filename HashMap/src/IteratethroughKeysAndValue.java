import java.util.HashMap;

public class IteratethroughKeysAndValue {
    public static void main(String[] args) {


        // Iterate through  Keys


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println();

       // Iterate through  Value

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");

        for (Integer key : map2.keySet()) {
            System.out.println("Key: " + key);
        }


    }
}