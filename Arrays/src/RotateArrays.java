public class RotateArrays {
    public static void rotate(int[] numb, int k) {
        k %= numb.length;
        int n = numb.length;
        reverseNum(numb,0,n-1);
        reverseNum(numb,0,k-1);
        reverseNum(numb,k,n-1);
    }
    public static void reverseNum(int[] numb, int start, int end) {
        while(start < end) {
            int temp = numb[start];
            numb[start] = numb[end];
            numb[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int numb[]={2,4,5,73,};
        int k = 1;
        rotate(numb,k);
        for (int i = 0; i < numb.length; i++) {
            System.out.println(numb[i]);

        }
    }

    }



