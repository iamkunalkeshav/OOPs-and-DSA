import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage");
        double percentage =sc.nextDouble();
        char grade;
        if (percentage>=90) {
            grade = 'A';
        } else if (percentage>=80) {
            grade = 'B';
        } else if (percentage>=70) {
            grade = 'C';
        }
        else {
            grade = 'D';
        }
        System.out.println("grade"+grade);
    }

}
