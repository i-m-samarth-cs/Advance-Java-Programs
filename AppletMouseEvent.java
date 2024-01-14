//1)Write a program to change the background color of applet when //user perform events using mouse

/*
 * @author Durvesh Chaudhari
 */

import java.awt.*;

import java.applet.*;

import java.awt.event.*; 
 

public class AppletMouseEvent extends Applet implements MouseMotionListener

{
	Label l1;

  public void init()

   {
		l1 = new Label("Hello World");
		add(l1);
       addMouseMotionListener(this);

   }

   public void mouseDragged(MouseEvent me)

   {

       setBackground(Color.red);

       repaint();

   }

  public void mouseMoved(MouseEvent me)

   {

       setBackground(Color.green);

     repaint();

   } 
   
	

}/*<applet code="AppletMouseEvent" width = 300 height=300>
  </applet> */
