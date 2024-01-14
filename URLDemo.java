import java.net.*;

public class URLDemo
{
  public static void main(String args[])
  {
	try
	{
	  URL url=new URL("http://www.msbte.org.in/website/");
	  
	  System.out.println("\n Protocol:"+url.getProtocol());
	  System.out.println("\n Port No:"+url.getPort());
	  System.out.println("\n Host Name:"+url.getHost());
	  System.out.println("\n File Name:"+url.getFile());
	  System.out.println("\n External Form:"+url.toExternalForm());

   }
   catch(Exception e)
   {
	  System.out.println("\n Error");
   }
}
}

	