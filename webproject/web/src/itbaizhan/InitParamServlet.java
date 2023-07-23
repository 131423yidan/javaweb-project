package itbaizhan;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 配置初始化参数
 */
@WebServlet(urlPatterns = "/initParam.do", initParams = {@WebInitParam(name = "key1", value = "BJSXT"), @WebInitParam(name = "key2", value = "ITBZ")}, loadOnStartup = 1)
public class InitParamServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //获取ServletConfig
        ServletConfig servletConfig = this.getServletConfig();
        String value1 = servletConfig.getInitParameter("key1");
        String value2 = servletConfig.getInitParameter("key2");
        System.out.println(value1);
        System.out.println(value2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletConfig
        ServletConfig servletConfig = this.getServletConfig();
        String value1 = servletConfig.getInitParameter("key1");
        String value2 = servletConfig.getInitParameter("key2");
        PrintWriter pw = resp.getWriter();
        pw.println(value1);
        pw.println(value2);
        pw.flush();
        pw.close();
    }
}
