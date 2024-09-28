
import java.util.*;
public class sharpenerPattern
{

    public static void print_pattern()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }



        /* Do not change the code beyond this point*/
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       // int n = sc.nextInt();
        print_pattern();
    }
}