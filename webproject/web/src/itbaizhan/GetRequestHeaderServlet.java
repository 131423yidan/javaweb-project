package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * 获取请求头信息
 */
public class GetRequestHeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根据指定的Key获取请求头信息
        String headerInfo = req.getHeader("Accept-Encoding");

        //获取请求头中的所有数据
        Enumeration<String> headerNames = req.getHeaderNames();

        PrintWriter pw = resp.getWriter();
        pw.println("Header Info - Accept-Encoding:" + headerInfo);
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = req.getHeader(key);
            pw.println(key + " : " + value);
        }
        pw.flush();
        pw.close();
    }
}
