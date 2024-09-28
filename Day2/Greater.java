package Day2;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        if(a+b > 20) {
            System.out.println("x + y is greater than 20");
        }
        else{
            System.out.println("ye ky kr rha tu");
        }

    }
}
