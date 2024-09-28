import java.util.Scanner;

public class DoubleLetters {
    public static String doubleLetters(String word) {
        StringBuilder doubledWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            doubledWord.append(letter).append(letter);
        }
        return doubledWord.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String result = doubleLetters(word);
        System.out.println("Resultant word: " + result);
        scanner.close();
    }
}
