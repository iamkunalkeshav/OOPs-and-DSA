package Day2;

import java.util.Scanner;

public class ElseifElseGreaterLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        if(a+b < 20) {
            System.out.println("x + y is less than 20");
        }
        else if (a+b == 20){
            System.out.println("equal ");
        }
        else {
            System.out.println("error");
        }

    }
}

