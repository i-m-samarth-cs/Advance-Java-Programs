import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Colors extends Applet implements ActionListener
{
  Button b1,b2,b3;
  String msg="",str1="",str2="",str3="";
  Font f=null;
  public void init()
  {
 	b1=new Button("Red");
    b2=new Button("Yellow");
 	b3=new Button("Green");
	
	f=new Font("Times New Roman",Font.BOLD,30);
    setFont(f);
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


 }
 public void actionPerformed(ActionEvent e)
 {
   String str = e.getActionCommand();
   if(str.equals("Red"))
   {
	  msg="You Pressed Red Button";
      setBackground(Color.red);
   }
   else if(str.equals("Yellow"))
   {
	  msg="You Pressed Yellow Button";
      setBackground(Color.yellow);
   }
   else if(str.equals("Green"))
   {
	  msg="You Pressed Green Button";
      setBackground(Color.green);
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
  <Applet code="Colors.java" width=500 height=500>
  </Applet>
*/
	