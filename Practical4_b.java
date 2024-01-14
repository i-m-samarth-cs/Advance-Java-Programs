//Practical 4

//2)WAP to Generate the Following Output .
//@author Samarth Shendre
/*
 * @author Samarth Shendre 
 */

import java.awt.*;
import javax.swing.*;
public class Practical4_b extends Frame
{
   Practical4_b()
   {
	   Label l1=new Label("Name");
	   TextField textName=new TextField(10);
	   Label l2=new Label("Comments");
	   TextArea txt=new TextArea(6,15);
	   Button b1=new Button("Submit");
	   add(l1);
	   add(textName);
	  
	   add(l2);
	   add(txt);
	   
	   add(b1);
	   
	   setLayout(new GridLayout(3,2));
	   
   }
   public static void main(String args[])
   {
	   Practical4_b a=new Practical4_b();
	   a.setTitle("GridBagLayout in Java Example");
	   a.setVisible(true);
       a.setSize(500,500);
	   
   }
}
