import java.awt.*;
import javax.swing.*;
import java.io.*;

public class ImageIC1 extends JApplet
{
	public void init()
    {	
		Container c = getContentPane();
	    c.setLayout(null);
	    c.setForeground(Color.red);
	    c.setForeground(Color.orange);
	
	    Font f=new Font("Times New Roman",Font.BOLD,25);
 		ImageIcon icon=new ImageIcon("416372_champion_cup_sports_winner_icon.png");

        JLabel l1=new JLabel("Label-1",icon,JLabel.CENTER);

       l1.setVerticalTextPosition(JLabel.CENTER);
       l1.setHorizontalTextPosition(JLabel.CENTER);

 		l1.setOpaque(true);
	    l1.setBackground(Color.green);
	    l1.setForeground(Color.red);

        l1.setFont(f);
		l1.setBounds(100,100,200,300);
		c.add(l1);
	   
	
   }
  
}

/*
  <Applet code=ImageIC1 width=500 height=500>
  </Applet>
*/