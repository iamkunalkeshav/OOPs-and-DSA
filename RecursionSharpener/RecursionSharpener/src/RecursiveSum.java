public class RecursiveSum {

    public static int recursiveSum(int i, int n, int sum) {
        if (i == n || i >= 10) {
            return sum;
        }


        return recursiveSum(i + 2, n, sum + i);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = recursiveSum(0, n, 0);
        System.out.println(sum);
    }
}
