package Comparators;
import java.util.*;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Amit", 50000);
        employees[1] = new Employee("Neha", 75000);
        employees[2] = new Employee("Rohit", 45000);
        employees[3] = new Employee("Priya", 60000);
        employees[4] = new Employee("Rajesh", 80000);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee.name + " - Salary: " + employee.salary);
        }
    }
}
