package com.fuyu;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
/*
servletConfig 对象的api的演示
 */
public class demo1  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //1.获取初始化参数的API
        //获得servletConfig对象
        ServletConfig config=this.getServletConfig();
        String username=config.getInitParameter("username");
        String password=config.getInitParameter("password");
        System.out.println(username+" "+password);
        //2.获得有所初始化参数的名称
        System.out.println("获得有所初始化参数的名称");
       Enumeration<String> names= config.getInitParameterNames();
       while(names.hasMoreElements()){
           String name=names.nextElement();
           String value=config.getInitParameter(name);
           System.out.println(name+ " " +value);
       }
       //3.获得sevlet的名称
        System.out.println("获得sevlet的名称");
        String servletName=config.getServletName();
        System.out.println(servletName);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
