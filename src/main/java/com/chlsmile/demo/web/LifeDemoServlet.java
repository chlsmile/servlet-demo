package com.chlsmile.demo.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with: IntelliJ IDEA.
 * Function:
 * User: chl_smile
 * Date: 2016-09-22 18:37:00
 */
public class LifeDemoServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException{
        System.out.println("LifeDemoServlet init 方法执行了");
    }

    public void destroy(){
        System.out.println("LifeDemoServlet destroy 方法执行了");
    }



    public void service(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("LifeDemoServlet service 方法执行了");
    }


}
