package methodOverloading;

class OverloadingDemo{
    void sum(int a , int b){
        System.out.println(a+b);

    }
    void sum(int a , int b, int c){
        System.out.println(a+b+c);

    }

    void sum(String a , String b){
        System.out.println(a+b);

    }
}

public class Main {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.sum(5,7);
        obj.sum(5,7,8);
        obj.sum("Kunal ", "Keshav");

    }
}
