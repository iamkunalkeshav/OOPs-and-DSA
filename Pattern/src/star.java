//import java.util.Scanner;
//
//public class star {
//    public static void main(String[] args) {
//        // print star pattern.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int line=1;line<=n;line++){
//            for (int star =1;star<=line;star++){
//
//            System.out.print("*");
//        }
//            System.out.println();
//
//     }
//   }
// }
public class star {
    public static void main(String[] args) {
        for (int line = 1; line<=4 ; line++){
            for (int star=1; star<=line; star++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

