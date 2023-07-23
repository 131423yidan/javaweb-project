package itbaizhan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 设置字节型响应
 */
public class ResponseByteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //给定读取响应图片的路径
        File file = new File("d:/1.jpg");
        //创建读取图片的IO流对象
        InputStream is = new FileInputStream(file);
        //图片缓冲区
        byte[] buff = new byte[is.available()];
        is.read(buff);

        //设置响应类型
        resp.setContentType("image/jpeg");
        //获取字节输出流对象
        OutputStream os = resp.getOutputStream();
        os.write(buff);
        os.flush();
        os.close();

    }
}
