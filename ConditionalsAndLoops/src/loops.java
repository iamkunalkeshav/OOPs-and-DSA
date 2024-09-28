import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // Q. Print number from 1 to 5
      /*

      syntax of for loops;
      for(initialisation; condition; increment/decrement) {
      // body

       }

       */
        // q: print numbers from 1 to 5
//         for (int num = 1; num <= 5; num+=1) {
//
//            System.out.println(num);
//
//        }
         //print numbers from 1 to n
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        for (int num=1; num<=n; num++){
         System.out.println(num);
            System.out.println("hello world" );
        }
    }
}