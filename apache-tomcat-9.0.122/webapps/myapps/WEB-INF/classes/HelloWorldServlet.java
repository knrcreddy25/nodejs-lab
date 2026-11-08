import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println(
            "<html><body><h1>HelloWorld</h1></body></html>"
        );

        pw.close();
    }
}