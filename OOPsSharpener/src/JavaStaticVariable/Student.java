package JavaStaticVariable;

//public class Student {
//    int roll_no;
//    String name;
//    String college ="XYZ University";
//
//    public static void main(String[] args) {
//
//        Student std1 = new Student();
//        std1.roll_no=1;
//        std1.name="kunal";
//        System.out.println(std1.name+" "+std1.roll_no +" "+ std1.college);
//
//
//    }
//}

public class Student {
    int roll_no;
    String name;
   static String college ="XYZ University";

    public static void main(String[] args) {

        Student std1 = new Student();
        std1.roll_no=1;
        std1.name="kunal";
        System.out.println(std1.name+" "+std1.roll_no +" "+ college);


    }
}



