public class LLRecursion {
    public static void displayR(Node head){
        if (head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);


    }

    public static void displayRev(Node head){
        if (head==null) return;
        displayRev(head.next);
        System.out.print(head.data+" ");


    }
    public static void display(Node head){
         Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    public static class Node {
        int data ;
        Node next;

        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(5);
       Node b = new Node(6);
       Node c = new Node(7);
       Node d = new Node(8);

        a.next = b;
        b.next= c;
        c.next= d;

        display(a);
        System.out.println();
        displayR(a);
        System.out.println();

        displayRev(a);
        System.out.println();

        System.out.println(length(a));

    }

    private static int length(Node head) {
        int count=0;
        Node temp = head;
        while (temp!=null){
            count ++;
        temp = temp.next;
        }
        return count;
    }
}
