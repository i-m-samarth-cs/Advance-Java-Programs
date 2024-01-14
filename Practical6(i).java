//1)Write a program to develop a frame to select the different states of India using 
//JComboBox
/*
 * @author Mayuresh Chaudhari
 */

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jcombo extends Frame
{

	public static void main(String args[])
	{
		JFrame jf=new JFrame("Swing JcomboBox");
		jf.setLayout(new FlowLayout());
		JLabel lbl= new JLabel();
		Vector<String> v=new Vector<>();
		v.add("Maharashtra");
		v.add("Gujrat");
		v.add("Rajasthan");
		v.add("Uttar Pradesh");
		JComboBox jcb=new JComboBox(v);
		jf.add(jcb);
		jf.add(lbl);
		jcb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lbl.setText("You Selected" + e.getItem() );
			}
		});
		jf.setVisible(true);
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}


	
}
