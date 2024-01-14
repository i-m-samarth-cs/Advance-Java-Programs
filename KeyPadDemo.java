import java.awt.*;
import java.applet.*;

public class KeyPadDemo extends Applet
{
  public void init()
  {
    setFont(new Font("Times New Roman",Font.BOLD,20));
    GridLayout g1=new GridLayout(4,3);
    setLayout(g1);

    for(int i=1;i<=9;i++)
    {
	   add(new Button(""+i));
    }
    Button b1=new Button("*");
    Button b2=new Button("0");
    Button b3=new Button("#");

    add(b1);
    add(b2);
    add(b3);
 }
}

/*
 <Applet code="KeyPadDemo.java" width=500 height=500>
  </Applet>
*/

