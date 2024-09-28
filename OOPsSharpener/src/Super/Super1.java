package Super;

import org.w3c.dom.ls.LSOutput;

// to invoke parent class variable
class Animal{
    String color ="white";
}

//class lion extends Animal{
//    String color ="Green";
//    void printColor(){
//        System.out.println(color);
//        System.out.println(super.color);
//    }
//}

class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);
       System.out.println(super.color);
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
