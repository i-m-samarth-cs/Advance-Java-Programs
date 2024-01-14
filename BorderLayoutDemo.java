//Practical 3

//2)WAP to Generate the Following Output using BorderLayout
/*
 * @author Samarth Shendre 
 */

import java.awt.*;

public class BorderLayoutDemo extends Frame
{
   BorderLayoutDemo()
   {
   Frame f=new Frame();
  
   f.setVisible(true);
   f.setSize(500,300);
   f.setLayout(new BorderLayout());
   Button b1=new Button("East");
   Button b2=new Button("West");
   Button b3=new Button("North");
   Button b4=new Button("South");
   Button b5=new Button("Center");
   
   f.add(b1,BorderLayout.EAST);
   f.add(b2,BorderLayout.WEST);
   f.add(b3,BorderLayout.NORTH);
   f.add(b4,BorderLayout.SOUTH);
   f.add(b5,BorderLayout.CENTER);
   
   }	
   public static void main(String args[])
   {
	   BorderLayoutDemo b=new BorderLayoutDemo();
	   
   }
}
