package com.fuyu;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
重定向 第二种方法， 实际开发中的方法
 */
@WebServlet(urlPatterns = "/demo5")
public class demo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         //完成重定向
        // resp.setStatus(302);
        //设置响应头
        // resp.setHeader("Location","/servletDemo12/demo2");
        //上面注释的代码可以简化为 一行代码
        resp.sendRedirect("/servletDemo12/demo2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
