
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Fruit = sc.next();
        switch (Fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");
        }
    }
}
