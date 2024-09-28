import java.util.Stack;

public class ReverseAStack {

    public static Stack<Integer> reverse(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();

        while (s.size()>0){
            temp.push(s.pop());
        }
        s.addAll(temp);
        return s;
    }
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(reverse(s));


    }
}
