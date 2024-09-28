public class MaxSubArraySum {
    public static void maxSubArraySum(int numbers[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                currSum += numbers[j];
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArraySum(numbers);


    }
}
