import java.awt.*;
import java.awt.event.*;

//Code to Close the Program using Close Button
class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Exiting the Frame");
		System.exit(0);
	}
}

public class WindowAdapterTest 
{
	public static void main(String args[])
	{
		Frame F = new Frame("My First Frame");
		
		F.setVisible(true);
		F.setSize(500,500);
		
		WindowListener listner = new MyAdapter();
		F.addWindowListener(listner);
		
		//F.setTitle("new Frame");
	}
}