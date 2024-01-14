//Client Side Programming

import java.net.*;
import java.io.*;
import java.util.*;

public class Client1 
{
	public static void main(String args[])
	{
		InetAddress ip = null;
		Scanner s=new Scanner(System.in);
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
			Socket sock = new Socket(ip,3457);

		// Create Input and Output Streams for communicating with server
			InputStream input = sock.getInputStream();

			OutputStream output = sock.getOutputStream();

			DataInputStream datain = new DataInputStream(input);

			DataOutputStream dataout = new DataOutputStream(output);

			System.out.println("\n\n Client Started");
	
			System.out.println("\n Enter any Number :");
			int a=s.nextInt();

			// Client is running
			System.out.println("\n\n Sending Message To Server..... ");



			// Sent to Server
			dataout.writeUTF("Number is:"+a);
			dataout.writeUTF(""+a);
			// Received from Server
			String str = datain.readUTF();
			int str1=Integer.parseInt(str);
		    System.out.println("Factorial is :"+str1);
			
		}
		catch(Exception e)
		{

		}
	}
}