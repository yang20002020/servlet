import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
request 接收中文
 */
@WebServlet(urlPatterns = "/demo172")
public class demo2 extends HttpServlet {
    /*
    演示get方式处理中文乱码
    产生乱码的原因：
    get方式提交的数据在请求行url后面，在地址栏上其实就已经进行了一次url的编码了
    解决方法:
    将存入到request缓冲区的值以ISO-8859-1的方式获取到，以UTF-8的方式进行编码。
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //接收数据
        String name= request.getParameter("name");
       String value=new String(name.getBytes("ISO-8859-1"),"UTF-8");


        System.out.println("姓名:"+value);
    }
    /*
     演示post方式处理中文乱码
     产生乱码的原因：
     post方式提交的数据在请求体中，request对象接收到数据之后，放入request
     的缓冲区中，缓冲区就有编码(默认ISO-8859-1:不支持中文)
     解决方法：
     设置缓冲区的编码
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //设置缓冲区的编码
        request.setCharacterEncoding("UTF-8");
        //接收数据
        String name= request.getParameter("name");
        System.out.println("姓名:"+name);
    }
}

