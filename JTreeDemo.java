// Develop a program to demonstrate the use of tree component in swing.
/*
 * @author Yash Salunke 
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo extends JApplet
{
	JTree tree;
	Container c;

	public void init()
	{
		c=getContentPane();
		c.setLayout(new BorderLayout());

		// 1.create Root node (top node) of Tree
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Select");

		// 2.create subtrees (child nodes) of colors
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Colors");

		// add child node to top node
		top.add(a);

		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("RED");
		a.add(a1);

		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("GREEN");
		a.add(a2);

		DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("BLUE");
		a.add(a3);

		// 3.Create subtrees of Fruits
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("Fruits");
		top.add(b);

		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("APPLE");
		b.add(b1);

		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("ALPHONSO");
		b.add(b2);

		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("PINEAPPLE");
		b.add(b3);

		// 4.Add top to tree
		tree = new JTree(top);

		// 5.Add tree to ContentPane
		c.add(tree,BorderLayout.CENTER);
		
	}

}
/*
<applet code="JTreeDemo" width=500 height=500>
</applet>
*/