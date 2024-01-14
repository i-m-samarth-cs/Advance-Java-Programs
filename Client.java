// 46. WAP to create a CLIENT_SERVER application
// OR  Client Side Programming

import java.net.*;
import java.io.*;

public class Client 
{
	public static void main(String args[])
	{
		InetAddress ip = null;

		try
 		{
			// Get InetAddress of Client
			try
			{
				ip = InetAddress.getLocalHost();
				System.out.println("Local Host : " +ip);
			}
			catch(Exception e)
			{	
			
			}


			// Create Socket to get connected to server
			Socket sock = new Socket(ip,3456);

		// Create Input and Output Streams for communicating with server
			InputStream input = sock.getInputStream();

			OutputStream output = sock.getOutputStream();

			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			System.out.println("\n\n Client Started");
	
			Thread.sleep(2000);

			// Client is running
			System.out.println("\n\n Sending Message To Server..... ");

			Thread.sleep(5000);

			// Sent to Server
			dataout.writeUTF("Hello Server");

			// Received from Server
			String str = datain.readUTF();
		
			System.out.println("\n\n Message Received From Server : " +str);
		}
		catch(Exception e)
		{

		}
	}
}