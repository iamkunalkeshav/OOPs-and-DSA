public class MinFinder {
    public static int findMin(int num, int d) {
        int rem = num % d;
        int n2 = d - rem;
        int result = 0;
        result = (rem < n2) ? (num - rem) : (num + n2);
        return result;
    }

    public static void main(String[] args) {
        int num = 17;
        int d = 5;
        int minValue = findMin(num, d);
        System.out.println("Minimum value: " + minValue);
    }
}