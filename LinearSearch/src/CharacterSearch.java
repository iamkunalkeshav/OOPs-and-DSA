import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Ask the user to enter a character to search for
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Call a method to search for the character in the string
        int index = searchCharacter(inputString, searchChar);

        if (index != -1) {
            System.out.println("The character '" + searchChar + "' was found at index " + index);
        } else {
            System.out.println("The character '" + searchChar + "' was not found in the string.");
        }

        scanner.close();
    }

    // Method to search for a character in a string
    public static int searchCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i; // Character found, return its index
            }
        }
        return -1; // Character not found
    }
}
