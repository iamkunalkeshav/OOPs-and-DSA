package Constructor;;


class Students{
    int id;
    int age;

    Students(int id , int age){
        this.id= id;
        this.age=age;
        System.out.println("Parameterized Constructor");
    }
    Students(){
        System.out.println("default constructor");
    }
    Students(int id , String name, int age){
        System.out.println("Parameterised constructor 2");
    }
}

public class constructorDemo {
    public static void main(String[] args) {
        Students obj = new Students(1,"kunal",22);

    }
}
