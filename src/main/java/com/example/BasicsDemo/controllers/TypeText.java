package com.example.BasicsDemo.controllers;

import com.example.BasicsDemo.models.Text;
import com.example.BasicsDemo.services.TextService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/type-text.do")
public class TypeText extends HttpServlet {

    private TextService textService = new TextService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/type-text.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newText = request.getParameter("text");
        textService.addText(new Text(newText));
        response.sendRedirect("/print-text.do");
    }
}
