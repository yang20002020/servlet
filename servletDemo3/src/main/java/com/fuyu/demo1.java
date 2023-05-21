package com.fuyu;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/demo3")
public class demo1 implements Servlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("servlet_____");
        System.out.println("hello world---");
    }
/*
  初始化方法：
  1.调用时机：默认的情况下，servlet第一次被访问的时候，调用
  2.调用次数:只调用一次
 */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init..........");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

