import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/demo15")
public class requestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求方式：
        System.out.println("请求方式:"+request.getMethod());
        //获取客户机的IP地址
        System.out.println("客户机IP地址:"+request.getRemoteAddr());
        //获取请求参数的字符串
        System.out.println("请求参数的字符串:"+request.getQueryString());
        //获取请求路径的URL和URI
        System.out.println("请求路径的URL:"+request.getRequestURL());
        System.out.println("请求路径的URI:"+request.getRequestURI());
        //获取请求头的信息
        System.out.println("获取客户机浏览器类型:"+request.getHeader("User-Agent"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
