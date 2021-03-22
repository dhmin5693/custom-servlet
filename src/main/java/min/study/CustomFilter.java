package min.study;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("Custom Filter init.");
    }

    @Override
    public void destroy() {
        System.out.println("Custom Filter destroy.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

        System.out.println("Custom Filter doFilter");
        chain.doFilter(request, response); // chain to next filter
    }
}
