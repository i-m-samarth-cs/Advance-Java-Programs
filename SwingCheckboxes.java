import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCheckboxes extends JApplet implements ItemListener
{
  JCheckBox idea,airtel,telenor,vodafone,aircel;
  String msg="";
  JTextField jtf;

  public void init()
  {
    Container c =getContentPane();
    c.setBackground(Color.cyan);
	c.setLayout(new FlowLayout());
 
	ImageIcon normal=new ImageIcon("3225179_app_logo_media_popular_social_icon.png");
	ImageIcon selected=new ImageIcon("416372_champion_cup_sports_winner_icon.png");
	ImageIcon rollover=new ImageIcon("3225191_app_instagram_logo_media_popular_icon.png");

   idea=new JCheckBox("Idea",normal);
   idea.setSelectedIcon(selected);
   idea.setRolloverIcon(rollover);
   idea.addItemListener(this);
   c.add(idea);

   airtel=new JCheckBox("Airtel",normal);
   airtel.setSelectedIcon(selected);
   airtel.setRolloverIcon(rollover);
   airtel.addItemListener(this);
   c.add(airtel);

   telenor=new JCheckBox("Telenor",normal);
   telenor.setSelectedIcon(selected);
   telenor.setRolloverIcon(rollover);
   telenor.addItemListener(this);
   c.add(telenor);

   vodafone=new JCheckBox("Vodafone",normal);
   vodafone.setSelectedIcon(selected);
   vodafone.setRolloverIcon(rollover);
   vodafone.addItemListener(this);
   c.add(vodafone);

   aircel=new JCheckBox("Aircel",normal);
   aircel.setSelectedIcon(selected);
   aircel.setRolloverIcon(rollover);
   aircel.addItemListener(this);
   c.add(aircel);

   
	idea.addItemListener(this);

	airtel.addItemListener(this);

	telenor.addItemListener(this);

	vodafone.addItemListener(this);

	aircel.addItemListener(this);
   
    msg="Idea:"+idea.getText();
    msg="Airtel:"+airtel.getText();
    msg="Aircel:"+aircel.getText();
    msg="Telenor:"+telenor.getText();
	msg="Vodafone:"+vodafone.getText();
    
    jtf=new JTextField(msg,20);

  }
  public void itemStateChanged(ItemEvent e)
  {
	repaint();
  }
}
/*
  <Applet code=SwingCheckboxes width=500 height=500>
  </Applet>
*/
  