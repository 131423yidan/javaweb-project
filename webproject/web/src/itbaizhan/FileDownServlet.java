package itbaizhan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 文件下载
 */
public class FileDownServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext servletContext = this.getServletContext();
        //获取存放图片的目录名称
        String value = (String) servletContext.getAttribute("path");
        System.out.println(value);
        //路径转换
        String realPath = servletContext.getRealPath(value + "/台球桌.jpg");
        System.out.println(realPath);
        //读取下载文件
        File file = new File(realPath);
        InputStream is = new FileInputStream(file);
        byte[] buff = new byte[is.available()];
        is.read(buff);
        //在响应中添加附件信息
        resp.addHeader("Content-Disposition", "attachment;filename=" + new String(file.getName().getBytes("gbk"), "iso-8859-1"));
        //产生响应
        OutputStream os = resp.getOutputStream();
        os.write(buff);
        os.flush();
        os.close();
    }
}
