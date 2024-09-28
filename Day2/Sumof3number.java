package day2;
import java.util.Scanner;

public class Sumof3number {
    public static void main(String[] args) {
        System.out.println("first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("2nd number");
        int b = sc.nextInt();
        System.out.println("3rd number");
        int c = sc.nextInt();
        int sum = (a+b+c);
        System.out.println("sum of three numbers are:"+sum);



    }
}