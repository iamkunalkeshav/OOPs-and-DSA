package interfacedemo.example;

/*
 In Java, an interface is a blueprint of a class that defines a set of methods that a class must implement if it chooses to "implement" the interface. The methods in an interface are abstract by default, meaning they only have their signatures (method names, parameters, and return types) but no implementation (no code in the method body).

 Here&rsquo;s a breakdown of what this means:

 Abstract Methods: An abstract method is a method that is declared without an implementation. In an interface, all methods are abstract by default, so you don&rsquo;t need to use the abstract keyword. This means that the method has a name, return type, and parameters, but the code inside the method is not provided.

 Public Methods: All methods in an interface are public by default, meaning they can be accessed by any other class. Since interfaces are meant to be implemented by other classes, the methods need to be publicly accessible.

 Implementing an Interface: When a class implements an interface, it agrees to provide concrete implementations for all of the abstract methods defined in the interface. If the class fails to do so, it must be declared abstract.
*/

// Define an interface
interface Animal {
    void eat();  // abstract method
    void sleep(); // abstract method
}

// Implementing the interface in a class
class Dog implements Animal {

    @Override

    public void eat() {
        System.out.println("Dog is eating");
    }

   @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();    // Outputs: Dog is eating
        myDog.sleep();  // Outputs: Dog is sleeping
    }
}
