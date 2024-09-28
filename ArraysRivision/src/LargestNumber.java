public class LargestNumber {
    // largest number in an Array
    public static int largestNumber(int numbers[]){
        int largest = numbers[0]; // -infinity


        for (int i = 0; i < numbers.length; i++) {
            if (largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int smallestNumber(int numbers[]){
        int smallest = numbers[0]; // -infinity


        for (int i = 0; i < numbers.length; i++) {
            if (smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int numbers[]={1,2,6,3,6};
        System.out.println("Largest array: "+largestNumber(numbers));
        System.out.println("Smallest array: "+smallestNumber(numbers));
        System.out.println("sum of largest and smallest array: "+(largestNumber(numbers)+smallestNumber(numbers)) );
    }
}
