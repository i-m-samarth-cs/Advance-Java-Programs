import java.awt.*;
import java.applet.*;

public class RadioButtonDemo extends Applet
{
  Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
  CheckboxGroup gp1,gp2;
  
  public void init()
  {
    gp1=new CheckboxGroup();
    gp2=new CheckboxGroup();
   
    c1=new Checkbox("Mumbai Indians",gp1,true);
    c2=new Checkbox("Chennai Super kings",gp1,false);
    c3=new Checkbox("Delhi Capitals",gp1,false);
    c4=new Checkbox("Rajsthan Royals",gp1,false);

    c5=new Checkbox("Sunrisers Hyderabad",gp2,true);
    c6=new Checkbox("Royal Challengers Banglore",gp2,false);
    c7=new Checkbox("Kolkata Knight Riders",gp2,false);
    c8=new Checkbox("Gujrat Giants",gp2,false);
	
	
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(c5);
	add(c6);
	add(c7);
	add(c8);

    setBackground(Color.cyan);
    setForeground(Color.red);
    
    c1.setBackground(Color.yellow);
    c1.setForeground(Color.red);
  }
}

/*
  <applet code="RadiobuttonDemo.java" width=500 height=500>
  </applet>
*/
