public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

   // public static void printArr(int arr[]){
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print (arr[i]+" ");
//
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,2,5,20,6,2,3};
           bubbleSort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print (arr[i]+" ");

        }
        System.out.println();
//printArr(arr);

    }

}
