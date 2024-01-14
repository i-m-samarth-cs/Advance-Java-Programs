import javax.swing.*;
import java.awt.*;

public class JTables extends JApplet
{
  Container c;

  //Column Headings 1D Array
  Object heading[]={"Name","PIC","OOP","JAVA"};
  
  //Rows Data in 2D Array
  Object data[][]={{"ABC",98,96,100},{"XYZ",91,89,81},{"PQR",78,61,68},{"IJK",50,63,48},{"MNO",48,52,60}};

  JTable table;
  JScrollPane scroll;

  public void init()
  {
	 c=getContentPane();
	 c.setBackground(Color.red);
     c.setLayout(new BorderLayout());

	 table=new JTable(data,heading);
	 table.setBackground(Color.yellow);

	 int vsc=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	 int hsc=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

	 scroll=new JScrollPane(table,vsc,hsc);
	 scroll.setBackground(Color.red);
	 c.add(scroll,BorderLayout.CENTER);
  }
}

/*
  <Applet code="JTables" width=500 height=500>
  </Applet>
*/