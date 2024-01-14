import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class JTabs1 extends JApplet
{
  JTabbedPane jtp;
  
  JScrollPane jsp1,jsp2,jsp3;

  public void init()
  {
     setBackground(Color.cyan);
 
//Scroll Bars   
int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
//int vsb1=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
//int hsb1=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

//ScrollPane 1 Ist Tab
jsp1=new JScrollPane(new newsPanel(),vsb,hsb);	

//ScrollPane 2 IInd Tab
jsp1=new JScrollPane(new magPanel(),vsb,hsb);	

//ScrollPane 3 IIIrd Tab
jsp1=new JScrollPane(new webPanel(),vsb,hsb);

//JTabbedpane in which scrollbar are added
jtp=new JTabbedPane();
jtp.addTab("News Papers",jsp1);
jtp.addTab("Magzines",jsp2);
jtp.addTab("Websites",jsp3);

//Add TabPane to JApplet Content Pane

	

add(jtp);
}

//Ist Tab
class newsPanel extends JPanel
{
   public newsPanel()
   {
	 setBackground(new Color(0,200,255));
     JButton jb1=new JButton("Lokmat");
     add(jb1);
	 JButton jb2=new JButton("Sakal");
     add(jb2);
 	 JButton jb3=new JButton("Divya Marathi");
     add(jb3);
	 JButton jb4=new JButton("Times of India");
     add(jb4);
  }
}

//IInd Tab
class magPanel extends Panel
{
  public magPanel()
  {
	setBackground(new Color(255,0,200));
	JCheckBox jcb1=new JCheckBox("India Today");
	add(jcb1);

	JCheckBox jcb2=new JCheckBox("FilmFare");
	add(jcb2);

	JCheckBox jcb3=new JCheckBox("StarDust");
	add(jcb3);
  }
}

//IIIrd Tab
class webPanel extends Panel
{
  public webPanel()
  {
	setBackground(new Color(0,200,200));
    JComboBox jc=new JComboBox();
    jc.addItem("Google");
	jc.addItem("Yahoo");
	jc.addItem("Redliff");
	jc.addItem("Facebook");

    add(jc);
 }
}
}

/*
  <Applet code="JTabs1" width=500 height=500>
  </Applet>
*/

