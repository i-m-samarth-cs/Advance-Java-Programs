
//1)Find errors in following program and display output as shown below
/*
 * @author Mayuresh Chuadhari
 */

import java.awt.*;
import java.awt.event.*;
public class MenuDemo1 extends Frame 
{
//MenuBar mb;
//MenuItem m1,m2,m3,m4;
//Menu mn;
//MenuShortcut ms;
//Frame f =new Frame();
MenuDemo1()
{
	Frame f=new Frame();
f.setTitle("MenuBar Demo");
f.setSize(500,500);
MenuBar mb =new MenuBar();
Menu mn=new Menu();
MenuItem m1,m2,m3,m4;
f.setVisible(true);
f.setLayout(null);
MenuShortcut ms=new MenuShortcut(KeyEvent.VK_X);
mn=new Menu("File");
mb=new MenuBar();
m1=new MenuItem("New...");
m2=new MenuItem("Open...");
m3=new MenuItem("Save As...");
m4=new MenuItem("Exit",ms);
f.setMenuBar(mb);
mb.add(mn);
mn.add(m1);
mn.add(m2);
mn.add(m3);
mn.addSeparator();
mn.add(m4); 


}
public static void main(String[] args)
{
MenuDemo1 md=new MenuDemo1();
md.setVisible(true);
}
}