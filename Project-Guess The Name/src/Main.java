import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = ((int) (Math.random() * 1000) + 1);
        int noOfGuesses = 10;
        do {
            System.out.println("guess the number");
            int in = sc.nextInt();
            if (in == guess) {
                System.out.println("sab changa ji");
                break;
            }
            if (--noOfGuesses ==0){
                System.out.println("bade bhai aap haar gye");
            }
            if (in > guess)
                System.out.println("thoda chota socho");
            else
                System.out.println("thora bada socho bade bhai");
        }
        while (true);

    }
}