public class ShuffleTheArrays {
    public static int[] shuffle(int[] nums, int n ){
        int [] arr= new int [2*n];
        int count = 0;
        for (int i = 0; i <n ; i++) {
            arr[count]=nums[i];
            arr[count+1]=nums[i+n];
            count +=2;

            
        }
return arr;
    }
    public static void main(String[] args) {
        int nums[]={2,5,1,3,4,7};
        int res[] = shuffle(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

        }

    }
}
