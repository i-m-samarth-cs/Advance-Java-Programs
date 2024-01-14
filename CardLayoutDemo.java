import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CardLayoutDemo extends Applet implements ActionListener
{
  CardLayout card;
  Button b1,b2,b3;
  public void init()
  {
    card=new CardLayout(100,100);
    setLayout(card);
    b1=new Button("PIC");
    b2=new Button("C++");
    b3=new Button("AD JAVA");

    add(b1);
    add(b2);
    add(b3);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    card.next(this);
  }
}
/*
  <Applet code="CardLayoutDemo.java" width=500 height=500>
  </Applet>
*/