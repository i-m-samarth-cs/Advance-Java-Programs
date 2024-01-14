import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class CheckBoxDemo2 extends Applet implements ItemListener
{
  Checkbox idea,airtel,vodafone,reliance;
  String msg="";
  Font f=null;
  public void init()
  {
     f=new Font("Times New Roman",Font.BOLD,20);
    setFont(f);
	idea=new Checkbox("Idea");
	airtel=new Checkbox("Airtel");
	vodafone=new Checkbox("Vodafone");
	reliance=new Checkbox("Reliance");

	add(idea);
	add(airtel);
	add(reliance);
	add(vodafone);

	idea.addItemListener(this);

	airtel.addItemListener(this);

	reliance.addItemListener(this);

	vodafone.addItemListener(this);

	idea.setBackground(Color.red);
	idea.setForeground(Color.yellow);

	airtel.setBackground(Color.red);
	airtel.setForeground(Color.yellow);

	setBackground(Color.cyan);
	setForeground(Color.black);
  }
  public void itemStateChanged(ItemEvent e)
  {
	repaint();
  }
  public void paint(Graphics g)
  {
   
    msg="Current State of Checkboxes";
    g.drawString(msg,50,100);

	msg="Idea:"+idea.getState();
	g.drawString(msg,50,150);

	msg="Airtel:"+airtel.getState();
	g.drawString(msg,50,200);

	msg="Reliance:"+reliance.getState();
	g.drawString(msg,50,250);

	msg="Vodafone:"+vodafone.getState();
	g.drawString(msg,50,300);

  }
}

/*
 <Applet code="CheckBoxDemo2.java" width=500 height=500>
 </Applet>
*/




