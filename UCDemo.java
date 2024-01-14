import java.net.*;
import java.io.*;
import java.util.Date;

class UCDemo
{
  public static void main(String args[]) throws Exception
  {
	int c;
	URL hp=new URL("http://www.google.com");
	
	//Create connection with the specified "url"
	URLConnection hpCon=hp.openConnection();
	System.out.println("\n Date:"+ new Date (hpCon.getDate()));
	System.out.println("\n Content Type:"+hpCon.getContentType());
	System.out.println("\n Expires:"+hpCon.getExpiration());
	System.out.println("\n Last-Modified:"+new Date(hpCon.getContentType()));

    int len=hpCon.getContentLength();
	System.out.println("\n Content Length="+len);

	try
	{
		if(len>0)
		{
			System.out.println("\n Content \n");
			InputStream input=hpCon.getInputStream();
			int i=len;
			while(((c=input.read())!=-1)&&(i>0))
			{
				System.out.println((char)c);
			}
			input.close();
	 }
	 else
	 {
		System.out.println("\n No Content Available");
     }
   }
   catch(Exception e)
   {
	  System.out.println("\n Error");
   }
 }
}


	