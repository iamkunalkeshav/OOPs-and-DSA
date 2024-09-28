import java.util.Arrays;

public class FirstAndLastOccu {

    // Method to find the first and last occurrences of the target
    public static int[] element_search(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1; // Initialize to -1 to indicate the target is not found
        arr[1] = -1; // Initialize to -1 to indicate the target is not found

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1) {
                    arr[0] = i; // First occurrence of the target
                }
                arr[1] = i; // Last occurrence of the target
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 4, 5};
        int target = 3;

        int[] res = element_search(num, target);
        System.out.println(Arrays.toString(res)); // Print the result as a string
    }
}
