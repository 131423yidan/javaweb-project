package itbaizhan.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试HttpServletRequest属性监听器
 */
@WebServlet("/requestAttr.do")
public class HttpServletRequestAttrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("key", "BJSXT");
        req.setAttribute("key", "ITBZ");
        req.removeAttribute("key");
    }
}
