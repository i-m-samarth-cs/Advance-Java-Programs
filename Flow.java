import java.awt.*;
import java.awt.event.*;
class MyAdapter extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
     System.exit(0);
  }
}
public class Flow extends Frame
{
  Label l1,l2;
  Flow(String title)
  {
     super(title);
     l1=new Label("Samarth");
     l2=new Label("Shendre");
     add(l1);
     add(l2);
     addWindowListener(new MyAdapter());
     l1.setBackground(Color.cyan);
     l2.setForeground(Color.red);
  }
  public static void main(String args[])
  {
    Flow F=new Flow("FlowLayout Design");
    F.setLayout(new FlowLayout(FlowLayout.TRAILING));
    F.setVisible(true);
    F.setSize(500,500);
  }
}