import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class JButtons extends Applet implements ActionListener
{
  ImageIcon icon1,icon2,icon3,icon4;
  JButton btn1;

  public void init()
  {
	icon1=new ImageIcon("416372_champion_cup_sports_winner_icon.png");
	icon2=new ImageIcon("3225179_app_logo_media_popular_social_icon.png");
	icon3=new ImageIcon("3225191_app_instagram_logo_media_popular_icon.png");
	icon4=new ImageIcon("4047335_automotive_car_sport_sports_utility_icon.png");

btn1=new JButton(icon1);
btn1.addActionListener(this);
add(btn1);
}
public void actionPerformed(ActionEvent e)
{
  btn1.setPressedIcon(icon2);
  btn1.setSelectedIcon(icon1);
  btn1.setDisabledIcon(icon3);
  btn1.setRolloverIcon(icon4);

  //btn1.setEnabled(false);
}
}

/*
  <Applet code="JButtons" width=500 height=500>
  </Applet>
*/