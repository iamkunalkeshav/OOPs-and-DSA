class Car{
    String model;
    String color;
    String mode;
    int price;

    Car(){ // Constructor
        System.out.println("creating object");
    }

    void drift(){
        System.out.println(model+" supports drift");
    }
}

public class Vehicals {
    public static void main(String[] args) {
        System.out.println("start");
        Car mahindra = new Car();
        System.out.println("start");
        Car Tata = new Car();

        mahindra.model= "safari";
        mahindra.color= "black";
        mahindra.mode= "manual";
        mahindra.price= 1300000;

        mahindra.drift();


    }
}
