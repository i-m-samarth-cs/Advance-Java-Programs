import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class JProgressBarApplet extends JApplet implements ActionListener
{
    JProgressBar JProgressBarObj;
    JButton JButtonObj;
    int i=0;
 
    public void init()
    {
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
 
        JButtonObj = new JButton("Click Me");
        JButtonObj.addActionListener(this);
 
        JProgressBarObj = new JProgressBar();
        JProgressBarObj.setStringPainted(true);
        JProgressBarObj.setValue(0);
 
        add(JButtonObj);
        add(JProgressBarObj);
    }
 
    public void actionPerformed(ActionEvent ie)
    {
        this.iterate();
    }
 
    public void iterate()
    {
        while(i<=2000)
        {
            JProgressBarObj.setValue(i);
            i=i+20;
            try
            {
                Thread.sleep(150);
            }
            catch(Exception e)
            {}
        }
    } 
}
/* <applet code="JProgressBarApplet" height="400" width="400">
   </applet>
*/