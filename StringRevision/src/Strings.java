import java.util.Scanner;

public class Strings {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {


/*        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new string ("xyz");
        //String
        Scanner sc = new Scanner(System.in);
        String name;
      name=  sc.nextLine();
        System.out.println(name);*/

//        String fullName= "Tony Stark";
//        System.out.println(fullName.length());
        String firstName ="Kunal";
        String lastName ="Keshav";
        String fullName = firstName+" "+lastName;
        //System.out.println(fullName.charAt(6));
        printLetters(fullName);


    }
}