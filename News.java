//2)Develop applet/application to select multiple names of news //papers
/*
 * @author Anand Gavale 
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class News extends Applet
{
                public void init()
                {
                                List l1=new List(10,true);
                                l1.setBounds(50,60,100,120);
                                l1.add("Times of India");
                                l1.add("Lokmat");
                                l1.add("Divya Marathi");
                                l1.add("Lokmat");
                                add(l1);
        setLayout(null); 
       
                }
                public void paint(Graphics g)
                {
                                repaint();
                }
               
               
} /*
<applet code="News" width=300 height=300></applet>
*/