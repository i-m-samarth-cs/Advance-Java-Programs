// # Exercise Question :=> Write a Java program to create a table of Name of Student, Percentage and Grade of 10 students using JTable

/*
 * @author Yash Salunke 
 */

import java.awt.*;
import javax.swing.*;

public class JTableDemo2 extends JApplet
{
	Container c;

	//Column Heading
	Object heading [] = {"Name","Percentage","Grade"};

	// Rows Data
	Object data[][] = { {"Yash",96,"A"},{"Durvesh",99,"A"},{"Mayuresh",98,"A"},{"Samarth",97,"A"},{"Anand",95,"A"},{"Jayesh",94,"A"},{"Nikhil",93,"A"},{"Pranav",95,"A"},{"Hitesh",92,"A"},{"Jayesh",96,"A"} };

	JTable table;

	//Override init() of Applet
	public void init()
	{
		//ContentPane Settings
		c = getContentPane();
		c.setBackground(Color.red);
		c.setLayout(new BorderLayout());

		// create Table
		table = new JTable(data,heading);
		table.setBackground(Color.yellow);

		// create ScrollPane and Add table into in

		int vsc = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

		int hsc = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

		JScrollPane scroll = new JScrollPane(table,vsc,hsc);

		// Add ScrollPane to the Applet

		scroll.setBackground(Color.red);
		c.add(scroll,BorderLayout.CENTER);
	
	} 
}
/*
<applet code="JTableDemo2" width=500 height=500>
</applet>
*/