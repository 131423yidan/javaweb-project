package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html lang=en>");
        pw.println("<head>");
        pw.println("<meta charset=UTF-8>");
        pw.println("<title>Document</title>");
        pw.println("<head>");
        pw.println("<body>");
        pw.println("<font color=blue>HelloWorld</font>");
        pw.println("</body>");
        pw.println("</html>");
        pw.flush();
        pw.close();
    }
}
