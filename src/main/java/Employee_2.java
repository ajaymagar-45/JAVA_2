import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Employee_2 {
    int id;
    String name;
    double salary;
    String department;
    LocalDate joining_date;
    public Employee_2(int id,String name,double salary,String department,LocalDate joining_date){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.joining_date=joining_date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(LocalDate joining_date) {
        this.joining_date = joining_date;
    }

    @Override
    public String toString() {
        return "id : "+id+
                " name :"+name+
                " salary : "+salary+
                " department : "+department+
                " joining_date :"+joining_date;

    }
    public static void main(String[]args){
        List<Employee_2>emp=new ArrayList<>();
        emp.add(new Employee_2(118,"Rahul Kadam",85000.00,"IT", LocalDate.of(2022,5,23)));

        emp.add(new Employee_2(156,"Sumit Jadhav",60000.00,"HR",LocalDate.of(2023,9,21)));

        emp.add(new Employee_2(145,"shyam Shinde",45000.00,"Support",LocalDate.of(2019,6,16)));

        emp.stream().map(Employee_2::getDepartment).filter(i->i.length()>2).forEach(System.out::println);

    }
}
