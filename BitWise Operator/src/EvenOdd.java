public class EvenOdd {

    public static void evenOdd(int n){
        if ((n&1)==1){
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }


    public static void main(String[] args) {

        evenOdd(6700007);

    }
}
