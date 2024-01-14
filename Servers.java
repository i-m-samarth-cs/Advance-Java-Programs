// 46. WAP to create a CLIENT_SERVER application
// OR  Server Side Programming


import java.net.*;
import java.io.*;

class Servers
{
	public static void main(String args[])
	{
		try
		{
			// create Server Socket
			ServerSocket SS = new ServerSocket(3456);
			Socket S = SS.accept();

			System.out.println("\n\n Server Started....");
			
			System.out.println("\n\n Client Connected To Server...");

			// Create Streams for Input and Output Operations 
			InputStream input = S.getInputStream();
			OutputStream output = S.getOutputStream();
				
			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			// Server is running
			String str = datain.readUTF();

			System.out.print("\n\n Message Received From client : " + str);	

			System.out.print("\n\n Sendng Message To Client...\n\n");

			dataout.writeUTF("\n\n Hi Client \n\n");
		}
		catch(Exception e)
		{

		}
	}
}