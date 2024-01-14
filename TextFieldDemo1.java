import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo1 extends Applet implements ActionListener
{
  TextField txtname,txtpass;
  Label lblname,lblpass;
 
  public void init()
  {
	lblname=new Label("Username :",Label.CENTER);
	lblpass=new Label("Password :",Label.CENTER);

	txtname=new TextField(20);
	txtpass=new TextField(20);

	txtpass.setEchoChar('*');

	add(lblname);
	add(lblpass);
	add(txtname);
	add(txtpass);

	txtname.addActionListener(this);
	txtpass.addActionListener(this);
  
	setBackground(Color.cyan);
  }
  public void actionPerformed(ActionEvent e)
  {
    repaint();
  }
  public void paint(Graphics g)
  {
	g.drawString("User Name:"+txtname.getText(),10,50);
	g.drawString("Selected text:"+txtname.getText(),10,80);
	g.drawString("Password:"+txtpass.getText(),10,110);
  }
}

/*
  <Applet code="TextFieldDemo1.java" width=500 height=500>
  </Applet>
*/

