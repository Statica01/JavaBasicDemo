package com.example.BasicsDemo.controllers;

import com.example.BasicsDemo.services.TextService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/print-text.do")
public class PrintText extends HttpServlet {

    private TextService textService  = new TextService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("texts", textService.retrieveTexts());
        request.getRequestDispatcher("/views/print-text.jsp").forward(
                request, response);
    }
}
