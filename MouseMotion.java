//1)Write a program to demonstrate the use of mouseDragged and mouseMoved of MouseMotioListener

/*
 * @author Durvesh Chaudhari
 */

package Question;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseMotion implements MouseMotionListener{

	public static void main(String args[])
	{
		JFrame jf = new JFrame("MouseMotionListener");
		
		MouseMotion mm = new MouseMotion(); 
		jf.addMouseMotionListener(mm);
		
		jf.setSize(300, 300);
		jf.setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Moved");
	}

}
