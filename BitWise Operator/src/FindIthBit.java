public class FindIthBit {
    public static int findIthBit(int number, int i) {
        // Right shift the number by i bits and then AND with 1
        return (number >> i) & 1;
    }

    public static void main(String[] args) {
        int number = 29; // Example number in binary: 11101
        int i = 3; // Let's find the 3rd bit (0-based index)

        int ithBit = findIthBit(number, i);
        System.out.println( ithBit);
    }
}
