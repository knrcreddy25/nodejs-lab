
import java.io.*;
import javax.servlet.http.*;
public class SessionRetrieveServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // 1. Get existing session
        HttpSession s = req.getSession(false);

        // 2. Check and retrieve values
        if (s != null && s.getAttribute("uname") != null) {
            String user = (String) s.getAttribute("uname");
            String pass = (String) s.getAttribute("pwd");

            out.println("<h2>Welcome " + user + "</h2>");
            out.println("<h3>Password: " + pass + "</h3>");
            out.println("<a href='logout'>Logout</a>");
        }
        else {
            out.println("No Session Found");
        }
    }
}
