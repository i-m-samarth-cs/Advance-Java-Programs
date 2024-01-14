// 2. Write a program code to generate the following output
/*
 * @author Yash Salunke 
 */
import java.awt.*;
import javax.swing.*;

public class JTableDemo1 extends JApplet
{
	Container c;

	//Column Heading
	Object heading [] = {"ID","NAME","SALARY"};

	// Rows Data
	Object data[][] = { {101,"Amit",670000},{102,"jai",780000},{101,"Sachin",700000}};

	JTable table;

	//Override init() of Applet
	public void init()
	{
		//ContentPane Settings
		c = getContentPane();
		
		c.setLayout(new BorderLayout());

		// create Table
		table = new JTable(data,heading);
		

		// create ScrollPane and Add table into in

		int vsc = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

		int hsc = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

		JScrollPane scroll = new JScrollPane(table,vsc,hsc);

		// Add ScrollPane to the Applet

		c.add(scroll,BorderLayout.CENTER);
	
	} 
}
/*
<applet code="JTableDemo1" width=500 height=500>
</applet>
*/