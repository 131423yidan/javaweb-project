package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        boolean flag = true;
        if (session == null) {
            flag = false;
            req.getSession();
        }
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        if (flag) {
            pw.println("欢迎你回来！");
        } else {
            pw.println("你好。欢迎你的第一次访问！");

        }
    }
}
