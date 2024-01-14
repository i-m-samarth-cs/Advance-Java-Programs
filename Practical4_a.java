//Practical 4

//1)WAP to Generate the Following Output.
/*
 * @author Samarth Shendre 
 */
import java.awt.*;
import javax.swing.*;
public class Practical4_a extends Frame
{
   public Practical4_a()
   {
	   Frame f=new Frame("GridBagLayout Example");
	   GridBagConstraints g=new GridBagConstraints();
	   GridBagLayout l=new GridBagLayout();
	   setSize(300,300);
	   setVisible(true);
	   
	   this.setLayout(l);
	   
	   g.fill=GridBagConstraints.HORIZONTAL;
	   g.gridx=0;
	   g.gridy=0;
	   this.add(new Button("Button One"),g);
	   
	   g.gridx=1;
	   g.gridy=0;
	   this.add(new Button("Button Two"),g);

	   g.gridx=0;
	   g.gridy=1;
	   this.add(new Button("Button Three"),g);
	   
	   g.gridx=1;
	   g.gridy=1;
	   this.add(new Button("Button Four"),g);

	  
	  
	   g.gridx=0;
	   g.gridy=5;
	   g.gridwidth=8;
	   this.add(new Button("Button Five"),g);
	   
	   
   }
   public static void main(String args[])
   {
	   Practical4_a a=new Practical4_a();
	   a.setTitle("GridBagLayout Example");
   }
}
