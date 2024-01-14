// 1. Develop a program to demonstrate the use of JTable.
/*
 * @author Yash Salunke 
 */
import java.awt.*;
import javax.swing.*;

public class JTableDemo extends JApplet
{
	Container c;

	//Column Heading
	Object heading [] = {"Name","PIC","OOP","JAVA"};

	// Rows Data
	Object data[][] = { {"Yash",98,96,100},{"Durvesh",91,89,81},{"Mayuresh",78,61,68},{"Samarth",48,52,60},{"Anand",30,60,90} };

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
<applet code="JTableDemo" width=500 height=500>
</applet>
*/