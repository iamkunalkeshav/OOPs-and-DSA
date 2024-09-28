public class SumOfFirstFourNonDivisibleIntegers {
    public static void main(String[] args) {
        int[] Array = {2, 3, 5};



        int Count = 0;
        int num = 2;
        int sum = 0;

        while (Count < 4) {
            boolean isDivisible = false;

            for (int i = 0; i < Array.length; i++) {
                int element = Array[i];
                if (num % element == 0) {
                    isDivisible = true;
                    break;
                }
            }

            if (!isDivisible) {
                System.out.print(num + " ");
                sum += num;
                Count++;
            }
            num++;
        }
        System.out.println();
        System.out.println("sum " + sum);

    }

}
