import java.util.*;
import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

//        ll.add(12);
//        ll.add(2);
//        ll.add(32);
//        ll.set(2,50);
      // System.out.println(ll);



        getTimeDiff(ll);
        getTimeDiff(al);


    }
    static void getTimeDiff(List<Integer>list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() +" "+ (end-start));
    }
}

