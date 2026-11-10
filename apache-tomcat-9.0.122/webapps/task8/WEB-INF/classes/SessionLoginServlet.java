
import java.io.*;
import javax.servlet.http.*;
public class SessionLoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // 1. Get input
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        // 2. Create session
        HttpSession s = req.getSession();

        // 3. Store values
        s.setAttribute("uname", user);
        s.setAttribute("pwd", pass);

        // 4. Set timeout (3 months approximately)
        s.setMaxInactiveInterval(3 * 30 * 24 * 60 * 60);

        out.println("<h2>Session Created</h2>");
        out.println("<a href='retrieve1'>Retrieve</a>");
    }
}
