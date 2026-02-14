package Java_8_2;

import JAVA_8.In;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//      Map<String, List<Employee>> itEmployees = employeeList.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment())).filter(t->"Male".equals(t.getDepartment())).collect(Collectors.toList());

//      System.out.println(itEmployees);

//        employeeList.stream().filter(a->a.getDepartment().
//                equals("Sales And Marketing") && a.getGender().equals("Male")).
//                forEach(System.out::println);
//        employeeList.stream().
////
//                .filter(e->"Hr")
//                .distinct()
//                .forEach(System.out::println);
//        employeeList.stream().forEach(System.out::println);
//        List<Employee> li=employeeList.stream().collect(Collectors.toList());
//        System.out.println(li);

        //Print all of the above departments

//        employeeList.stream().map(Employee::getDepartment).forEach(System.out::println);
        //Count the No Of MaleAndFemale
//        Map<String,Long>noOfMaleAndFemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(noOfMaleAndFemale);
////
//        //AverageOfMaleAndFemale
//        Map<String,Double>avgOfMaleAndFemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//        System.out.println(avgOfMaleAndFemale);
//        employeeList.stream().map(Employee::getSalary ).filter(i-> i>22000.0).sorted().collect(Collectors.toList()).forEach(System.out::println);
//      Map<String,Double> avgSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalary);


//Count the number of employee in each department

//        Map<String,Long>l1= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(l1);
//Get the names of all employees who have joined after 2015?
//       employeeList.stream().filter(i->i.yearOfJoining>2015).map(Employee::getName).forEach(System.out::println);
//      Optional<String > str= employeeList.stream().findFirst().map(Employee::getName);
//        System.out.println(str);

//        Optional<Employee> e1=employeeList.stream().min(Comparator.comparing(Employee::getSalary));
//        System.out.println(e1);
//
//        Map<String,Long>e4=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(e4);
//
//        List<Integer> intId=employeeList.stream().map(Employee::getAge).collect(Collectors.toUnmodifiableList());
//        System.out.println(intId);

//        double  avg=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(avg);
//        employeeList.stream().filter(i->i.getSalary()>25000).collect(Collectors.toList()).forEach((e)-> System.out.println(e.getName()));
//        System.out.println();
//         employeeList.stream().filter(i->i.getAge()>=27).forEach(i-> System.out.println(i.getName()));
//         Map<String,Map<Double,Map<String,List<Employee>>>> groupOfTwo= employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.groupingBy(Employee::getSalary,Collectors.groupingBy(Employee::getDepartment))));
//        System.out.println(groupOfTwo);
//        "Hello World!".chars().forEach(System.out::print);
//        "Hello World!".chars().forEach(i->System.out.println((char)i));
//
        employeeList.stream().filter(i->i.getSalary()>25000.00).map(Employee::getName).forEach(System.out::println);




    }
}

