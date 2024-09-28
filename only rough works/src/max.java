import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextByte();
        int y = sc.nextByte();
        int z = sc.nextByte();
        if (x >= y && x >= z){
            System.out.println(x + " is the largest number");

        } else if (y>=x && y>=z) {

            System.out.println(y + " is the largest number");
        }
                else

            System.out.println(z+ " is the largest number");
        }


            }



