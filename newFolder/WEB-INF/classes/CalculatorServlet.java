import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));

            String operation = request.getParameter("operation");

            double result = 0;

            if (!Double.isFinite(num1) || !Double.isFinite(num2)) {
                throw new NumberFormatException();
            }

            if (operation == null) {
                request.setAttribute("error", "Unsupported operation");
            } else {
                switch (operation) {
                    case "add":
                        result = num1 + num2;
                        break;

                    case "sub":
                        result = num1 - num2;
                        break;

                    case "mul":
                        result = num1 * num2;
                        break;

                    case "div":
                        if (num2 == 0) {
                            request.setAttribute("error", "Cannot divide by zero");
                        } else {
                            result = num1 / num2;
                        }
                        break;

                    default:
                        request.setAttribute("error", "Unsupported operation");
                }
            }

            if (request.getAttribute("error") == null) {
                if (Double.isFinite(result)) {
                    request.setAttribute("result", result);
                } else {
                    request.setAttribute("error", "Result is outside the supported range");
                }
            }

        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid number entered");
        }

        RequestDispatcher rd = request.getRequestDispatcher("/result");
        rd.forward(request, response);
    }
}