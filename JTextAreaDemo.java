import java.awt.*;
import javax.swing.*;

public class JTextAreaDemo extends JApplet
{
  JTextArea txt;
  Container c;

  public void init()
  {
	c=getContentPane();
	c.setLayout(new FlowLayout());

	txt=new JTextArea("Hello World",10,20);

    c.add(txt);
  }
}

/*
 <Applet code="JTextAreaDemo.java" width=500 height=500>
 </Applet>
*/