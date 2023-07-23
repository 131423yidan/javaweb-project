package itbaizhan;
/**
 * 字符设置
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseCharacterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应类型
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html lang=en>");
        pw.println("<head>");
        pw.println("<meta charset=UTF-8>");
        pw.println("<title>Document</title>");
        pw.println("<head>");
        pw.println("<body>");
        pw.println("<font color=blue>百战程序员</font>");
        pw.println("</body>");
        pw.println("</html>");
        pw.flush();
        pw.close();
    }
}
