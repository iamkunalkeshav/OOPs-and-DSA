import java.util.Scanner;
public class rough {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tempInCelsius = sc.nextInt();

            //Write your code here and print the required output

            int F = ((tempInCelsius*9)/5)+32;

            System.out.println(F);
        }
    }


