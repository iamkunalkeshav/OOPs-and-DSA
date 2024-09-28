import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long[] items = new long[20];
        long sum = 0;

        int num, i, temp;
        float tax, total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        num = scanner.nextInt();

        System.out.println("Enter the amount of each item: ");
        for (i = 0; i < num; i++)
            items[i] = scanner.nextLong();

        for (i = 0; i < num; i++) {
            sum += items[i];
        }

        if (sum <= 1000) {
            System.out.println("Total bill with tax is: " + sum);
        } else {
            temp = (int) (sum - 1000);
            tax = 0.01f * temp;
            total = sum + tax;

            System.out.println("Bill amount is: " + sum);
            System.out.println("Tax amount is: " + tax);
            System.out.printf("Total bill amount with tax is: %.2f", total);
        }

       // scanner.close();
    }
}
