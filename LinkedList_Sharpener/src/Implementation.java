public class Implementation {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;  // Corrected: Set tail here when head is assigned for the first time.
            } else {
                tail.next = temp;
                tail = temp;  // Corrected: Update tail when a new node is added at the end.
            }
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;  // Corrected: Also set the tail if the list was empty.
            } else {
                temp.next = head;
                head = temp;  // Corrected: Directly set the head to the new node.
            }
            size++;
        }

        public void insert(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return;
            }

            if (idx == 0) {
                insertAtBeginning(val);  // Corrected: Insert at beginning if index is 0.
                return;
            }

            if (idx == size) {
                insertAtEnd(val);  // Corrected: Insert at end if index equals the size.
                return;
            }

            Node t = new Node(val);
            Node temp = head;

            // Corrected: Loop to stop one step before the insert position
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;  // Insert the new node in the middle.
            temp.next = t;

            size++;
        }

        public int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong index");
                return -1;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {  // Corrected: Proper traversal to get to the index.
                temp = temp.next;
            }

            return temp.data;
        }

        public void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;  // Corrected: Update tail if list becomes empty after deletion.
                }
                size--;
                return;
            }

            Node temp = head;

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;  // Corrected: Update tail if the last node was deleted.
            }

            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(6);

        System.out.println("Initial List:");
        ll.display();

        ll.insertAtBeginning(10);
        System.out.println("After inserting 10 at the beginning:");
        ll.display();

        ll.insert(2, 70);
        System.out.println("After inserting 70 at index 2:");
        ll.display();

        ll.deleteAt(2);
        System.out.println("After deleting node at index 2:");
        ll.display();

        ll.deleteAt(0);
        System.out.println("After deleting node at index 0:");
        ll.display();

        System.out.println("Final Tail Value: " + ll.tail.data);
        System.out.println("Final Size: " + ll.size);
    }
}
