package jqk.learn.javase.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName:MyFilter
 * Package:com.bjpowernode.springboot.filter
 * Description:
 *
 * @date:2020/3/9 14:03
 * @author:蛙课网
 */
@WebFilter(urlPatterns = "/myfilter")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------------------您已进入过滤器---------------------");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
