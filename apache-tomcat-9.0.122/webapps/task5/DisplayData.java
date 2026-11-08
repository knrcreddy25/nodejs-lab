
import java.sql.*;

public class DisplayData {
    public static void main(String[] args) {

        String sql = "SELECT * FROM students";

        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/studentdb", "root", "mgit@5");
            PreparedStatement ps = con.prepareStatement(sql);
        ) {
            // 2. Execute SELECT
            ResultSet rs = ps.executeQuery();

            // 3. Display each row
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("email")
                );
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
