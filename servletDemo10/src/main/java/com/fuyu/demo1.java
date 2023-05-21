package com.fuyu;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(urlPatterns = "/demo10")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //test1();
       // test2();
        test3();
    }

    /*
     传统方式读取文件（不好使）
     */
    private void test1() throws IOException {
        //传统方式：
        Properties properties = new Properties();
        //创建一个文件的输入流
        InputStream inputStream = new FileInputStream("src/db.properties");
        // InputStream inputStream = new FileInputStream("classes/db.properties");
        properties.load(inputStream);
        //获取数据
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        //输入控制台
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);


    }

    /*
     读取web项目的文件：使用servletContext读取
     */
    private void test2() throws IOException {
        //使用servletContext读取方式：
        Properties properties = new Properties();
        //创建一个文件的输入流
        InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        properties.load(inputStream);
        //获取数据
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        //输入控制台
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);


    }
   private  void test3() throws IOException {
       //使用servletContext读取方式：
       Properties properties = new Properties();
       //创建一个文件的输入流
       String path=this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
       InputStream inputStream=new FileInputStream(path);
       properties.load(inputStream);
       //获取数据
       String driverClassName = properties.getProperty("driverClassName");
       String url = properties.getProperty("url");
       String username = properties.getProperty("username");
       String password = properties.getProperty("password");
       //输入控制台
       System.out.println(driverClassName);
       System.out.println(url);
       System.out.println(username);
       System.out.println(password);

   }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
