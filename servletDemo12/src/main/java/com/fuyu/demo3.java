package com.fuyu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
定时刷新
 */
@WebServlet(urlPatterns = "/demo3")
public class demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //定时刷新
        resp.setContentType("text/html;charset=UTF-8");//防止页面乱码
        resp.getWriter().println("5秒钟之后，页面demo3跳转.....");
        resp.setHeader("Refresh","5;url=/servletDemo12/demo4");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
