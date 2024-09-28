public class SubArrays {
    //bruteforce
    public static void maxSubarraySum(int arr[]) {
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                largestSum = Math.max(largestSum, currSum);
            }
        }

        System.out.println("max subarray sum is : " + largestSum);
    }


    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        //maxSubarraySum(arr);
   maxSubarraySum(numbers);

    }
}
