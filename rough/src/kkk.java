
import java.util.*;

public class kkk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        char ch = 'A'; // Start character

        for (int i = 1; i <= n; i++) { // Rows
            for (int j = 0; j < i && ch <= 'Z'; j++) { // Columns
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
