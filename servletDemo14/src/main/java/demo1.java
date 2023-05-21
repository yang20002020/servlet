import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
使用字节流的方式输出中文
 */
@WebServlet(urlPatterns = "/demo14")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        test2(resp);
    }
    private void test1( HttpServletResponse resp) throws IOException {
        //使用字节流的方式输出中文：
        ServletOutputStream outputStream=resp.getOutputStream();
        outputStream.write("中文".getBytes());
        /*
        ****使用上述代码向页面输出中文是否会有乱码？
        不一定
        其实这个乱码的产生与中文转成字节数组及浏览器打开方式（打开的时候采用的默认字符集）有关
        解决：
        将中文转成字节数组的时候和浏览器默认打开的时候采用的字符集一致即可。
         */
    }
    private void test2(HttpServletResponse resp) throws IOException {
         //使用字节流的方式输出中文：
        ServletOutputStream outputStream=resp.getOutputStream();
        //设置浏览器默认打开的时候采用的字符集
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        //设置中文转成字节数组字符集编码
        outputStream.write("中文".getBytes("UTF-8"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
