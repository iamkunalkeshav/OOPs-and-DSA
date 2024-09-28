public class reverse {

    public static void reverseNum(int nums[]){

        int first = 0;
        int last = nums.length-1;
        while (first<last){

            int temp = nums[last];
            nums[last]= nums[first];
            nums[first]= temp;

            first++;
            last--;
        }

    }


    public static void main(String[] args) {
        int numbers[]={2,4,5,6,8,10};
        reverseNum(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");

        }

    }
}
