package Collection.ArrayList;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class ComparatorByUsingAnonymous {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rajiv", 50000));
        list.add(new Employee(102, "Amit", 65000));
        list.add(new Employee(103, "Nitin", 70000));
        list.add(new Employee(161, "Ravi", 50000));
        list.add(new Employee(132, "Amol", 45000));
        list.add(new Employee(137, "Viraj", 60000));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("Sorting by Salary:");
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

        System.out.println();


        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.id, e2.id);
            }
        });

        System.out.println("Sorting by ID:");
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}
