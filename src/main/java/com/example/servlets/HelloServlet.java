package com.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!doctype html>");
            out.println("<html><head><title>Hello Servlet</title></head><body>");
            out.println("<h1>Hello from Servlet!</h1>");
            out.println("<p>Context path: " + req.getContextPath() + "</p>");
            out.println("<p><a href="" + req.getContextPath() + "/">Back to index</a></p>");
            out.println("</body></html>");
        }
    }
}
