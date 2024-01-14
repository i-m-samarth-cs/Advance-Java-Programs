import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyEventDemo extends Applet implements KeyListener
{
    String msg = "";
 
    public void init()
    {
        addKeyListener(this);
    }
 
    public void keyReleased(KeyEvent k)
    {
        msg="Key Released";
        repaint();
    }
 
    public void keyTyped(KeyEvent k)
    {
        msg="Key Typed";
        repaint();
    }
 
    public void keyPressed(KeyEvent k)
    {
        msg="Key Pressed";
        repaint();
    }
 
    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 10);
    }
}

/* 
   <applet code="KeyEventDemo" height="400" width="400">
   </applet>
*/