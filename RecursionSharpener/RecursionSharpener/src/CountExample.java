public class CountExample {
    public static void main(String[] args) {
        System.out.println(count(1)); // Print the output
    }

    public static int count(int i) { // Function count
        if (i == 5) { // Stop when i is 5 or greater
            return 0;
        } else {
            return i + count(i + 3); // Recursive call
        }
    }
}
