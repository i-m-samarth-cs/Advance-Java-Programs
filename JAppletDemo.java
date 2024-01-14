import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class JAppletDemo extends JApplet
{
  Container c;
  JLabel l1;

  public void init()
  {
    c=getContentPane();
    c.setLayout(null);

    c.setBackground(Color.red);

    l1= new JLabel("Label L1");
    l1.setSize(100,50);
	l1.setLocation(50,50);

    l1.setOpaque(true);
    l1.setBackground(Color.blue);

    c.add(l1);
  }
}

/*
 <Applet code="JAppletDemo.java" width=500 height=500>
 </Applet>
*/