public class  kadaneMaxSubArray {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for (int i = 0; i < numbers.length; i++) {
           cs  = cs + numbers[i];
            if (cs<0){
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("our max subarray is :"+ ms);
    }
    
    public static void main(String[] args) {
        int number[]={-2,7,-3,5,-3};
        kadanes(number);
        
    }
}
