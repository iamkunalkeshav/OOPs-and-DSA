//import java.util.Scanner;
//
//public class reverse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////       int n =10899;
//        while ( n>0){
//            int lastDigit = n% 10; //n/=10;
//            System.out.print(lastDigit+ " ");
//            n=n/10; //n/10
//        }
////        System.out.println();
//    }
//}
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int n = 123;
        while (n>0){
            int LastDigit= n%10;
            System.out.print(LastDigit);
            n = n/10;
        }
    }
}