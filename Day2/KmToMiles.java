package Day2;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("enter the km");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float value = a * 0.6f;
        System.out.println("the miles are " +value+ " miles ");


    }
}
