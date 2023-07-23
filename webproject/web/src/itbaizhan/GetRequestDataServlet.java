package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * 获取请求数据
 */
public class GetRequestDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码
        req.setCharacterEncoding("utf-8");
        //获取用户名
        String username = req.getParameter("username");
        //String name = new String(username.getBytes("ISO-8859-1"),"UTF-8");
        //System.out.println(name);
        System.out.println(username);
        //获取用户密码
        String userpwd = req.getParameter("userpwd");

        //获取复选框的数据
        String[] userlikes = req.getParameterValues("userlike");
        List<String> list = Arrays.asList(userlikes);

        //获取表单中的所有Key
        Enumeration<String> parameterNames = req.getParameterNames();
        List<String> paraList = new ArrayList<>();
        while (parameterNames.hasMoreElements()) {
            paraList.add(parameterNames.nextElement());
        }

        //使用Map结构获取提交数据
        Map<String, String[]> parameterMap = req.getParameterMap();
        Iterator<Map.Entry<String, String[]>> iterator = parameterMap.entrySet().iterator();
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("UserName:" + username);
        pw.println("PassWord:" + userpwd);
        pw.println("UserLike:" + list);
        pw.println("Names:" + paraList);
        while (iterator.hasNext()) {
            Map.Entry<String, String[]> entry = iterator.next();
            String key = entry.getKey();
            String[] value = entry.getValue();
            pw.println(key + " = " + Arrays.asList(value));
        }
        pw.flush();
        pw.close();
    }
}
