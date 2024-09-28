public class IncreasingNumber {
    public static void increNum(int n){
        if(n==1){
            System.out.print(n+"  ");
            return;
        }
        increNum(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 10;
        increNum(n);
    }
}
