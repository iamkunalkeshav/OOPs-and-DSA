package Triangle;

class Triangle {
    int side1;
    int side2;
    int side3;

    // Constructor to initialize the sides
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the area of the triangle
    public int calculate_area() {
        // Using the formula: side1 * side2 * side3
        return side1 * side2 * side3;
    }

    // Method to calculate the perimeter of the triangle
    public int calculate_perimeter() {
        // Using the formula: side1 + side2 + side3
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String args[]) {
        Triangle t=new Triangle(3,4,5);
        System.out.println(t.calculate_area());
        int per=t.calculate_perimeter();
        System.out.println(per);
        t=new Triangle(9,10,11);
        System.out.println(t.calculate_area());
        per=t.calculate_perimeter();
        System.out.println(per);
    }
}