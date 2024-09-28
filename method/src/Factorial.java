import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int f= 1;

        for (int i = 1; i <=n; i++) {
            f = f*i;

        }
        return f;
    }
    public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int  binCoeff = fact_n / (fact_r*fact_nmr);
        return binCoeff;
    }
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum (int a, int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println(binCoeff(5,2));
        System.out.println(sum(3,5,6));
        System.out.println(sum(3,5));
    }

}
