import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ScrollbarDemo1 extends Applet implements AdjustmentListener,MouseMotionListener
{
  String msg="";
  Scrollbar vsb,hsb;
  Font f;

  public void init()
  {
    int width=Integer.parseInt(getParameter("width"));
    int height=Integer.parseInt(getParameter("height"));

vsb=new Scrollbar(1,40,40,0,height-30);
hsb=new Scrollbar(0,40,40,0,width-30);

	add(vsb);
	add(hsb);

	vsb.addAdjustmentListener(this);
	hsb.addAdjustmentListener(this);

	setLayout(null);

	vsb.setSize(30,height-30);
	hsb.setSize(width-30,30);

	f=new Font("Times New Roman",Font.ITALIC,25);
	setBackground(Color.cyan);
  }
  public void adjustmentValueChanged(AdjustmentEvent e)
  {
	repaint();
  }
  public void mouseDragged(MouseEvent e)
  {
	int x=e.getX();
	int y=e.getY();

	hsb.setValue(x);
	vsb.setValue(y);

	repaint();
  }
  public void mouseMoved(MouseEvent e)
  {
	//EMPTY
  }
  public void paint(Graphics g)
  {
    msg="Vertical:"+vsb.getValue()+" Horizontal:"+hsb.getValue();

	g.drawString(msg,10,50);
	g.setFont(f);

	g.drawString("SAMARTH",hsb.getValue(),vsb.getValue());
  }
}

/*
  <Applet code="ScrollbarDemo1.java"width=600 height=600>
  </Applet>
*/


