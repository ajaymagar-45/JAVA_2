package JDBC;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Firstname :");
        String firstName=sc.nextLine();
        System.out.println("Enter Your Lastname :");
        String lastName=sc.nextLine();

        EmployeeDAO dao = new EmployeeDAO();

        dao.createTable();

        dao.insertEmployee(firstName, lastName);




if(dao!=null) {
    dao.getAllEmployees().forEach(System.out::println);
}
    }
}



