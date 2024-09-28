import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[]args){
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue.poll()); // remove and return the top element
        System.out.println(queue); // print the array

        System.out.println(queue.peek()); // return the element which is on top and can be removed in first
        System.out.println(queue);
        queue.add(2);
        System.out.println(queue );
    }

}
