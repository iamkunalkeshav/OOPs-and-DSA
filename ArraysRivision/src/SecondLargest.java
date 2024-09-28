import java.util.Arrays;

public class SecondLargest {
    public static int print2largest(int arr[]) {
        // code here
        Arrays.sort(arr);
        int max = arr.length-1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] != max) {
                return arr[i];
            }
        }

        return -1;

    }


    public static void main(String[] args) {
        int arr[] = {7, 3, 5, 8, 9, 3};
        //print2largest(arr,n);
        int secondLargest= print2largest(arr);
        System.out.println(secondLargest);
    }
}
