public class OnlineBankAccount {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();

        myAcc.username="Kunal Keshav";
        myAcc.setPassword("hdcbjdkcb");


    }
}

class BankAccount{
     public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}