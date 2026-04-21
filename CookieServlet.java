// 8b. Build a servlet program to create a cookie to get your name through text box and press submit button(
// through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
// n times ( n = number of your visit ) along with the list of cookies and its setvalues and demonstrate the
// expiry of cookie also.
package lab8b;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie userCookie = null;
        Cookie countCookie = null;

        int count = 0;

        // 🔍 Get existing cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    userCookie = c;
                }
                if (c.getName().equals("count")) {
                    countCookie = c;
                }
            }
        }

        // 🆕 First time user
        if (name != null && !name.isEmpty()) {
            userCookie = new Cookie("user", name);
            count = 1;
            countCookie = new Cookie("count", String.valueOf(count));
        }
        // 🔁 Returning user
        else if (userCookie != null && countCookie != null) {
            count = Integer.parseInt(countCookie.getValue()) + 1;
            countCookie.setValue(String.valueOf(count));
        }

        // ⏱ Expiry (30 seconds demo)
        if (userCookie != null) userCookie.setMaxAge(30);
        if (countCookie != null) countCookie.setMaxAge(30);

        if (userCookie != null) response.addCookie(userCookie);
        if (countCookie != null) response.addCookie(countCookie);

        // 🎨 OUTPUT
        out.println("<html><body>");

        if (userCookie == null) {
            out.println("<h2 style='color:red'>Welcome Guest! Please login first</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='username'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        } else {
            out.println("<h1 style='color:blue'>Welcome back, " + userCookie.getValue() + "!</h1>");
            out.println("<h2 style='color:magenta'>You have visited this page " + count + " times</h2>");
        }

        // 📋 Detailed Cookie List
        out.println("<h3>Cookie Details:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>");
                out.println("Name: " + c.getName() + "<br>");
                out.println("Value: " + c.getValue() + "<br>");
                out.println("Max Age: " + c.getMaxAge() + " seconds<br>");
                out.println("------------------------");
                out.println("</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
