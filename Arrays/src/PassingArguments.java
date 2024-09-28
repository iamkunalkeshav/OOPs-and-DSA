public class PassingArguments {
    public static void update(int marks[], int nonchangeble){
        nonchangeble = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }

 public static void main (String[]args){
     int marks[]={97,98,99};
     int nonchangeble = 5;
     System.out.println(nonchangeble);
     update(marks, nonchangeble);
     for (int i = 0; i < marks.length; i++) {
         System.out.println(marks[i]);
     }
 }
}
