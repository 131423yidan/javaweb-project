package itbaizhan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * 文件上次传
 */
@WebServlet("/fileUpload.do")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取文件描述
        String desc = req.getParameter("desc");
        //获取上传文件 aa.jar
        Part part = req.getPart("file");
        //处理文件名
        String newName = UUID.randomUUID().toString() + part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));
        //路径转换
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("image/" + newName);
        System.out.println(realPath);
        //文件的保存
        part.write(realPath);

        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println(desc);
        pw.flush();
        pw.close();

    }
}
