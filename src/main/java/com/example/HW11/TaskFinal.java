package com.example.HW11;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TaskFinal", value = "/TaskFinal")
public class TaskFinal extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("task4.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first=request.getParameter("firstNumber");
        String second=request.getParameter("secondNumber");
        int a=Integer.parseInt(first);
        int b=Integer.parseInt(second);
        response.getWriter().println("Sum : "+(a+b));
        response.getWriter().println("Subtraction : "+(a-b));
        response.getWriter().println("Multiplication : "+(a*b));
        response.getWriter().println("Division : "+(a/b));
        response.getWriter().println("Involution : "+(Math.pow((double)a,(double)b)));
        response.getWriter().println(" % : "+((double)b/(double)a*100));
    }
}
