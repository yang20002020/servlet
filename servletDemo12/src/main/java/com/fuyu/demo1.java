package com.fuyu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
设置响应的状态码
使用状态码和location头完成重定向
 */
@WebServlet(urlPatterns = "/demo1")
public class demo1  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应的状态码
        //resp.setStatus(404);
        //完成重定向
        resp.setStatus(302);
        //设置响应头
        resp.setHeader("Location","/servletDemo12/demo2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
