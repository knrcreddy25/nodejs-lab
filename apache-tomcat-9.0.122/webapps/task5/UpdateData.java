
import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sql = "UPDATE students SET name=?,age=?,email=? WHERE id=?";

        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/studentdb", "root", "mgit@5");
            PreparedStatement ps = con.prepareStatement(sql);
        ) {
            // 2. Input
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Email: ");
            String email = sc.next();

            // 3. Set values in ? order
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setInt(4, id);

            // 4. Execute
            ps.executeUpdate();
            System.out.println("Updated Successfully");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
