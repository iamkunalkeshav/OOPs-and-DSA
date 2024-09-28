import java.util.Scanner;


public class Percentage {

        public static void main(String[] args) {

        System.out.println("Board marks");
        Scanner Sc = new Scanner(System.in);
        System.out.println("English:");
        Float a = Sc.nextFloat();
        System.out.println("Maths:");
        Float b = Sc.nextFloat();
        System.out.println("physics:");
        Float c = Sc.nextFloat();
        System.out.println("chemistry:");
        Float d = Sc.nextFloat();
        System.out.println("programming:");
        Float e = Sc.nextFloat();
        Float sum = a+b+c+d+e;
        System.out.println("sum:"+sum);
        Float Total = 100*5F;
        System.out.println("Total:" +Total);
        Float percentage=((sum/Total)*100);
        System.out.println("percentage:" +percentage);


    }
}
//    public static void main(String[] args) {
//        System.out.println("board marks");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("English");
//        float a = sc.nextFloat();
//        System.out.println("hindi");
//        float b = sc.nextFloat();
//        float sum = a+b;
//        System.out.println("sum"+sum);
//        float total = 100*2f;
//        System.out.println("total"+total);
//        float percentage = ((sum/total)*100);
//        System.out.println("percentage"+percentage);
//
//    }
//}