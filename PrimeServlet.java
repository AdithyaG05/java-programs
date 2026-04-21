// 6c. Build a servlet program to check the given number is prime number or not using HTML with step by
// step procedure.
package PrimeNumber;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String value = request.getParameter("num");

        out.println("<html><body>");

        // 🔥 ALWAYS SHOW INPUT FORM
        out.println("<h2>Enter a number</h2>");
        out.println("<form action='PrimeServlet' method='get'>");
        out.println("<input type='number' name='num' required>");
        out.println("<input type='submit' value='Check'>");
        out.println("</form>");

        // ✅ Only calculate if user entered value
        if (value != null && !value.trim().isEmpty()) {

            int num = Integer.parseInt(value);
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // 🎯 RESULT DISPLAY
            out.println("<h3>Number entered: " + num + "</h3>");

            if (isPrime) {
                out.println("<h2 style='color:green'>" + num + " is a PRIME number</h2>");
            } else {
                out.println("<h2 style='color:red'>" + num + " is NOT a prime number</h2>");
            }
        }

        out.println("</body></html>");
    }
}
