public class Recursion {
    static void printHello(int n){
        if (n==0){
            return;
        }
        System.out.println("hello");
         printHello(n-1);
    }
    public static void main(String[] args) {
        printHello(5);
    }
}
