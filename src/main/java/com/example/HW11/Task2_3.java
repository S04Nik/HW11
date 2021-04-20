package com.example.HW11;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Task2", value = "/Task2")
public class Task2_3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a=Integer.parseInt(request.getParameter("first"));
        int b=Integer.parseInt(request.getParameter("second"));
        int c=Integer.parseInt(request.getParameter("third"));

        PrintWriter write = response.getWriter();
        write.println("first value : "+a+"\n"+"second value : "+b+"\n"+"third value :"+c+"\n");
        int min,max;
        min=Integer.min(a,b);
        min=Integer.min(min,c);
        max=Integer.max(a,b);
        max=Integer.max(max,c);
        String choice=request.getParameter("radio");
        if(choice.equals("max"))
        {
            write.println("Max : "+max+"\n");
        }else
        if(choice.equals("min"))
        {
            write.println("Min  : "+min+"\n");
        }else
        if(choice.equals("avr"))
        {
            write.println("Average  : "+((a+b+c)/3)+"\n");
        }

    }
}
