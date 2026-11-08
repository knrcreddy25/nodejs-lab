import java.sql.*;

public class DisplayData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Hitesh");
             Statement s = con.createStatement()) {

            ResultSet rs = s.executeQuery("SELECT * FROM students");
            if (rs != null) {
                System.out.println("id \t name \t age \t email");
                System.out.println("________________________________________");

                while (rs.next()) {
                    System.out.println(rs.getString("id") + " \t " + rs.getString("name") + " \t " + rs.getString("age") + " \t " + rs.getString("email"));
                    System.out.println("________________________________________");
                }
            }

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}
  