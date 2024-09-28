import com.sun.source.tree.StatementTree;

import java.util.Scanner;

public class Main {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[]={'a', 'b', 'c', 'd'};
//        String str ="abcd";
//        String str2 = new String("xyz");
//        //System.out.println(str2);
//        //String are immutable
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);

//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        //concatenation
        String firstName = "Kunal";
        String lastName  = "Keshav";
        String fullName = firstName+" "+lastName;
printLetters(fullName);
    }

}