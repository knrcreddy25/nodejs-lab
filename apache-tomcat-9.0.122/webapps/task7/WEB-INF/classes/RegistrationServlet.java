import java.io.*;
import java.sql.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    // doPost() runs when HTML form uses method="post"
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        // Tell browser that response is HTML
        res.setContentType("text/html");

        // SQL query to insert user details into database
        String sql = "INSERT INTO logindetails(username,password,email,contactno) VALUES (?,?,?,?)";

        try (
            // Connect Java to MySQL database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/registrationdb5", "root", "");

            // Prepare SQL query with placeholders (?)
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            // Get values from HTML form and place them into SQL query
            ps.setString(1, req.getParameter("name"));
            ps.setString(2, req.getParameter("password"));
            ps.setString(3, req.getParameter("email"));
            ps.setString(4, req.getParameter("contact"));

            // Execute INSERT query and return number of affected rows
            int n = ps.executeUpdate();

            // Display result in browser
            if (n > 0) {
                res.getWriter().println("Registered successfully");
            } else {
                res.getWriter().println("Registration failed");
            }

        } catch (SQLException e) {

            // Handle database errors
            e.printStackTrace();
            res.getWriter().println("Database error");
        }
    }
}