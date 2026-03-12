package Emp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee_11
{
int id;

String name;

int age;

String gender;

String department;

int yearOfJoining;

double salary;

public Employee_11(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
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
    //1.How many male and female employees are there in the organization?
    static  Map<String,Long> maleFemale(List<Employee_11> employeeList){

        return employeeList.stream().collect(Collectors.groupingBy(Employee_11::getGender,Collectors.counting()));
    }

    //Print the name of all departments in the organization?
    static List<String> nameOfAllDepartement(List<Employee_11> employeeList){
        return  employeeList.stream().map(Employee_11::getDepartment).distinct().toList();

    }

    //What is the average age of male and female employees?
    static  Map<String,Double> avgAge(List<Employee_11> employeeList){
        return  employeeList.stream().collect(Collectors.groupingBy(Employee_11::getGender,Collectors.averagingDouble(Employee_11::getAge)));
    }

    // Get the names of all employees who have joined after 2015?
    static Map<Integer, List<String>> employeeJoinedAfter_2015(List<Employee_11> employeeList) {

        return employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .collect(Collectors.groupingBy(
                        Employee_11::getYearOfJoining,
                        Collectors.mapping(
                                Employee_11::getName,
                                Collectors.toList()
                        )
                ));
    }

    //Count the number of employees in each department?
    static void employeeCountByDepartment(List<Employee_11> employeeList) {

        Map<String, Long> employeeCountByDepartment =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                Employee_11::getDepartment,
                                Collectors.counting()
                        ));

        for (Map.Entry<String, Long> entry : employeeCountByDepartment.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static List<Integer> findMissing(int[] arr) {

        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);

        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        return IntStream.rangeClosed(min, max)
                .filter(i -> !set.contains(i))
                .boxed()
                .collect(Collectors.toList());
    }






    public static void main(String[] args) {
        List<Employee_11> employeeList = new ArrayList<Employee_11>();

        employeeList.add(new Employee_11(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee_11(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee_11(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee_11(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee_11(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee_11(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee_11(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee_11(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee_11(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee_11(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee_11(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee_11(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee_11(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee_11(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee_11(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee_11(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee_11(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
//        System.out.println(maleFemale(employeeList));
//        System.out.println(nameOfAllDepartement(employeeList));
//        System.out.println(avgAge(employeeList));
//
//
//        System.out.println(employeeJoinedAfter_2015(employeeList));
       List<Employee_11> e= employeeList.stream().filter(i->i.getSalary()>18000).collect(Collectors.toList());
//        System.out.println(e);
        //sort key
       employeeCountByDepartment(employeeList);
       maleFemale(employeeList);


        Map<Integer,Integer>map=new HashMap();
     map.put(1,10);
     map.put(45,90);
     map.put(37,100);
     map.put(9,180);
     map.put(6,10);
//        System.out.println(map.keySet());
//    Map<Integer,Integer>map1=new TreeMap<>(map);
//        System.out.println(map1.keySet());
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list2 = Arrays.asList(2, 4);
        List<Integer> misssing=list1.stream().filter(i->!list2.contains(i)).collect(Collectors.toList());
//        System.out.println(misssing);

//        int arr[]={1,2,8,9,384};
//        int a=10;
//        int b=20;
//        System.out.println(a >> b);






    }





}




