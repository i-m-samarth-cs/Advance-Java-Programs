import java.awt.*;
import java.applet.*;

public class ChoiceDemo extends Applet
{
  public void init()
  {
	Choice ch1=new Choice();
	Choice ch2=new Choice();

	ch1.add("Dhule");
	ch1.add("Mumbai");
	ch1.add("Pune");
	ch1.add("Nagpur");
	ch1.add("Nashik");

	ch2.add("GPD");
	ch2.add("SS");
	ch2.add("Nikam");

   add(ch1);
   add(ch2);
  }
}

/*
 <Applet code=ChoiceDemo width=500 height=500>
 </Applet>
*/

