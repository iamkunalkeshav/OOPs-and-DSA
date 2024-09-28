import java.util.ArrayList;

class subsets {

    public static void generateSubsets(ArrayList<Integer> A, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < A.size(); i++) {
            current.add(A.get(i));
            generateSubsets(A, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsets(A, 0, current, result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        ArrayList<ArrayList<Integer>> result = subsets(A);

        for (ArrayList<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
