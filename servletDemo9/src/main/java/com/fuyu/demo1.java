package com.fuyu;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
servletContext 对象作用1： 获取web项目的信息
 */
@WebServlet(urlPatterns = "/demo9")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          //1 获取文件的mime的类型
          //获得servletContext
        ServletContext servletContext = this.getServletContext();
         String mineType= servletContext.getMimeType("aaa.txt");
        System.out.println(mineType);  // 终端输入  text/plain
        //2.获得请求路径的工程名
        String path=servletContext.getContextPath();
        System.out.println("获得请求路径的工程名:"+path);  // 终端输入 /servletDemo9
        //获得全局初始化参数
        System.out.println("获得全局初始化参数");
        String username=servletContext.getInitParameter("username");
        String password=servletContext.getInitParameter("password");
        System.out.println(username+ " " +password);
        System.out.println("--------------------");
        Enumeration<String> names=servletContext.getInitParameterNames();
        while(names.hasMoreElements()){
            String name=names.nextElement();
            String value=servletContext.getInitParameter(name);
            System.out.println(name +"  "+value);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
