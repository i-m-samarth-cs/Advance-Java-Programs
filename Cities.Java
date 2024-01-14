//1)Develop an applet/application using list component to add //names of 10 different Cities.
/*
 * @author Anand Gavale 
 */
import java.applet.*;
import java.awt.*;

public class Cities extends Applet
{
                public void init()
                {
                     List l1=new List(10,true);
                     l1.setBounds(50,60,100,120);
                     l1.add("Dhule");
                     l1.add("Sakri");
                     l1.add("Nandurbar");
                     l1.add("Satana");
                     l1.add("Nampur");
                     l1.add("Nashik");
                     l1.add("Jalgaon");
                     l1.add("Deola");
                     l1.add("Mumbai");
                     l1.add("Thane");
                     add(l1);
                     setLayout(null); 
       
                }
                public void paint(Graphics g)
                {
                      repaint();
                }
               
               
}
/*
<applet code="Cities" width=300 height=300></applet>
*/