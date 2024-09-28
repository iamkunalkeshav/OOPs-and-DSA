public class MinimumNumber  {

//    public static int min(int[] arr){
//        int ans = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]<ans){
//                ans= arr[i];
//
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//    int[] arr = {18,23,-9,23,90};
//        System.out.println(min(arr));
//    }































    public static int mini(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>ans){
                ans = arr[i];
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,-9,4,-2};
        System.out.println(mini(arr));

    }



















}
