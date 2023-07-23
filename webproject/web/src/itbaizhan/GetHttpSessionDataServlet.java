package itbaizhan;

/**
 * 获取HttpSession中的数据
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetHttpSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取HttpSession对象
        HttpSession session = req.getSession();
        //获取数据
        String value = (String) session.getAttribute("key");

        PrintWriter pw = resp.getWriter();
        pw.println(value);
        pw.flush();
        pw.close();
    }
}
