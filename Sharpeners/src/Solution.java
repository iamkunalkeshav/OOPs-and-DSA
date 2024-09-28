import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {9,10,8};
        System.out.println(totalSwaps(nums)); // Output should be 2
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int totalSwaps(int[] nums) {
        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        int swaps = 0;
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the correct position, continue
            if (nums[i] != numsSorted[i]) {
                // Perform a swap
                int correctIndex = hm.get(numsSorted[i]);
                swap(nums, i, correctIndex);

                // Update the map after the swap
                hm.put(nums[correctIndex], correctIndex);
                hm.put(nums[i], i);

                swaps++;
            }
        }
        return swaps;
    }
}
