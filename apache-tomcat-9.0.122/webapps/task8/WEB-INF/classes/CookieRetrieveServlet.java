
import java.io.*;
import javax.servlet.http.*;
public class CookieRetrieveServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // 1. Get cookies
        Cookie[] cookies = req.getCookies();
        String user = "";
        String pass = "";

        // 2. Find username and password
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("uname"))
                    user = c.getValue();

                if (c.getName().equals("pwd"))
                    pass = c.getValue();
            }
        }

        // 3. Display
        out.println("<h2>Welcome " + user + "</h2>");
        out.println("<h3>Password: " + pass + "</h3>");
    }
}
