public class ProductOfArrayExceptSelf {

    public static int[] product(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    pro *= nums[j];
                }
            }
            ans[i] = pro;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] result = product(arr);

        // Printing the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
