package JAVA_8.Stream_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamOperations {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raja", 9000, 1, "Bengaluru", "HR"),
                new Employee("Nandu", 30000, 2, "Chennai", "Testing"),
                new Employee("Helen", 18000, 3, "Bengaluru", "Accounts"),
                new Employee("Rohini", 8000, 4, "Pune", "Accounts"),
                new Employee("Rakesh", 18000, 5, "Cochin", "HR"),
                new Employee("Harini", 12000, 6, "Cochin", "Accounts"),
                new Employee("Susheela", 22000, 7, "Pune", "Developer"),
                new Employee("Nimisha", 7000, 8, "Chennai", "Testing")
        );

        //Find employee from specific city and get the count
      long count=  employees.stream().filter(i->i.getCity().equals("Pune")).count();
        System.out.println("Employee's from pune : "+ count);

       //2.Find employee where salary is greater than a particular amount
        employees.stream().filter(i->i.getSalary()>12000).forEach(System.out::println);

        //3 Print all Employee name in uppercase

    }
}
