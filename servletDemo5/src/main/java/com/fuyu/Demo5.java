package com.fuyu;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*
对 servlet类 方法 的完善
 */


@WebServlet(urlPatterns = "/demo5",loadOnStartup = 1)
public class Demo5 implements Servlet {
    private ServletConfig config;
    /*
       调用时机：
       每一次servlet被调用时，调用
       调用次数：多次
     */
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
        this.config=servletConfig;
        System.out.println("init..........");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }


/*
返回 一些信息，比如作者版权， 很少用
 */
    @Override
    public String getServletInfo() {
        return "";
    }
    /*
     销毁方法：
     1.调用时机： 内存释放或者服务器关闭的时候，servlet 对象会被销毁，调用
     2.调用次数：1次
     */
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}

