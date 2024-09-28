package CountObjects;

class count_objects{

    static int i;

    count_objects(){
        i++;
    }

}

public class Main {
    public static void main(String[] args) {
        count_objects a = new count_objects();
        count_objects b = new count_objects();
        count_objects c = new count_objects();
        System.out.println(a.i);
        count_objects d = new count_objects();
        System.out.println(b.i);
        count_objects e = new count_objects();
        System.out.println(count_objects.i);

    }
}


// Explanation:
//Static Variable (i): The static variable i is declared to keep track of the number of objects created. Since it's static, it's shared among all instances of the count_objects class.
//Constructor: Every time a new object of the count_objects class is created, the constructor is called, and i is incremented by 1.
//When you run the provided main method, it will create five objects (a, b, c, d, and e) and print the count after some of them are created, showing how the count increases.
