package itbaizhan.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet Context属性监听器测试servlet
 */
@WebServlet("/attr.do")
public class ServletContextAttrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("key", "BJSXT");
        servletContext.setAttribute("key", "ITBZ");
        servletContext.removeAttribute("key");
    }
}
