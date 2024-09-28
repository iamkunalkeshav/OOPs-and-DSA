import java.util.Scanner;

public class FactorOfNumber {
    public static void factor() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        factor();


    }

}

