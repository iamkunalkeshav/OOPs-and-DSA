package Abstraction;

abstract class car {

    abstract public void fuelType();

    public void color() {
        System.out.println("black color");
    }
}

  class tata extends car{

    public void fuelType(){
        System.out.println("Diesel");
    }

}


    public class Main {
        public static void main(String[] args) {
            tata nexon = new tata();
            nexon.fuelType();
            nexon.color();

        }
    }

