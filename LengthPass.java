//3)Write a program using JPasswordField to accept password from //the user and if the length is less than 6 charcters the error //message should be displayed"Password length must be > 6 //charcters

/*
 * @author Durvesh Chaudhari
 */

package Question;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LengthPass
{
public static void main(String[] args) {    
    	
    	JFrame f=new JFrame("Password Field Example");    
        JLabel label = new JLabel();  
      
    	label.setBounds(20,150,400,50);  
    	final JPasswordField value = new JPasswordField();   
    	value.setBounds(100,75,100,30);   
    	JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 80,30);    
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
        JButton b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
        f.add(value);
        f.add(l1);
        f.add(label);
        f.add(l2); 
        f.add(b); 
        f.add(text);  
               
        f.setSize(500,500);    
        f.setLayout(null);    
        f.setVisible(true);     
        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e) 
        {     
        	String str = value.getText();
        	int len  = str.length();
        	if(text.getText().equals("") && value.getText().equals(""))
        	{
        		label.setText("Enter Your UserName & Password"); 
        	}
        	else if(value.getText().equals(""))
        	{
        		label.setText("Enter Your Password"); 
        	}
        	else if(text.getText().equals("") )
        	{
        		label.setText("Enter Your UserNAme");
        	}
        	else if(len<6)
        	{
        		label.setText("Password length must be >6 characters"); 
        	}
        	else
        	{
        		String data = "Username " + text.getText();  
                data += ", Password: " + new String(value.getPassword());   
                label.setText(data);   
                
        	}
        }  
      });   
}  
}