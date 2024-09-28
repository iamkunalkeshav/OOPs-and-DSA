public class missingArrays {
    public int missing_element(int[] nums) {
        int n = nums.length + 1; // Correct length should include the missing number
        int total = (n * (n + 1)) / 2; // Sum of first n natural numbers
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 4, 5};
        missingArrays ma = new missingArrays();
        int missing = ma.missing_element(number);
        System.out.println("The missing number is: " + missing);
    }
}
