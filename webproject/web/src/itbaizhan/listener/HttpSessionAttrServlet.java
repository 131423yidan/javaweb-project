package itbaizhan.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 测试HttpSession属性监听器
 */
@WebServlet("/sessionAttr.do")
public class HttpSessionAttrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取HttpSession对象
        HttpSession session = req.getSession();
        session.setAttribute("key", "HJSXT");
        session.setAttribute("key", "ITBZ");
        session.removeAttribute("key");
    }
}
