import java.awt.*;
import java.awt.event.*;  //Sub Packgae event

class MyAdapter extends WindowAdapter  //If only one event method required
{
  public void windowClosing(WindowEvent e)
  {
    System.out.println("Frame Exited");
    System.exit(0);
  }
}
public class WindowAdapterDemo
{
  public static void main(String args[])
  {
    Frame F=new Frame("Frame 1");
    F.setVisible(true);
    F.setSize(500,500);
 
    WindowListener listner=new MyAdapter();
    F.addWindowListener(listner);
  }
}
