package itbaizhan;

/**
 * 自启动Servlet
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AutoStartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("AutoStartServlet......");
        pw.flush();
        pw.close();
    }

    @Override
    public void init() throws ServletException {
        ServletConfig servletConfig = this.getServletConfig();
        //获取servlet标签中的配置信息
        String value = servletConfig.getInitParameter("path");
        //获取全局容器对象
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("path", value);
        System.out.println("AutoStartServlet Init......");
    }
}
