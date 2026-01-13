package JDBC;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public void createTable() {
        String sql = """
            CREATE TABLE IF NOT EXISTS employee (
                id SERIAL PRIMARY KEY,
                firstName VARCHAR(100),
                lastName  VARCHAR(100)
            )
        """;

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertEmployee(String firstName,String lastName) {
        String sql = "INSERT INTO employee(firstName,lastName) VALUES (?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, firstName);
            ps.setString(2, lastName);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT id, firstName,lastName FROM employee";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(
                        new Employee(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3)
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}

