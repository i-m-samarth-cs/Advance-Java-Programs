//1)Develop a program using Label to display message "Welcome to Java"
/*
 * @author Anand Gavale 
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Welcome extends WindowAdapter
{
        Welcome()
{
        Frame f=new Frame();
        Label l1=new Label("Welcome to Java");
        l1.setBounds(100,50,120,80);
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
}
public void windowClosing(WindowEvent e)
{
	System.exit(0);
}
public static void main(String a[])
{
        new Welcome();
}
}