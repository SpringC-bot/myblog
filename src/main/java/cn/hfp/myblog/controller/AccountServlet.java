package cn.hfp.myblog.controller;

import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;


public class AccountServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> initParameterNames = getServletContext().getInitParameterNames();
        while(initParameterNames.hasMoreElements()){
            String name = initParameterNames.nextElement();
            String password = getServletContext().getInitParameter(name);
            System.out.println(name + password);
        }

        String realPath = getServletContext().getRealPath("index.jsp");
        System.out.println(realPath);

        InputStream resourceAsStream = getServletContext().getResourceAsStream("a.txt");
        System.out.println(resourceAsStream);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
