import java.io.*;
import javax.servlet.*;

public class ClientServerCommunication extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        try
        {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<html>");
            out.println("<head><title>Servlet</title></head>");
            out.println("<body bgcolor='Skyblue'>");
            out.println("<font color=red size=5>");
            out.println("<h1>This is a Servlet Page</h1>");
            String nm = req.getParameter("1");
            out.println("<h1>Your Name: "+nm+"</h1>");
            out.println("</font></body></html>");
            out.close();
            
        }
        catch(Exception e)
        {
            
        }
    }
    
}
