import java.awt.*;
import javax.swing.*;

public class JScrollBarDemo2 extends JApplet
{
  Container c;
  JScrollBar js1,js2;

  public void init()
  {
	c=getContentPane();
    c.setLayout(new FlowLayout());
    c.setBackground(Color.cyan);

	js1=new JScrollBar(JScrollBar.HORIZONTAL,50,30,0,500);
	js1.setSize(570,30);
	js1.setLocation(0,570);

	c.add(js1);

js2=new JScrollBar(JScrollBar.VERTICAL,50,30,0,500);
	js2.setSize(30,570);
	js2.setLocation(570,0);

	c.add(js2);
  }
}

/*
  <Applet code="JScrollBarDemo2" width=500 height=500>
  </Applet>
*/
