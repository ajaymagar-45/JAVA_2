package JDBC_2;
import java.sql.*;
import java.util.Scanner;

public class MenuDriven {

    static final String URL = "jdbc:postgresql://localhost:5432/JDBC";
    static final String USER = "postgres";
    static final String PASS = "ajay";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> insertStudent();
                case 2 -> viewStudents();
                case 3 -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // INSERT STUDENT
    static void insertStudent() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            String sql = "INSERT INTO students(name, age) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);

            ps.executeUpdate();
            System.out.println("Student inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW STUDENTS
    static void viewStudents() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            System.out.println("\nID  Name  Age");
            System.out.println("----------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "   " +
                                rs.getString("name") + "   " +
                                rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



