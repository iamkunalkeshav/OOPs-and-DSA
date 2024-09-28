import java.util.Stack;

public class StacksRFunn {
    public static void main(String[] args) {

        // Y
        // B
        // R

        Stack<Character> tower = new Stack<>();

        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower.peek());
        System.out.println(tower.contains('k'));
        System.out.println(tower.empty());
        System.out.println(tower.get(2));
        System.out.println(tower.set(1,'P'));
        System.out.println(tower);
        System.out.println(tower.size());

    }
}
