import java.awt.*;
import java.applet.*;

public class ButtonDemo extends Applet
{
   Button b1,b2,b3;
   public void init()
   {
      b1=new Button("Add");
	  b2=new Button("Modify");
	  b3=new Button("Delete");

	  add(b1);
	  add(b2);
	  add(b3);
      
	  setBackground(Color.cyan);
      setForeground(Color.red);
   }
}

/*
  <applet code=ButtonDemo.java width=500 height=500>
  </applet>
*/