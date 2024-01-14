//Practical 3

//1)WAP to Generate the Following Output
/*
 * @author Samarth Shendre 
 */
import java.awt.Button;
import java.awt.*;
public class GridLayoutDemo extends Frame 
{
	GridLayoutDemo()
	{
	Frame f=new Frame("GridLayout Demo");
	Button b1=new Button("Button1");
	Button b2=new Button("Button2");
	Button b3=new Button("Button3");
	Button b4=new Button("Button4");
	Button b5=new Button("Button5");
	
	f.setVisible(true);
	f.setSize(500,300);
	  
       
	f.setLayout(new GridLayout(3,2,30,30));
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	}
       public static void main(String args[])
       {
          GridLayoutDemo g=new GridLayoutDemo();
       }
}

