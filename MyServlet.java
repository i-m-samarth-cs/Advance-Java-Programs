import java.io.*;
import javax.servlet.*;

public class MyServlet extends GenericServlet
{
    @Override
    public void service(ServletRequest req,ServletResponse res)
    {
        res.setContentType("text/html");
        
        try(PrintWriter out=res.getWriter())
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Demo </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<font color=red size=5>");
            out.println("<h1><b> Welcome to Servlets</h1>");
            out.println("</font>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            
        }
    }
}