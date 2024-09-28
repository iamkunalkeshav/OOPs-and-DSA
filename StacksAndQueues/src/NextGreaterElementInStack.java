import java.util.Stack;

public class NextGreaterElementInStack {
    public static void nextGreater(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {

            //1 while
            while (s.size()>0 && arr[s.peek()]<= arr[i]){
                s.pop();
            }

            // 2 if else

            if (s.size()==0){
                nxtGreater[i]= -1;
            } else {
                nxtGreater[i]= arr[s.peek()];
            }

            // push

            s.push(i);
            
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");

        }
        System.out.println();
        
    }


    public static void main(String[] args) {
        int arr[] ={8,7,6,1,9,13};

        nextGreater(arr);

    }


}
