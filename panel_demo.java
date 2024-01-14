import java.awt.*;
import java.applet.*;

class MyPanel extends Panel
{
  public MyPanel()
  {
	Label l1=new Label("This is from Panel");
    Button b1=new Button("Panel");
    add(l1);
	add(b1);
  }
}
public class panel_demo extends Applet
{
  public void init()
  {
	MyPanel p1=new MyPanel();
    
	Checkbox c1=new Checkbox("From Applet");
    add(p1);
	add(c1);
    Frame f1=new Frame();
    f1.setTitle("Frame Showing Panel");
    f1.setSize(400,300);
    f1.setVisible(true);
  }
}
class MyFrame extends Frame
{
  public MyFrame()
  {
	setLayout(null);
    MyPanel p2=new MyPanel();
    Checkbox c1=new Checkbox("From Frame");
    add(p2);
	add(c1);
    p2.setBounds(50,50,200,50);
    c1.setBounds(200,200,100,20);
  }
}

/*
 <Applet code="panel_demo.java" width=500 height=500>
 </Applet>
*/