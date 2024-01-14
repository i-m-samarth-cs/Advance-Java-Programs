import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerClass {
	
	class inner extends WindowAdapter
	{
		 
          public void WindowClosing(WindowEvent e) 
           { 
             System.exit(0); 
           } 
       
	}

	public static void main(String args[])
	{
		Frame f =new Frame();
		InnerClass i =new InnerClass();
		f.addWindowListener(i.new inner());
		f.setVisible(true);
		f.setSize(500,500);
	}
}
