import java.io.*;
import javax.servlet.*;

public class ClientServerContainer extends GenericServlet
{
  public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
  {
    try
    {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<head><title>Servlet</title></head>");
	    out.println("<body bgColor='yellow'>");
		out.println("<font color='red' size='5'>");
		out.println("<h1>This is Servlet Page</h1>");
		String nm=req.getParameter("1");
		out.println("<h2> Welcome"+nm+"</h2>");
       out.close();
   }
   catch(Exception e)
   {
	  //Exception
   }
 }
}