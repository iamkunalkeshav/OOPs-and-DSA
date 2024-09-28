import java.util.ArrayList;
import java.util.Arrays;  // Import Arrays to use Arrays.asList()

public class dsaExam1 {
    public static int runningSumOrGreater(ArrayList<Integer> arr, int target) {
        int runningSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            runningSum += arr.get(i);
            if (runningSum >= target) {
                return runningSum;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
        System.out.println(runningSumOrGreater(arr1, 3)); // Output: 4

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3, 4, 10, 15, 64));
        System.out.println(runningSumOrGreater(arr2, 45)); // Output: 96
    }
}
