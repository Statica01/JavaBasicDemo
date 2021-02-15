package com.example.BasicsDemo.controllers;

import com.example.BasicsDemo.models.Text;
import com.example.BasicsDemo.services.TextService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete-text.do")
public class DeleteText extends HttpServlet {

    private TextService textService = new TextService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        textService.deleteText(new Text(request.getParameter("text")));
        response.sendRedirect("/print-text.do");
    }
}
