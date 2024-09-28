import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        System.out.println("enter your salary");
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        if (salary >= 40000 && salary <= 50000) {
            System.out.println("SDE3");
        }
        else if (salary <= 39000 && salary >= 30000) {
                System.out.println("SDE2");

            } else if (salary <= 29000 && salary >= 20000) {
                System.out.println("SDE1");
            }
        else
            System.out.println("error");
        }
    }
