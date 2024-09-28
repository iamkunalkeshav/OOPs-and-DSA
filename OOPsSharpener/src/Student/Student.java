package Student;

import java.util.Scanner;

public class Student {
    String name;
    int roll_no;

    public void printdata(){
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name ="Kunal";
        std1.roll_no = 50;
       std1.printdata();

       Student std2 = new Student();
       std2.name = "Keshav";
       std2.roll_no = 20;
       std2.printdata();

        Student std3 = new Student();



//        Scanner sc = new Scanner(System.in);
//       Student std3 = new Student();
//       std3.name = sc.nextLine();
//       std3.roll_no = sc.nextInt();
//       std3.printdata();

    }
}
