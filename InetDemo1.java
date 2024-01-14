import java.io.*;
import java.net.*;

public class InetDemo1
{
   public static void main(String args[])
   {
	  try
	  {
		InetAddress ip=InetAddress.getByName("www.javatpoint.com");
		System.out.println("Host Name:"+ip.getHostName());
		System.out.println("IP Address:"+ip.getHostAddress());
		InetAddress ips[]=InetAddress.getAllByName("www.msbte.org.in");	
	   for(int i=0;i<ips.length;i++)
       {
		  System.out.println("\n\n"+ips[i]);
	   }
     }
	 catch(Exception e)
     {
	 	System.out.println(e);
     }
  }
}
	   