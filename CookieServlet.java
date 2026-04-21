package lab8;

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

        Cookie nameCookie = null;
        Cookie countCookie = null;

        int count = 0;

        // 🔍 Get existing cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    nameCookie = c;
                }
                if (c.getName().equals("count")) {
                    countCookie = c;
                }
            }
        }

        // 🆕 First time login
        if (name != null && !name.isEmpty()) {
            nameCookie = new Cookie("user", name);
            count = 1;
            countCookie = new Cookie("count", String.valueOf(count));
        }
        // 🔁 Returning user
        else if (nameCookie != null && countCookie != null) {
            count = Integer.parseInt(countCookie.getValue()) + 1;
            countCookie.setValue(String.valueOf(count));
        }

        // ⏱ Set expiry (30 seconds demo)
        if (nameCookie != null) nameCookie.setMaxAge(30);
        if (countCookie != null) countCookie.setMaxAge(30);

        // ➕ Add cookies
        if (nameCookie != null) response.addCookie(nameCookie);
        if (countCookie != null) response.addCookie(countCookie);

        // 🎨 OUTPUT
        out.println("<html><body>");

        if (nameCookie == null) {
            out.println("<h2 style='color:red'>Welcome Guest! Please enter your name</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='username'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        } else {
            out.println("<h1 style='color:blue'>Welcome back, " + nameCookie.getValue() + "!</h1>");
            out.println("<h2 style='color:magenta'>You have visited this page " + count + " times</h2>");
        }

        // 📋 Display all cookies
        out.println("<h3>List of Cookies:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>Name: " + c.getName() + " | Value: " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}