package Super;

class Animal1 {
    void eat(){
        System.out.println("eating....");
    }
}

//class Lions extends Animals{
//    void eat(){
//        System.out.println("lion is eating");
//    }
//}

class Dog1 extends Animal1 {
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking.....");
    }
    void work(){
        super.eat();
        bark();
    }
}

public class super2 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.work();

    }
}
