public class RecursionOutput {
    public static void main(String[] args) {
        System.out.println(count(1)); // Function call to print the output
    }

    public static int count(int i) { // This is the function
        if (i > 5) {
            return 0; // Base case: return 0 if i is greater than 5
        } else {
            return i * count(i + 1); // Recursive case: multiply i by the result of count(i + 1)
        }
    }
}
