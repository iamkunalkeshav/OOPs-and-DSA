public class Solution {

    public static int findSum(int A[], int N) {
        int sum = 0;

        if (N > 0) {
            int min = A[0];
            int max = A[0];

            for (int i = 1; i < N; i++) {
                if (A[i] < min) {
                    min = A[i];
                }
                if (A[i] > max) {
                    max = A[i];
                }
            }
//            System.out.println(min);
//            System.out.println(max);
            sum = min + max;

        }

        return sum;
    }


    public static void main(String[] args) {
        int[] A = { 5, 9, 3, 1, 7 };
        int N = A.length;
        int sum = findSum(A, N);
        System.out.println(sum);

    }
}