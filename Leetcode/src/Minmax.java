public class Minmax {

    public static int findSum(int A[])
    {
        int minimum = A[0]; // Assume the first element is the minimum
        int maximum = A[0]; // Assume the first element is the maximum

        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            if (num < minimum) {
                minimum = num; // Update the minimum if a smaller number is found
            }

            if (num > maximum) {
                maximum = num; // Update the maximum if a larger number is found
            }
        }

        return minimum + maximum; // Return the sum of the minimum and maximum values

    }

    public static void main(String[] args) {
       int A[]= {5,9,3,4,5,6,7,8,9};
        System.out.println(findSum(A));

    }
}