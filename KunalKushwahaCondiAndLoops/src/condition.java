import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expression T or F){
        //body
        }else{
        //do this
         */
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
//        int salary = 25400;
//        if(salary>10000) {
//            salary += 2000;
//        } else {
//            salary+=1000;
//        }

        //multiple if-else
        if (salary>10000){
            salary+=2000; // salary = salary + 2000
        } else if (salary>20000) {
            salary += 3000;
        } else {
           salary+=1000;
        }

        System.out.println(salary);
    }
}
