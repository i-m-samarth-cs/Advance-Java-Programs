import javax.swing.*;
public class MyDialog
{
  JFrame frame;
  MyDialog()
  {
	frame=new JFrame();
	JOptionPane.showMessageDialog(frame,"hello welcome to MAC","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  public static void main(String args[])
  {
	new MyDialog();
  }
}