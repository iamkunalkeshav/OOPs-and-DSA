public class charAtString {
    public static void printLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName="Kunal";
        String lastName="Keshav";
        String fullName=firstName+" "+lastName;
//        System.out.println(firstName.charAt(0));
        printLetter(fullName);


    }
}
