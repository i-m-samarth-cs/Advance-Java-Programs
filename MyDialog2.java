import java.awt.event.*;
import javax.swing.*;

public class MyDialog2 extends WindowAdapter
{
  JFrame frame;
  String name;
  MyDialog2()
  {
	frame=new JFrame();
	frame.addWindowListener(this);
	frame.setSize(500,500);
	frame.setVisible(true);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	name=JOptionPane.showInputDialog("Enter Your Name:");
   System.out.println("\n\n Your Name is:"+name);
  }
  public static void main(String args[])
  {
	new MyDialog2();
  }
}