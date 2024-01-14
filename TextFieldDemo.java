import java.awt.*;
import java.applet.*;

public class TextFieldDemo extends Applet
{
  TextField t1,t2,t3;
  
  public void init()
  {
    t1=new TextField(10);
    t2=new TextField(20);
    t3=new TextField(30);
    add(t1);
    add(t2);
    add(t3);
    setBackground(Color.cyan);
    setForeground(Color.red);
   }
}

/*
<applet code=TextFieldDemo.java width=500 height=500>
</applet>
*/