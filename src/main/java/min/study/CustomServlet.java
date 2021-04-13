package min.study;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class CustomServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("Custom Servlet Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        ApplicationContext context =
            (ApplicationContext) getServletContext().getAttribute(
                WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

        HelloService helloService = context.getBean(HelloService.class);

        System.out.println("doGet");

        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>Hello, This is custom servlet.</h1>");
        resp.getWriter().println("<h1>my name is "
            + helloService.getName()
            + ".</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</head>");
        resp.getWriter().println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Custom Servlet Destroy");
    }
}
