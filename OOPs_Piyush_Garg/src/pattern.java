
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i && ch <= 'Z'; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


    }
}
