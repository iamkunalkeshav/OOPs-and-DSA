import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(12);
//        list.add(34);
//        list.add(60);
//        list.add(80);
//        list.add(100);
//        list.add(12);
//        list.add(34);
//        list.add(60);
//        list.add(80);
//        list.add(100);
//        list.add(12);
//        list.add(34);
//        list.add(60);
//        list.add(80);
//        list.add(100);

//        System.out.println(list.contains(60));
//        System.out.println(list);
//        list.set(0, 100);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list [index] syntax will not work here

        }
        System.out.println(list);
    }

}