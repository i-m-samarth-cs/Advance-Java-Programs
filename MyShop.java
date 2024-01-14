import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyShop extends GenericServlet
{
    public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
    {
        try
        {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            out.println("<html>");
            out.println("<head><title>BIG BAZZAR BILL</title></head>");
            out.println("<body bgcolor=cyan>");
            out.println("<font color=red size=5>");
            double bill=0;
            String amount[]=request.getParameterValues("product");
            for(int i=0;i<amount.length;i++)
            {
                bill=bill+Double.parseDouble(amount[i]);
            }
            out.println("<br><br> Final Bill </h1><br><br>");
            out.println("Total Amount:"+bill);
            out.println("</font></body>");
            out.println("<html>");
            
        }
        catch(Exception e)
        {
            
        }
    }

  
}