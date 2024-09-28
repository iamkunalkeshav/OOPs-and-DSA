public class OddEven {
    public static void oddorEven(int n){
        int bitMask = 1;
        if ((n & bitMask)==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(6);
        oddorEven(7);

    }
}
