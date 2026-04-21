package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

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

        // 🆕 First time login
        if (userName != null && !userName.isEmpty()) {
            userCookie = new Cookie("user", userName);
            count = 1;
            countCookie = new Cookie("count", String.valueOf(count));
        }
        // 🔁 Returning user
        else if (userCookie != null && countCookie != null) {
            count = Integer.parseInt(countCookie.getValue()) + 1;
            countCookie.setValue(String.valueOf(count));
        }

        // ⏱ Set cookie expiry (30 seconds)
        if (userCookie != null) userCookie.setMaxAge(30);
        if (countCookie != null) countCookie.setMaxAge(30);

        // ➕ Add cookies to response
        if (userCookie != null) response.addCookie(userCookie);
        if (countCookie != null) response.addCookie(countCookie);

        // 🎨 OUTPUT PAGE
        out.println("<html><body>");

        if (userCookie == null) {
            // 🔴 Guest user (first time or expired)
            out.println("<h2 style='color:red'>Welcome Guest! you have been logged out or kindly login first time</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        } else {
            // 🔵 Returning user
            out.println("<h1 style='color:blue'>Welcome back, " + userCookie.getValue() + "!</h1>");
            out.println("<h1 style='color:magenta'>You have visited this page " + count + " times!</h1>");
        }

        out.println("</body></html>");
    }
}