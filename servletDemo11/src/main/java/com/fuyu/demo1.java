package com.fuyu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
ServletContext 的域对象的演示
 */
@WebServlet(urlPatterns = "/demo11")
public class demo1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
       //当servletDemo11被创建，初始化一个值
        this.getServletContext().setAttribute("name","张三");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= (String)this.getServletContext().getAttribute("name");
        System.out.println("姓名："+name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
