package JAVA_8.Stream_1;

import java.util.ArrayList;

public class Employee {
    private String empName;
    private double salary;
    private int empId;
    private String city;
    private String department;
    public Employee(String empName,double salary,int empId,String city,String department){
        this.empName=empName;
        this.salary=salary;
        this.empId=empId;
        this.city=city;
        this.department=department;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeName : "+empName+
                " Salary :"+ salary+
                " EmpId : "+empId+
                " City : "+city+
                " Department :"+department;
    }

}
