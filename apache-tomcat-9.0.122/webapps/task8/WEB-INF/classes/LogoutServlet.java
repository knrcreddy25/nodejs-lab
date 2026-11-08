
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res) throws IOException {

        // 1. Get session
        HttpSession s = req.getSession(false);

        // 2. Destroy session
        if (s != null)
            s.invalidate();

        // 3. Return to login
        res.sendRedirect("session.html");
    }
}
