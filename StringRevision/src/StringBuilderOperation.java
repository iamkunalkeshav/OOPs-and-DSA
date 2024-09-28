public class StringBuilderOperation {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
            // abcdefghijklmnopqrstuvwzyz
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}