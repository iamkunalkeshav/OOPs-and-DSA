import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArraylist {
    public static void main(String[] args) {
//        ArrayList<String>studentName= new ArrayList<>();
//        studentName.add("Kunal");
//        studentName.add("Kunal");
//        studentName.add("Kunal");
//        System.out.println(studentName);
//
        List<Integer>list1= new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        list1.add(4);
        System.out.println(list1);
        list1.add(1,50);
        System.out.println(list1 );

//        List<Integer> newList = new ArrayList();
//        newList.add(150);
//        newList.add(160);
//        list.addAll(newList);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);


        List<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);

        // for-loop

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("the element is: "+ list.get(i));
//
//
//        }

        // for each loop
//           System.out.println();
//        for( Integer element:list){
//            System.out.println("for each element is "+element);
//        }

        // iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("iterator "+it.next());
        }






        // remove the index
       /* list.remove(1);
        System.out.println(list);

        // remove the element
       // System.out.println(list.remove(Integer.valueOf(30))+""+list);
        list.remove(Integer.valueOf(30));
        */

       /*  list.set(1,1000);
        System.out.println(list);
        System.out.println(list.contains(900));*/
    }
}