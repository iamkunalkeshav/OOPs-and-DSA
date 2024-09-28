public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person p1 = new Person();
        p1.age=23;
        p1.name="kunal";
        System.out.println(p1.age+p1.name);
    }
}

class Person{
    String name;
    int age;


}