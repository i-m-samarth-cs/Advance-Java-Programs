import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapt  {
	public static void main(String args[])
	{
		Frame f =new Frame();
		
		f.addMouseMotionListener(new MouseMotionAdapter() {
		
			public void mouseDragged(MouseEvent e)
			{
				System.out.println("Mouse Dragged: X="+e.getX()+"  Y ="+e.getY());
			}
		});
		
		f.setVisible(true);
		f.setSize(500,500);		
	}

}
