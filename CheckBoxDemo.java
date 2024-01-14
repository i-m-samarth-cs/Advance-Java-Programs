import java.awt.*;
import java.applet.*;

public class CheckBoxDemo extends Applet
{
  Checkbox c1,c2,c3,c4,c5;
  Label l1;
  
  public void init()
  {
    l1 = new Label("Select Your Subject");
    c1=new Checkbox("C");
    c2=new Checkbox("C++");
    c3=new Checkbox("JAVA");
    c4=new Checkbox("AD Java");
    c5=new Checkbox("Python");
    
    add(l1);
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(c5);
  }
}

/*
 <applet code=CheckBoxDemo.java width=500 height=500>
 </applet>
*/
