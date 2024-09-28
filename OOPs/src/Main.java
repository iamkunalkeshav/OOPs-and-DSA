public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.Name = " Kunal ";

        Person p2 = new Person();
        p2.age = 22;
        p2.Name = " Keshav";
        System.out.println(p1.age+" "+ p1.Name);
        System.out.println(p2.age+" "+ p2.Name);

        p1.eat();
        p2.walk(34);
    }
}

class Person{
    String Name;
    int age;

    void walk(){
        System.out.println(Name +" is walking");
    }
    void eat (){
    System.out.println(Name+" is eating");
}

   void walk(int steps){
       System.out.println(Name+" walked "+ steps +" steps");
   }

}
