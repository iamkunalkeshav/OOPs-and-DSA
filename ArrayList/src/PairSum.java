import java.util.ArrayList;

public class PairSum {
    public static boolean sum(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) +list.get(j)==target){
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;
        System.out.println(sum(list,target));
    }
}
