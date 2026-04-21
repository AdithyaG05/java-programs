// 9.a Build a Session Management using Servlet program set with one minute session to show Session
// Tracking Information, Session ID,Session Creation Time,Last Access Time,Visit Count
package lab9;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.Date;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 🔥 Create or get session
        HttpSession session = request.getSession();

        // ⏱ Set session timeout (1 minute = 60 seconds)
        session.setMaxInactiveInterval(60);

        // 🆔 Session ID
        String sessionId = session.getId();

        // 🕒 Creation Time
        Date creationTime = new Date(session.getCreationTime());

        // 🕒 Last Access Time
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // 🔢 Visit count
        Integer count = (Integer) session.getAttribute("visitCount");

        if (count == null) {
            count = 1;
        } else {
            count = count + 1;
        }

        session.setAttribute("visitCount", count);

        // 🎨 OUTPUT
        out.println("<html><body>");

        out.println("<h2 style='color:blue'>Session Tracking Information</h2>");

        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Session Creation Time:</b> " + creationTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + count + "</p>");

        out.println("<p style='color:red'>(Session expires in 1 minute)</p>");

        out.println("</body></html>");
    }
}
