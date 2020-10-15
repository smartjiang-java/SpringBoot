package jqk.learn.javase.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * ClassName:MyFilter
 * Package:com.bjpowernode.springboot.filter
 * Description:
 *
 * @date:2020/3/9 14:07
 * @author:蛙课网
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------------------您已进入过滤器-222-------------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
