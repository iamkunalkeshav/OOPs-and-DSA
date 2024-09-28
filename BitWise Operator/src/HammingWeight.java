
 public   class HammingWeight {
    public static int hammingWeight(int n){
        int bits =0;
        int mask =1;
        for (int i = 0; i < 32; i++) {
            if ((mask&n)!=0){
                bits++;
            }
           mask<<=1;

        }

        return bits;
    }
     public static void main(String[] args) {
          int n = 11;
         System.out.println(hammingWeight(n));
     }
    }

