package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_1 {
    int id;
    String name;
    String department;
    double salary;

    public Employee_1(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return " id:" +id +
                " name:" + name+
                " department:"+ department+
                " salary:" +salary;
    }

    public static void main(String[] args) {
        List<Employee_1> empList=new ArrayList<>();
        empList.add(new Employee_1(114,"Rahul","Sales&Marketing",55000.00));
        empList.add(new Employee_1(145,"Sumit Dhotre","IT",50000.00));
        empList.add(new Employee_1(165,"Ramesh Kadam","Hr",65000.00));
        empList.add(new Employee_1(167,"Ganesh Shinde","Executor Head",85000.00));
        empList.add(new Employee_1(187,"Prathemesh Deshmukh","IT",65000.00));
        empList.add(new Employee_1(189,"Karan Yadav","Support",35000.00));
//        empList.stream().filter(i->i.salary>60000.00).collect(Collectors.toList()).forEach(System.out::println);
//        Map<String,List<Employee_1>> e4=  empList.stream().collect(Collectors.groupingBy(Employee_1::getName));
//        System.out.println(e4);
//        Map<String,Map<Double,List<Employee_1>>> sal=empList.stream().collect(Collectors.groupingBy(Employee_1::getName,Collectors.groupingBy(Employee_1::getSalary)));
//        System.out.println(sal);
//        Map<String, List<Double>> sal1 =
//                empList.stream().collect(Collectors.groupingBy(Employee_1::getName, Collectors.mapping(Employee_1::getSalary, Collectors.toList())));
//
//        System.out.println(sal1);
//        System.out.println(empList);
//        List<String> nameOfEmployee=empList.stream().map(Employee_1::getName).collect(Collectors.toList());
//        System.out.println(nameOfEmployee);
//         empList.stream().filter(emp->emp.getDepartment().equals("IT")).map(Employee_1::getName).forEach(System.out::println);

         empList.stream().map(Employee_1::getDepartment).forEach(System.out::println);






    }
}
