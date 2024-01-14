//  Server Side Programming


import java.net.*;
import java.io.*;

class Servers1
{
	public static void main(String args[])
	{
		try
		{
			// create Server Socket
			ServerSocket SS = new ServerSocket(3457);
			Socket S = SS.accept();
			int fact=1;

			System.out.println("\n\n Server Started....");
			
			System.out.println("\n\n Client Connected To Server...");

			// Create Streams for Input and Output Operations 
			InputStream input = S.getInputStream();
			OutputStream output = S.getOutputStream();
				
			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			// Server is running
			String str = datain.readUTF();
			String str1=datain.readUTF();
			System.out.print(" "+str);
			int num=Integer.parseInt(str1);

for(int i=1;i<=num;i++)
{
   fact = fact*i;
}		
dataout.writeUTF(""+fact);
System.out.println("\n\n Sending Result.....");

		}
		catch(Exception e)
		{

		}
	}
}