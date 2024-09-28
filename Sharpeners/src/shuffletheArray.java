class shuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i * 2] = nums[i];           // Place element from the first half at an even index
            arr[i * 2 + 1] = nums[i + n];   // Place element from the second half at the next odd index
        }
        return arr;
    }

    public static void main(String[] args) {
        shuffletheArray solution = new shuffletheArray();

        // Example test case
        int[] nums = {2, 5, 1, 3, 4, 7}; // Input array
        int n = 3;                       // n is half the length of the array

        int[] result = solution.shuffle(nums, n);

        // Print the result
        System.out.print("Shuffled array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
