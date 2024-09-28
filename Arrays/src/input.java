import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int [5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=56;
        arr[3]=86;
        arr[4]=100;
        //[23,45,56,86,100]
      //  System.out.println(arr[3]);
        //
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
      //  System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");

       // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();

        }
        System.out.println(Arrays.toString(str));
        }
    }

