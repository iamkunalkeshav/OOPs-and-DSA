import java.util.Scanner;

class Subject{
    int max = 100;
    int obtd;
}
public class Percentage2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       Subject s1 = new Subject();
        System.out.println("enter maths marks:");
        s1.obtd = scn.nextInt();
        Subject s2 = new Subject();
        System.out.println("enter science marks");
        s2.obtd = scn.nextInt();
        Subject s3 = new Subject();
        System.out.println("enter the english marks");
        s3.obtd = scn.nextInt();
        Subject s4 = new Subject();
        System.out.println("enter the social science marks");
        s4.obtd = scn.nextInt();
        Subject s5 = new Subject();
        System.out.println("enter the hindi marks");
        s5.obtd = scn.nextInt();
        int Total = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        System.out.println("total marks"+Total);
        int per =(Total*100/500);
        System.out.println("percentage obtained:"+per);
    

    }
}