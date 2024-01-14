import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet
{
  Label l1,l2,l3;
  public void init()
  {
    l1=new Label("G",Label.LEFT);
    l2=new Label("P",Label.CENTER);
    l3=new Label("D",Label.RIGHT);
   
	add(l1);
	add(l2);
	add(l3);
    setBackground(Color.cyan);
	setForeground(Color.green);
  }
}

/*
  <applet code=LabelDemo.java width=500 height=500>
  </applet>
*/