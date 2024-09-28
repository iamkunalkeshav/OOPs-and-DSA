import java.util.Arrays;
public class concatenationOfArray {

        public static int[] getConcatenation(int[] nums) { // Change return type to int[]
            int n = nums.length;
            int[] result = new int[2 * n];

            for (int i = 0; i < n; i++) {
                result[i] = nums[i];
                result[i + n] = nums[i];
            }

            return result; // Return the result array
        }

        public static void main(String[] args) {
            int[] num = {1, 2, 3};
            int[] result = getConcatenation(num); // This method now returns an int[]

            System.out.println(Arrays.toString(result));  // Output: [1, 2, 3, 1, 2, 3]
        }
    }


