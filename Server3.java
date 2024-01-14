//  Server Side Programming


import java.net.*;
import java.io.*;

class Server3
{
	public static void main(String args[])
	{
		try
		{
			// create Server Socket
			ServerSocket SS = new ServerSocket(3459);
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

			System.out.print("\n\n Sending Message To Client...\n\n");
           
			dataout.writeUTF("\n\n Hello "+str);
		}
		catch(Exception e)
		{

		}
	}
}