public class LargestSmallest {
    public  static int largest(int arr[]){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> largest){
                largest = arr[i];

            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={6,3,5,2,7,2};
        largest(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
