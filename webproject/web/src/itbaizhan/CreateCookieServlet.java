package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建Cookie对象
        Cookie cookie = new Cookie("key", "百战程序员");
        //指定失效时间。一旦指定失效时间。那么该Cookie则为持久化Cookie
        cookie.setMaxAge(60);
        //将Cookie写回给客户端浏览器
        resp.addCookie(cookie);

        PrintWriter pw = resp.getWriter();
        pw.println("Create Cookie OK");
        pw.flush();
        pw.close();
    }
}
