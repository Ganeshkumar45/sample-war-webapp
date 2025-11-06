package com.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseServlet", urlPatterns = {"/response"})
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        if (name == null || name.isBlank()) {
            name = "Anonymous";
        }
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!doctype html>");
            out.println("<html><head><title>Response</title></head><body>");
            out.println("<h1>Form response</h1>");
            out.println("<p>Hello, " + escapeHtml(name) + "!</p>");
            out.println("<p><a href="" + req.getContextPath() + "/">Back to index</a></p>");
            out.println("</body></html>");
        }
    }

    // simple HTML escaper
    private String escapeHtml(String s) {
        if (s == null) return null;
        return s.replaceAll("&", "&amp;")
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;")
                .replaceAll("\"", "&quot;")
                .replaceAll("'", "&#39;");
    }
}
