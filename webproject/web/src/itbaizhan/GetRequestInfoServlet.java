package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 获取请求信息
 */
public class GetRequestInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取浏览器发出请求的完整的URL
        String requestURL = req.getRequestURL().toString();

        //获取请求行中指定资源部分
        String requestURI = req.getRequestURI();

        //获取发送请求的客户端IP地址
        String clinetAddr = req.getRemoteAddr();

        //获取服务端IP地址
        String serverAddr = req.getLocalAddr();

        //获取服务端监听的端口
        int port = req.getLocalPort();

        PrintWriter pw = resp.getWriter();
        pw.println("URL:" + requestURL);
        pw.println("URI:" + requestURI);
        pw.println("ClinetAddr:" + clinetAddr);
        pw.println("ServerAddr:" + serverAddr);
        pw.println("Port:" + port);
        pw.flush();
        pw.close();

    }
}
