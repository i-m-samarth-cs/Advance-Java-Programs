import java.awt.*;
import java.applet.*;

public class ScrollbarDemo extends Applet
{
  Scrollbar vsb,hsb;
  int verti,hori;
  public void init()
  {
    verti=Scrollbar.VERTICAL;
    hori=Scrollbar.HORIZONTAL;

    vsb=new Scrollbar(verti,20,50,0,100);
    hsb=new Scrollbar(hori,20,50,0,100);

    add(hsb);
    add(vsb);

    setBackground(Color.cyan);
    setForeground(Color.red);
  }
}

/*
  <applet code="ScrollbarDemo.java" width=500 height=500>
  </applet>
*/