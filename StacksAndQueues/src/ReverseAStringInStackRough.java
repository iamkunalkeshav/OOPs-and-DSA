import javax.xml.stream.events.StartDocument;
import java.util.Stack;

public class ReverseAStringInStackRough {

    public static String reverseTheString(String str){

        str = str.toLowerCase(); //
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            s.push(str.charAt(i));

        }


        StringBuilder sb = new StringBuilder();
        while (s.size()>0){
            sb.append(s.pop());
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        String str = "HelloWorld";
        String result = reverseTheString(str);

        System.out.println(result);



    }
}
