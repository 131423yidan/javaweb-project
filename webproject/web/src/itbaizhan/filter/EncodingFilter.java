package itbaizhan.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 设置请求编码过滤器
 */
public class EncodingFilter implements Filter {
    //设置默认编码
    private String defaultCode = "utf-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String code = filterConfig.getInitParameter("code");
        if (code != null && code.length() > 0) {
            this.defaultCode = code;
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //设置请求编码
        servletRequest.setCharacterEncoding(this.defaultCode);
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
