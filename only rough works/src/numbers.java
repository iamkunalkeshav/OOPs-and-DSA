import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>=0){
            System.out.println("it's a positive number");
        }
        else {
            System.out.println("it's a negative number");
        }
    }
}
