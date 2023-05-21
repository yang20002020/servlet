package com.fuyu;

import javax.servlet.*;
import java.io.IOException;


public class demo1 implements Servlet {
    /*
    用来处理客户的请求，并且对请求作出响应的方法
     */
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        //向页面输入一个字符串
        resp.getWriter().println("hello Servlet.....");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init。。。。。。。。");
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
