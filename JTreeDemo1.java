// Write a program code to generate the following output
/*
 * @author Yash Salunke
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo1 
{
	
	JFrame F;

	JTreeDemo1()
	{
		
		F = new JFrame();
		F.setTitle("Practical no.7");

		JTree tree;

		F.setLayout(new BorderLayout());

		// 1.create Root node (top node) of Tree
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("India");

		// 2.create subtrees (child nodes) of colors
		DefaultMutableTreeNode maha = new DefaultMutableTreeNode("Maharashtra");

		// add child node to top node
		top.add(maha);

		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Mumbai");
		maha.add(a1);

		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Pune");
		maha.add(a2);

		DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("Nashik");
		maha.add(a3);

		DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("Nagpur");
		maha.add(a4);

		DefaultMutableTreeNode n = new DefaultMutableTreeNode("Gujrath");
		top.add(n);


		// 4.Add top to tree
		tree = new JTree(top);

		// 5.Add tree to ContentPane
		F.add(tree,BorderLayout.CENTER);

		F.setSize(500,500);
		F.setVisible(true);
	}

	public static void main(String args[])
	{
		new JTreeDemo1();
	}
		
}
