//2)Develop a program to select multiple languages know to user(rq marathi,hindi,english,sanskrit)

/*
 * @author Anand Gavale 
 */


import java.awt.*;
public class Lang
{
	Lang()
	{
	Frame f=new Frame();
	Choice c=new Choice();
	c.setBounds(100,100,75,75);
	c.add("Marathi");
	c.add("English");
	c.add("Hindi");
	c.add("Sanskrit");
	c.add("Gujarati");
	f.add(c);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Lang();
	}
	
}