import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee_2 {
    int id;
    String name;
    double salary;
    String department;
    LocalDate joining_date;
    String city;
    public Employee_2(int id,String name,double salary,String department,LocalDate joining_date,String city){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.joining_date=joining_date;
        this.city=city;

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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city=city;

    }

    @Override
    public String toString() {
        return "id : "+id+
                " name :"+name+
                " salary : "+salary+
                " department : "+department+
                " joining_date :"+joining_date+
                " City : "+city;

    }
    public static void main(String[]args){
        List<Employee_2>emp=new ArrayList<>();
        emp.add(new Employee_2(118,"Rahul Kadam",85000.00,"IT", LocalDate.of(2022,5,2),"Latur"));

        emp.add(new Employee_2(156,"Sumit Jadhav",60000.00,"HR",LocalDate.of(2023,9,21),"Nagpur"));

        emp.add(new Employee_2(145,"shyam Shinde",45000.00,"Support",LocalDate.of(2019,6,16),"Pune"));

        emp.add(new Employee_2(145,"Shruti Kadam",95000.00,"IT",LocalDate.of(2020,6,16),"Mumbai"));

        emp.add(new Employee_2(167,"Nilesh Sisodiya",45000.00,"Support",LocalDate.of(2017,6,15),"Chennai"));

//        emp.stream().map(Employee_2::getDepartment).filter(i->i.length()>2).forEach(System.out::println);
        for(Object s:emp)
            System.out.println(s);

        Optional<Employee_2>max_salary=emp.stream().max(Comparator.comparing(Employee_2::getSalary));
        System.out.println(max_salary);

    }
}
