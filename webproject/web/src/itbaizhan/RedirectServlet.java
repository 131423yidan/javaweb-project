package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码
        req.setCharacterEncoding("utf-8");
        //获取用户搜索数据
        String search = req.getParameter("search");
        //产生重定向响应
        resp.sendRedirect("https://www.baidu.com/s?wd=" + URLEncoder.encode(search, "utf-8"));
    }
}
