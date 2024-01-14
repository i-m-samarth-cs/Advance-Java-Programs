
import javax.swing.*;
import java.awt.*;
 
public class JPasswordChange
{
    public static void main(String[] args) {
        JFrame f = new JFrame();
 		 JTextField jf=new JTextField(20);
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
 
        JPasswordField pf = new JPasswordField(20);
 
        pf.setEchoChar('#');
 		f.add(jf);
        f.add(pf);
    }
 
}