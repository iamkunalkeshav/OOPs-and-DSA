package ATMMACHINE;

import java.util.Scanner;

public class ATMMachine {
    int pin= 5674;
    float balance;

    ATMMachine(){

        System.out.println("Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin==pin){
            System.out.println();
            Menu();
        }
        else {
            System.out.println("invalid pin");
            new ATMMachine();
        }

    }

    public void Menu() {
        System.out.println("Enter Your Option");
        System.out.println();
        System.out.println("1.Check your  Balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();


        if (option==1){
            System.out.println("your balance "+balance);
            Menu();
        }
        else if (option==2){
          withdraw();

        }

        else if (option==3){
            deposit();
        }
        else if (option==4) {
            System.out.println("Thank You , BYE");
            return;
        }
    }

    public void deposit() {

        System.out.println("Enter Amount to deposit");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        float deposit = sc.nextFloat();
        System.out.println("deposit successfully"+deposit);
        balance = balance+deposit;
        Menu();

    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount>balance){
            System.out.println("insufficient balance");
            Menu();
        }
        else {

            System.out.println(amount + "   withdrawn successfully");
            balance = balance-amount;
            Menu();

        }
    }

    public static void main(String[] args) {
        ATMMachine ATM = new ATMMachine();
    }
}

