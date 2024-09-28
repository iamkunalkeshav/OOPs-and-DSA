public class basicsLL {


    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static class Node{
     int data ;
     Node next;



     Node(int data){
         this.data = data;
//         this.next= null;
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


//        Node temp = a;

//        for (int i = 1; i <=4; i++) {
//            System.out.println(temp.data);
//            temp = temp.next;
//
//        }

//        while (temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }


        display(a);


  





    }
}