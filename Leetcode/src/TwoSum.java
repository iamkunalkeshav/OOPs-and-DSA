public class TwoSum {
    public static int[] twoSum(int[] num, int target){

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]+num[j]==target){
                    return new int []{i,j};
                }


            }

        }
        return new int[]{-1, -1};


    }
    public static void main(String[] args) {
        int num[] ={2,3,4,5,6};
       int target=7;
     int result[]=twoSum(num,target);
        System.out.println(result[0]+result[1]);
    }

}
