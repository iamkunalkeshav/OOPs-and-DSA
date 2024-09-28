public class func_overloading {
    // function to calculate sum of 2 numb
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    //function to calculate sum of 3 numbs
//    public static int sum(int a, int b ,int c){
//        return a+b+c;
//
//    }
    // function to calculate int sum
    public static int sum(int a, int b ){
        return a+b;

    }
    // function to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.5f,5.6f));
    }
}
