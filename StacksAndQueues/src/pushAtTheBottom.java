import java.util.*;

public class pushAtTheBottom {
    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
        } else {
            // Remove all elements from the stack and store them in a temporary stack
            Stack<Integer> tempStack = new Stack<>();
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }

            // Push the new element at the bottom of the original stack
            stack.push(element);

            // Push all elements back from the temporary stack to the original stack
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack: " + stack);

        insertAtBottom(stack, 4);

        System.out.println("Stack after inserting 0 at the bottom: " + stack);
    }
}
