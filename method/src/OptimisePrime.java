public class OptimisePrime {
    public static boolean isPrime(int n) {

        if (n ==2){
            return true;
        }

       // boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                //isPrime = false;
                return false;
            }

        }
        return true;
       // return isPrime;
    }

    // to find Prime in Range

public static void PrimeInRange(int n){

        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }

        }
       // System.out.println();
    }

    
    public static void main(String[] args) {
        // prime or not
        System.out.println(isPrime(7));

        // Prime in Range
        PrimeInRange(100);
    }
}
