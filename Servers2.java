//  Server Side Programming


import java.net.*;
import java.io.*;

class Servers2
{
	public static void main(String args[])
	{
		try
		{
			// create Server Socket
			ServerSocket SS = new ServerSocket(3458);
			Socket S = SS.accept();
			
			System.out.println("\n\n Server Started....");
			
			System.out.println("\n\n Client Connected To Server...");

			// Create Streams for Input and Output Operations 
			InputStream input = S.getInputStream();
			OutputStream output = S.getOutputStream();
				
			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			// Server is running
			
			String str1=datain.readUTF();
			System.out.print(" "+str1);
			int num=Integer.parseInt(str1);
String str2=datain.readUTF();
			System.out.print(" "+str2);
			int num1=Integer.parseInt(str2);
String str3=datain.readUTF();
			System.out.print(" "+str3);
			int num2=Integer.parseInt(str3);


if(num>num1 && num>num2)
{
  dataout.writeUTF(" "+num);
}
else if(num1>num && num1>num2)
{
  dataout.writeUTF(" "+num1);
}
else if(num2>num && num2>num1)
{
  dataout.writeUTF(" "+num2);
}
else
{
  dataout.writeUTF("All Same");
}	

System.out.println("\n\n Sending Result.....");

		}
		catch(Exception e)
		{

		}
	}
}