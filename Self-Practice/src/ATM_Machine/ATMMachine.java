package ATM_Machine;

import java.sql.SQLOutput;
import java.util.Scanner;

class ATM{
    int PIN= 5674;
    Float Balance=0.0f;

    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin: ");
        int enteredPin = sc.nextInt();

        if (enteredPin==PIN){
            Menu();
        }
        else {
            System.out.println("Enter the valid PIN");
            checkPin();
        }

    }

    public void Menu() {
        System.out.println("Enter your Choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();

        if(Choice==1){
            checkBalance();
        }
        else if (Choice==2){
            withdrawMoney();
        }
        else if(Choice==3){
            moneyDeposit();
        }
        else if (Choice==4){
            return;

            }
        }

    public void checkBalance() {
        System.out.println("Your Balance: " + Balance);
        Menu();
    }

    public void withdrawMoney() {
       Scanner sc = new Scanner(System.in);
       float amount = sc.nextFloat();
       if(amount>Balance){
           System.out.println("Insufficient Balance");
    }
           Menu();
       }


public void moneyDeposit(){
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance = amount+Balance;
    System.out.println("Deposit Successfully");
    Menu();

}




}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}
