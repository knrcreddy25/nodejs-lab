
import java.sql.*;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sql = "DELETE FROM students WHERE id=?";

        try (
            // 1. Connect and prepare
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/studentdb", "root", "mgit@5");
            PreparedStatement ps = con.prepareStatement(sql);
        ) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Deleted Successfully");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
