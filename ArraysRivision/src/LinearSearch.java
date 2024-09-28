public class LinearSearch {

    public static int linearSearch(String Menu[], String key){
        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i]==key){
                return i;
            }

        }
      return -1;
    }

    public static void main(String[]args){
     //int numbers[]={2,4,6,8,10,12,14,16};
        String Menu[]={"mango","apple","grapes","banana"};
        String key = "grapes";
        int index = linearSearch(Menu,key);
        System.out.println(index+" : "+ key);

        //int key = 10;
//        int index = linearSearch(numbers,key);
//        System.out.println("key is at index: "+index);
    }

}
