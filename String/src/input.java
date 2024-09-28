import java.util.Scanner;

public class input {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");

        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String fullName ="Kunal Keshav";
//        System.out.println(fullName.length());
        String firstName ="Kunal";
        String LastName ="Keshav";
        String fullName =firstName+" "+ LastName;

         printLetters(fullName);
    }
}
