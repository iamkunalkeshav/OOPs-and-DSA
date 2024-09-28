public class bubbleSort {

    public static void bubbleSort(int arr[]) {

    }

        public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {

        int arr[] = {5,-1,-2,0,2,-5};
        bubbleSort(arr);
        printArr(arr);
    }
}