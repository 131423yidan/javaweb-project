package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie
        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("welcome".equals(cookie.getName())) {
                    flag = true;
                    break;
                }
            }
        }

        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        if (flag) {
            pw.println("欢迎你回来！");
        } else {
            pw.println("你好。欢迎你的第一次访问！");
            Cookie cookie = new Cookie("welcome", "welcome");
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
        }
    }
}
