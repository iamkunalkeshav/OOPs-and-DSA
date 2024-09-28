import java.util.HashMap;
import java.util.Set;

public class iterationOnHashMap {
    public static void main(String[] args) {
        int max =0;
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("Nepal", 5);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys) {

            System.out.println("key: "+k+  ", "+"value: "+hm.get(k));
        }
    }
}
