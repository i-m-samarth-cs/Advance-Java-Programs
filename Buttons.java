import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Buttons extends Applet implements ActionListener
{
  Button b1,b2,b3;
  String msg="",str1="",str2="",str3="";
  
  public void init()
  {
 	b1=new Button("Add");
    b2=new Button("Modify");
 	b3=new Button("Delete");

	add(b1);
	add(b2);
	add(b3);

	b1.addActionListener(this);

	b2.addActionListener(this);

	b3.addActionListener(this);

	str1=b1.getLabel();
	str2=b2.getLabel();
	str3=b3.getLabel();

	System.out.println("\n Button1:"+str1);
	System.out.println("\n Button2:"+str2);
	System.out.println("\n Button3:"+str3);

	setBackground(Color.cyan);
	setForeground(Color.red);
 }
 public void actionPerformed(ActionEvent e)
 {
   String str = e.getActionCommand();
   if(str.equals("Add"))
   {
	  msg="You Pressed Add Button";
   }
   else if(str.equals("Modify"))
   {
	  msg="You Pressed Modify Button";
   }
   else if(str.equals("Delete"))
   {
	  msg="You Pressed Delete Button";
   }
   else
   {
	  msg="Error";
   }
   repaint();
  }
  public void paint(Graphics g)
  {
	g.drawString(msg,100,100);
  }
}

/*
  <Applet code="Buttons.java" width=500 height=500>
  </Applet>
*/
	