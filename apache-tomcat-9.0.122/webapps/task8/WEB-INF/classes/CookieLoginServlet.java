
import java.io.*;
import javax.servlet.http.*;
public class CookieLoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // 1. Get input
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        // 2. Create cookies
        Cookie c1 = new Cookie("uname", user);
        Cookie c2 = new Cookie("pwd", pass);
 
        // 3. Set expiry
        c1.setMaxAge(60 * 60 * 24);
        c2.setMaxAge(2 * 60);

        // 4. Add cookies
        res.addCookie(c1);
        res.addCookie(c2);

        out.println("<h2>Cookies Created</h2>");
        out.println("<a href='retrieve'>Retrieve</a>");
    }
}
