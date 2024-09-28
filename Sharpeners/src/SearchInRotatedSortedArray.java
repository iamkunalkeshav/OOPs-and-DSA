public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int [] nums = {4,5,6,7,0,1,2};
        int target =0;

        int res = search(nums,target);

        System.out.println(res);

    }

    private static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int mid;

        while (start<=end){
            mid = (start+end)/2;
            if (target==nums[mid]){
                return mid;
            }
            else if (nums[mid]>=nums[start]){
                if (nums[mid]>= target && nums[start]<=target){
                    end= mid-1;
                }
                else {
                    start= mid+1;
                }
            }
            else {
                if (target>=nums[mid] && target<=nums[end]){
                    start = mid+1;
                }
                else {
                    end= mid-1;
                }
            }


        }


        return -1;
    }
}
