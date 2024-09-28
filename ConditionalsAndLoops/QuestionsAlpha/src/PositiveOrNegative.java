import java.util.Scanner;

public class PositiveOrNegative {
public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int x = sc.nextInt();
    if (x>0){
        System.out.println("its a positive number");
    }
    else {
        System.out.println("its a negative number");
    }
}
}