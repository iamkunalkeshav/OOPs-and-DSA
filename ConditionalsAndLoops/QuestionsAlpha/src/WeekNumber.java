import java.util.Scanner;

public class WeekNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the week number");
        int wn = sc.nextInt();
        switch (wn){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("you entered the wrong week number");

        }


    }
}
