package min.study;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("CustomListener context initialized.");
        sce.getServletContext().setAttribute("name", "MIN");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("CustomListener context destroyed.");
    }
}
