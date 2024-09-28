import java.util.Scanner;

public class DecreasingNumber {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        // int n = 10;
        printDec(n);
    }
}


