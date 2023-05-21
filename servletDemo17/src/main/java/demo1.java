import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
request 接收中文
 */
@WebServlet(urlPatterns = "/demo17")
public class demo1 extends HttpServlet {
    /*
    演示get方式处理中文乱码
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //接收数据
        String name= request.getParameter("name");
        System.out.println("姓名:"+name);
    }
/*
 演示post方式处理中文乱码

 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
       //接收数据
        String name= request.getParameter("name");
        System.out.println("姓名:"+name);
    }
}
