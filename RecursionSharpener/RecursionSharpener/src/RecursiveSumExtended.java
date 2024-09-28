public class RecursiveSumExtended {


        // Recursive function to calculate the sum of even numbers
        private static int recursiveSum(int i, int n, int sum) {
            if (i == n || i >= 10) {
                return sum;
            }
            return recursiveSum(i + 2, n, sum + i);
        }

        // Wrapper method for better readability
        public static int calculateSum(int n) {
            return recursiveSum(0, n, 0); // Initialize with i=0 and sum=0
        }

        public static void main(String[] args) {
            int n = 5; // You can set n to any value
            int sum = calculateSum(n); // Clean method call
            System.out.println(sum); // Output the result
        }
    }

