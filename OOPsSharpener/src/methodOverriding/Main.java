package methodOverriding;

class Bank{
    public void RateOfInterest(){
        System.out.println("Generally rate of Bank interest is 5%");

    }
}

class SBI extends Bank{
    @Override
    public  void RateOfInterest(){
        //super.RateOfInterest();
        System.out.println("Rate of interest of SBI is 6.5%");

    }
}

class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        super.RateOfInterest();
        System.out.println("Rate of interest of PNB is 6%");
    }

}

public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();

        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();

    }
}
