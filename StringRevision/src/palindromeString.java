import java.util.Scanner;

public class palindromeString {

    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {

           if (str.charAt(i)!=str.charAt(n-1-i)){

               return false;
           }

        }


        return true;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         String str = sc.next();
        System.out.println(isPalindrome(str));
    }
}
