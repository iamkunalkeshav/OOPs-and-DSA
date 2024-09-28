public class LargNum {
        public static int largNum(int num[]){
        int larg = num[0];
       for (int i = 0; i < num.length; i++) {
            if (num[i]>larg){
                larg = num[i];
            }
        }
        return larg;
    }
    public static int smallNum(int num[]){
        int small = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]<small){
                small = num[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};

        System.out.println(largNum(num)+smallNum(num));
    }
}
