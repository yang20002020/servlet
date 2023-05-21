import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/demo142")
public class demo2  extends HttpServlet {
  //

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        test3(resp);
    }
    private  void test1(HttpServletResponse resp) throws IOException {
        resp.getWriter().println("中文");
        /*
        ****使用上述代码向页面输出中文是否会产生乱码？
        一定乱码
        原因：
        字符流是有缓冲区的，response获得字符流，response设计默认的缓冲区编码是ISO-8859-1。这个字符集不支持中文的。
        解决：
        设置response获得字符流缓冲区的编码和设置浏览器默认打开时候采用的字符集一致即可。
         */
    }
    private void  test2 (HttpServletResponse resp) throws IOException {
         //设置浏览器默认打开的时候采用的字符集:
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        //设置response获得字符流的缓冲区的编码：
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("中文");
    }
    /*
    test2 和test3 是等价的
     */
    private void  test3 (HttpServletResponse resp) throws IOException {
        //字符流向页面响应中文，有一种简化的方式：
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("中文");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
