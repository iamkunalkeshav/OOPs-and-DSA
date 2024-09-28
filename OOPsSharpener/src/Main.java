class Student {
    String name;
    int roll_no;

    // Default constructor
    public Student() {
        this.name = "john";
        this.roll_no = 2;
    }

    // Parameterized constructor
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

// Do not touch the Main method
public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("vaibhav", 101);
        Student obj2 = new Student("rahul", 102);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj.name);
    }
}
