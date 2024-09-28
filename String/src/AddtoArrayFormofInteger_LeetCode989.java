public class AddtoArrayFormofInteger_LeetCode989 {
    public static int ArrayToString(int [] num){
        StringBuilder sb = new StringBuilder();

        for(int digit:num){
            sb.append(digit);
        }

        return (int) Long.parseLong(sb.toString());


    }
    public static void main(String[] args) {

        int [] arr = {123,234};
        System.out.println(ArrayToString(arr));

    }
}
