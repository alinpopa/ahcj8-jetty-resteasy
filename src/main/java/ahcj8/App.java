package ahcj8;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServlet30Dispatcher;

public class App {
    public static void main(String[] args) throws Exception{
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        context.setContextPath("/");
        ServletHolder servletHolder = new ServletHolder(new HttpServlet30Dispatcher());
        servletHolder.setInitParameter("javax.ws.rs.Application", "ahcj8.KVResources");
        context.addServlet(servletHolder, "/*");
        server.setHandler(context);
        server.start();
        server.join();
    }
}
