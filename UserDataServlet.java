//10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 through JSP
// called index.jsp with client sided validation and submit to the servlet called ResultServlet and process all
// the fields with server sided validation and display all the data along with result ( Pass if all subjects
// greater than 40%) and Average marks through result.jsp with a link to move to the client side

package lab10;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    // ✅ Handle GET (fix for 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Redirect to form instead of error
        response.sendRedirect("index.jsp");
    }

    // ✅ Handle POST (main logic)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // 🔥 Server-side validation
        if (name == null || name.trim().isEmpty() ||
            email == null || email.trim().isEmpty() ||
            desig == null || desig.trim().isEmpty()) {

            response.getWriter().println("<h2 style='color:red'>All fields are required!</h2>");
            return;
        }

        if (!email.matches("^[^ ]+@[^ ]+\\.[a-z]{2,3}$")) {
            response.getWriter().println("<h2 style='color:red'>Invalid Email Format!</h2>");
            return;
        }

        // ✅ Pass data to JSP
        request.setAttribute("username", name);
        request.setAttribute("email", email);
        request.setAttribute("designation", desig);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
