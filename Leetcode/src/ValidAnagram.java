import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement character counts for the second string
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false; // If the character is not in the map or count is zero, it's not an anagram
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
//        ValidAnagram solution = new ValidAnagram();
//        String s = "anagram";
//        String t = "nagaram";
//        boolean result = solution.isAnagram(s, t);
//        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result); // Output: true
        ValidAnagram solution = new ValidAnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean result = solution.isAnagram(s,t);
        System.out.println(result);
    }
}
