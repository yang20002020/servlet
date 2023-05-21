import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
/*
request接收表单参数
 */
@WebServlet(urlPatterns = "/demo16")
public class demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //接收用户名和密码
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //接收性别和籍贯
        String sex=request.getParameter("sex");
        String city=request.getParameter("city");
        //接收爱好
        String[] hobby=request.getParameterValues("hobby");
        //接收自我介绍
        String info=request.getParameter("info");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("性别:"+sex);
        System.out.println("籍贯："+city);
        System.out.println("爱好："+ Arrays.toString(hobby));
        System.out.println("自我介绍："+info);
        System.out.println("--------------------------");
        Map<String,String[]> map=request.getParameterMap();
        for(String key:map.keySet()){
            String[] value=map.get(key);
            System.out.println(key+" " +Arrays.toString(value));
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
