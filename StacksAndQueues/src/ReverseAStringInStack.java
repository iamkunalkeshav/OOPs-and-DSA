import java.util.*;

public class ReverseAStringInStack {
    public static String reverseString(String str){

        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (s.size()>0){
            result.append(s.pop());
        }

      return  result.toString();

    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);


    }
}
