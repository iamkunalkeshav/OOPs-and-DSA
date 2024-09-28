import java.util.Scanner;

public class ArraysCreation {
    public static void main(String[] args) {
      float marks[]= new float[100];

        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextFloat(); //phy
        marks[1]=sc.nextFloat(); //chem
        marks[2]=sc.nextFloat(); //math

        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math:"+marks[2]);

//        marks[2]=marks[2]+1;
//        System.out.println("math: "+marks[2]);
        float percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+ percentage);
        System.out.println("arrays length :   "+marks.length);

    }
}