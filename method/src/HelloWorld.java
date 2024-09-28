import java.util.*;
public class HelloWorld {
//    public static void PrintHelloWorld() {
//        System.out.println("hello world");
//        System.out.println("hello world");
//        System.out.println("hello world");
//    }
public static int  calculateSum(int x, int y){ // parameters or formal parameter

    int sum = x+y;

    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     int sum = calculateSum(a,b); // arguments or actual parameters
        System.out.println("sum is: "+sum);



    }

}

