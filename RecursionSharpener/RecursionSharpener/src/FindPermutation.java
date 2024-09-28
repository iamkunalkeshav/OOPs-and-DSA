//

import java.util.*;

class FindPermutation {
    public static List<String> find_permutation(String S) {
        ArrayList<String> list = new ArrayList<>();

        solve(S, "", list);

        Collections.sort(list);

        return list;
    }

    public static void solve(String str, String ans, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            String string = str.substring(0, i) + str.substring(i + 1);

            solve(string, ans + c, list);
        }
    }

    public static void main(String[] args) {
        String input = "abc";

        List<String> permutations = find_permutation(input);

        // Print the list of permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
