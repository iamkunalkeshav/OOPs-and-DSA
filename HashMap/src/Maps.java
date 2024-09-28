import java.sql.SQLOutput;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIDs = new HashMap<>();
        empIDs.put("John",12345);
        empIDs.put("Carl",54321);
        empIDs.put("Jerry",8675309);

        System.out.println(empIDs);

        System.out.println(empIDs.get("Carl"));

        System.out.println(empIDs.containsKey("George"));
        System.out.println(empIDs.containsValue(54321));

        empIDs.put("John", 98765);
        System.out.println(empIDs);
        empIDs.replace("Jerry", 764);
        System.out.println(empIDs);

        empIDs.replace("Kramer",777);
        System.out.println(empIDs);

        empIDs.putIfAbsent("Steve",9999);
        System.out.println(empIDs);

        empIDs.remove("Steve");
        System.out.println(empIDs);

    }
}