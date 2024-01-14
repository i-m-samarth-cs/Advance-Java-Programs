//  Client Side Programming

import java.net.*;
import java.io.*;
import java.util.*;
public class Client3 
{
	public static void main(String args[])
	{
		InetAddress ip = null;
		Scanner s=new Scanner(System.in);
		String str;
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
			Socket sock = new Socket(ip,3459);

		// Create Input and Output Streams for communicating with server
			InputStream input = sock.getInputStream();

			OutputStream output = sock.getOutputStream();

			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			System.out.println("\n\n Client Started");
	        System.out.println("\n\n Enter Username:");
		    str=s.next();
			

			// Client is running
			System.out.println("\n\n Sending Message To Server..... ");

			

			// Sent to Server
			dataout.writeUTF(""+str);

			// Received from Server
			String str1 = datain.readUTF();
		
			System.out.println("\n\n Message Recieved" +str1);
		}
		catch(Exception e)
		{

		}
	}
}