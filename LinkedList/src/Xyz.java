import java.util.Scanner;

public class Xyz {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");

        int num = scanner.nextInt();

        long[] items = new long[num];

        System.out.println("Enter the amount of each item: ");
        for (int i = 0; i < num; i++)
            items[i] = scanner.nextLong();

        calculateBill(items);
    }

    private static void calculateBill(long[] items) {
        long sum = 0;
        for (long item : items) {
            sum += item;
        }

        if (sum <= 1000) {
            System.out.println("Total bill with tax is: " + sum);
        } else {
            int temp = (int) (sum - 1000);
            float tax = 0.01f * temp;
            float total = sum + tax;

            System.out.println("Bill amount is: " + sum);
            System.out.println("Tax amount is: " + tax);
            System.out.printf("Total bill amount with tax is: %.2f%n", total);
        }
    }
}