
class Animal{
    String color;
    String name;
    String breed;
    int age;

    public Animal(){   //    Default constructor

    }

    // Parameterized constructors
   public Animal(String animalName, int animalAge){

        name = animalName;
        age = animalAge;
        color = "Black";

    }

    void run(){
        System.out.println(name+" is running");
    }

    void eat(){
        System.out.println(name+" is eating");
    }

}


public class OOPs {
    public static void main(String[] args) {

        Animal dog = new Animal("Tuffy",10);
        Animal lion = new Animal("lab",20);



        System.out.println("Dog's name: "+dog.name);
        System.out.println("Lion's age: "+lion.age);



        System.out.println("Lion's color: " +lion.color);


    }
}