import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyDialog1 extends  WindowAdapter
{
  JFrame frame;
  MyDialog1()
  {
	frame=new JFrame();
    frame.addWindowListener(this);
    frame.setSize(500,500);
	frame.setVisible(true);
  }
  public void windowClosing(WindowEvent e)
  {
	int a=JOptionPane.showConfirmDialog(frame,"Are you Sure?");
    if(a==0)
    {
	  System.exit(0);
	}
	else
	{
	   System.out.println("\n Frame is not closed but is Hidden");
	}
 }
 public static void main(String args[])
 {
	new MyDialog1();
 }
}