public class PrimeOrNot {
//    public static boolean isPrime(int n){
//      boolean isPrime = true;
//        for (int i = 2; i<=n-1 ; i++) {
//            if (n%i ==0){
//                isPrime = false;
//
//            }
//        }
//        return isPrime;
 //   }
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void primesInRange(int n){
        for (int i = 2; i <=n ; i++) {
            if (isPrime(i)){
                System.out.println(i+"");
            }
        }
       // System.out.println();
    }
    public static void main(String[] args) {
        //  System.out.println(isPrime(16));
      primesInRange(100); // 2 to 20
    }
}
