import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;  // Current repeat count

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If digit, update the repeat count

                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current count and current string to their respective stacks
                countStack.push(k);
                resultStack.push(current);
                // Reset for the next part
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Decode the current segment
                StringBuilder decodedPart = current;
                current = resultStack.pop();  // Get the previous string
                int repeatTimes = countStack.pop();  // Get the repeat count
                // Append the decoded part 'repeatTimes' times
                while (repeatTimes-- > 0) {
                    current.append(decodedPart);
                }
            } else {
                // Regular character, just append to current string
                current.append(ch);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        String result = ds.decodeString("50[a2[c]]");
        System.out.println(result);  // Output: accaccacc
    }
}
