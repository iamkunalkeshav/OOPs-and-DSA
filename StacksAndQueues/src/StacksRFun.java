import java.util.Stack;

public class StacksRFun {
    public static void main(String[] args) {
        Stack<String> games = new Stack<>();

        games.add("Call of duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        // System.out.println(games.pop());

        System.out.println(games.peek()); // Looks at the item on the top of the stack without removing it
        System.out.println(games.pop()); // Removes the item from the top of the stack.
        games.add("spider man");
        System.out.println(games.peek());
    }
}
