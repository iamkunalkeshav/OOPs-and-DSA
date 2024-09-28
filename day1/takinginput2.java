import java.sql.SQLOutput;
import java.util.Scanner;

public class takinginput2 {
    public static void main(String[] args) {

//     1.

//     System.out.println("taking input from the user");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("first number");
//        int a = sc.nextInt();
//        System.out.println("second number");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("the sum of these numbers are " +sum);
//          boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.nextLine();
//        System.out.println(str);

//        2.

//       System.out.println("board marks");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Maths");
//        float a = sc.nextFloat();
//        System.out.println("English");
//        float b = sc.nextFloat();
//        System.out.println("Hindi");
//        float c = sc.nextFloat();
//        System.out.println("Science");
//        float d = sc.nextFloat();
//        System.out.println("Social Science");
//        float e = sc.nextFloat();
//        float total = a+b+c+d+e;
//        System.out.println("total marks obtained "+total);
//        float percentage = ((total*100)/500);
//        System.out.println("the percentage of the five subject are "+percentage+"%");
//    }
//}

//        3.

//        System.out.println("enter first number :");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("enter second number :");
//        int b = sc.nextInt();
//        System.out.println("enter third number :");
//        int c = sc.nextInt();
//        int sum = a +b + c;
//        System.out.println("sum of the three numbers are : " +sum);
        System.out.println("Maths");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("English");
        float b = sc.nextFloat();
        System.out.println("Science");
        float c = sc.nextFloat();
        float cgpa =((a+b+c)/30);
        System.out.println("cgpa "+cgpa);
    }
}