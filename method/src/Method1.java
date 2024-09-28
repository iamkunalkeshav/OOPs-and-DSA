import java.util.Scanner;

//import java.util.Scanner;
//
//public class Method1 {
//    public static int PrintHelloWorld(){
//        System.out.println("hello world");
//
//        return 3;
//    }
//    public static void calculateSum(int num1, int num2){
//
//        int sum = num1+ num2;
//        System.out.println("sum is : "+ sum);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//         calculateSum(a,b);
//
//
//    }
//
//
public class Method1 {
    public static int calculateSum(int num1, int num2 ){

        int sum = num1 +num2;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum  = calculateSum( sc.nextInt(),sc.nextInt());
        System.out.println(sum);


    }
}