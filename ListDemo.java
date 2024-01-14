import java.awt.*;
import java.applet.*;

public class ListDemo extends Applet
{
  public void init()
  {
	List l1=new List(4);
   List l2=new List(5,true);

   l1.add("India");
   l1.add("China");
   l1.add("Australia");
   l1.add("Pakistan");
   l2.add("USA");
   l2.add("UK");
   l2.add("japan");
   l2.add("UAE");
   l2.add("Afganistan");

   add(l1);
   add(l2);
 }
}

/*
  <Applet code=ListDemo width=500 height=500>
  </Applet>
*/
