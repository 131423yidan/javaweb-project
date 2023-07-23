package itbaizhan.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 第一个Filter案例
 */
public class FirstFilter implements Filter {

    /**
     * 当Filter对象被实例化后，会立即调用的一个方法.
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init......");
    }

    /**
     * 过滤请求与响应的。当客户端浏览器请求的URL与Filter所定义的URL-Pattern所匹配，
     * 那么该请求会进入到该方法进行过滤
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //对请求进行处理
        System.out.println("请求被过滤");
        //对请求做放行处理
        filterChain.doFilter(servletRequest, servletResponse);

        //对响应进行处理
        System.out.println("响应被过滤");
    }

    /**
     * 当Fileter对象在销毁之前会调用一次该方法
     */
    @Override
    public void destroy() {

    }
}
