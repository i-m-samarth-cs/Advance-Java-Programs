import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
public class MouseColor extends Applet implements MouseMotionListener
{
    public void init()
    {
        addMouseMotionListener(this);
    }
 
    public void mouseDragged(MouseEvent me)
    {
        setBackground(Color.red);
        repaint();
    }
 
    public void mouseMoved(MouseEvent me)
    {
        setBackground(Color.green);
        repaint();
    }
 
}
/*
    <applet code="MouseColor" width=300 height=300>
    </applet>
*/