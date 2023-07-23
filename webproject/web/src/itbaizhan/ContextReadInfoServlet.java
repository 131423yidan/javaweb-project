package itbaizhan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * 读取web.xml配置文件中的<context-param>节点信息
 */
public class ContextReadInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext servletContext = this.getServletContext();
        //获取所有的<param-name>的值
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();

        PrintWriter pw = resp.getWriter();

        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            String value = servletContext.getInitParameter(name);
            pw.println("Name:" + name + " = value" + value);
        }
        pw.flush();
        pw.close();
    }
}
