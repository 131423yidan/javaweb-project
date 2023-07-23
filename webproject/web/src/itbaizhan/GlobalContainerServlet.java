package itbaizhan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局容器的使用
 */
public class GlobalContainerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContextdx
        ServletContext servletContext = this.getServletContext();
        String value1 = (String) servletContext.getAttribute("key1");
        String value2 = (String) servletContext.getAttribute("key2");
        PrintWriter pw = resp.getWriter();
        pw.println(value1);
        pw.println(value2);
        pw.flush();
        pw.close();
    }

    /**
     * 向ServletContext对象中添加初始化数据
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        //获取SercletContext对象
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("key1", "BJSXT");
        servletContext.setAttribute("key2", "BJSXT");
    }
}
