package INHERITANCE;

/*
class parentClass{
    void display(){
        System.out.println("parent class method");
    }
}

class childClass extends parentClass{
    void show(){
        System.out.println("child class method");
    }
}

 */




class Vehicle{

    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("price "+price);
        System.out.println("mileage "+mileage);
        System.out.println("color "+color);
    }


}
class Car extends Vehicle{

    String fType;
    boolean sunRoof;
    String brand;

}


public class inheritance {
    public static void main(String[] args) {

/*
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
*/



        Car car1 = new Car();
        car1.brand = "Tata";
        car1.price= 1500000;
        car1.mileage= 18.3;
        car1.fType= "Diesel";
        car1.color= "red";
        car1.sunRoof = true;

        car1.display();
        System.out.println(car1.sunRoof);


    }
}
