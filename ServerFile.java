import java.net.*;
import java.io.*;
public class ServerFile
{
            public static void main(String args[])throws IOException
            {
                        byte b[]=new byte[3072];
                        DatagramSocket dsoc=new DatagramSocket(2019);
                        FileOutputStream f=new FileOutputStream("C:/Users/Admin/OneDrive/Desktop/AJP/Client Server/Client.txt");
                         
                         
                                    DatagramPacket dp=new DatagramPacket(b,b.length);
                                    dsoc.receive(dp);
                                    String data = new String(dp.getData(),0,dp.getLength());  
                                    f.write(data.getBytes(), 0, data.length());
                         
            }
}