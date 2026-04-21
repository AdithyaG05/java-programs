//10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 through JSP
// called index.jsp with client sided validation and submit to the servlet called ResultServlet and process all
// the fields with server sided validation and display all the data along with result ( Pass if all subjects
// greater than 40%) and Average marks through result.jsp with a link to move to the client side
package lab10b;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    // ✅ Handle GET (avoid 405 error)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    // ✅ Handle POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll = request.getParameter("rollno");
        String name = request.getParameter("name");

        String s1 = request.getParameter("sub1");
        String s2 = request.getParameter("sub2");
        String s3 = request.getParameter("sub3");
        String s4 = request.getParameter("sub4");
        String s5 = request.getParameter("sub5");

        // 🔥 Server validation
        if (roll==null || roll.isEmpty() ||
            name==null || name.isEmpty() ||
            s1==null || s2==null || s3==null || s4==null || s5==null) {

            response.getWriter().println("<h2>All fields required!</h2>");
            return;
        }

        int m1 = Integer.parseInt(s1);
        int m2 = Integer.parseInt(s2);
        int m3 = Integer.parseInt(s3);
        int m4 = Integer.parseInt(s4);
        int m5 = Integer.parseInt(s5);

        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;

        String result;

        if (m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // send to JSP
        request.setAttribute("roll", roll);
        request.setAttribute("name", name);
        request.setAttribute("m1", m1);
        request.setAttribute("m2", m2);
        request.setAttribute("m3", m3);
        request.setAttribute("m4", m4);
        request.setAttribute("m5", m5);
        request.setAttribute("avg", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
