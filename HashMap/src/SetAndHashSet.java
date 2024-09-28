import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
//        names.add("Walter");
//        names.add("Walter");
//        names.add("Walter");
//        names.add("Walter");
//        names.add("Walter");
//        names.add("Walter");

//        names.remove(0);
//        System.out.println(names.size());
//        System.out.println(names.contains("Walter"));
//        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names);

        for(String name :names){
            System.out.println(name);
        }



    }
}
