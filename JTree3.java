import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTree3 extends JApplet
{
   JTree tree;
   Container c;
   public void init()
   {
	  c=getContentPane();
	  c.setLayout(new BorderLayout());
	  
	  //1.Create Root Node
      DefaultMutableTreeNode top=new DefaultMutableTreeNode("select");

     //2.Create Subtrees Child Nodes of Colors
   DefaultMutableTreeNode a=new DefaultMutableTreeNode("colors");

   top.add(a);
   //Colors
   DefaultMutableTreeNode a1=new DefaultMutableTreeNode("RED");
a.add(a1);

DefaultMutableTreeNode a2=new DefaultMutableTreeNode("GREEN");
a.add(a2);

DefaultMutableTreeNode a3=new DefaultMutableTreeNode("BLUE");
a.add(a3);

//3.Create Subtrees of Fruits
DefaultMutableTreeNode b=new DefaultMutableTreeNode("Fruits");
top.add(b);

DefaultMutableTreeNode b1=new DefaultMutableTreeNode("APPLE");
b.add(b1);

DefaultMutableTreeNode b2=new DefaultMutableTreeNode("MANGO");
b.add(b2);

DefaultMutableTreeNode b3=new DefaultMutableTreeNode("PINEAPPLE");
b.add(b3);

tree=new JTree(top);

c.add(tree,BorderLayout.CENTER);
}
}

/*
  <Applet code="JTree3" width=500 height=500>
  </Applet>
*/


