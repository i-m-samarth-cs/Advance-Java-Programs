//2)Write a program to count the number of clicks performed by the //user in frame window
/*
 * @author Durvesh Chaudhari
 */

package Question;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class CountClick extends MouseAdapter implements WindowListener {
	
	static  int count=0;
	
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Count Click");
		
		CountClick cc = new CountClick();
		
		jf.addMouseListener(cc);
		jf.addWindowListener(cc);
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		count=count+1;
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.print(count);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
