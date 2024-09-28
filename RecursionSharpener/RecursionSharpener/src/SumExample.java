public class SumExample {
    public static void main(String[] args) {
        int sum = 0;  // To store the sum of numbers
        int n = 5;    // You can set this to any number manually

        // Loop from i = 0, increasing by 2, until i < 10
        for (int i = 0; i < 10; i = i + 2) {

            // If i equals n, break out of the loop
            if (i == n) {
                break;
            }

            // Add the current value of i to the sum
            sum = sum + i;
        }

        // Print the final sum
        System.out.println(sum);  // Output the result
    }
}
