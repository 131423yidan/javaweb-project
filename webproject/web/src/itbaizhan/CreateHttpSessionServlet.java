package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 创建HttpSession对象
 */
public class CreateHttpSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建HttpSession对象
        HttpSession session = req.getSession();

        //存放数据
        session.setAttribute("key", "ITBZ");
        //获取sessionID
        String sessionID = session.getId();
        System.out.println(session);

        PrintWriter pw = resp.getWriter();
        pw.println("Create HttpSession OK!" + sessionID);
        pw.flush();
        pw.close();
    }
}
