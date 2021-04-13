package com.example.HW11;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "Task3", value = "/Task3")
public class Task3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("task3.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt =request.getParameter("text");
        String txt1=txt.replaceAll("[aeiou ?!,.\\\\0-9]", ""); /* согласные */
        String txt2=txt.replaceAll("[^aeiou]", ""); /* гласные */
        String txt3=txt.replaceAll("[^?!,.]", ""); // знаки препинания


        response.getWriter().println("consonants : "+txt1+"  count : "+txt1.length());
        response.getWriter().println("vowels : "+txt2+"  count : "+txt2.length());
        response.getWriter().println("symbols : "+txt3+"  count : "+txt3.length());
    }
}
