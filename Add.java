//1)Write a program using JPasswordField and JTextField to //demostrate the use of user authentication

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

public class Add {
	public static void main(String[] args)
	{    
	    JFrame f=new JFrame("Password Field Example");    
	     final JLabel label = new JLabel();            
	     label.setBounds(20,150, 200,50);  
	     final JTextField value = new JTextField();   
	     value.setBounds(100,75,100,30);   
	     JLabel l1=new JLabel("1st Number");    
	        l1.setBounds(20,20, 80,30);    
	        JLabel l2=new JLabel("2nd Number");    
	        l2.setBounds(20,75, 80,30);    

	        JButton b = new JButton("ADD");  
	        b.setBounds(100,120, 80,30);    
	        final JTextField text = new JTextField();  
	        text.setBounds(100,20, 100,30);    
	        
	        f.add(value); 
	        f.add(l1); 
	        f.add(label);
	        f.add(l2); 
	        f.add(b); 
	        f.add(text);  
	        f.setSize(300,300);    
	            
	        f.setLayout(null);     
	        f.setVisible(true);     
	                
	        b.addActionListener(new ActionListener()
	        {  
	                public void actionPerformed(ActionEvent e) {  
	                	int a = Integer.parseInt(text.getText());  
	                	int b = Integer.parseInt(value.getText());  
	                  int c =a+b;
	                  String str = Integer.toString(c);
	                   label.setText("Sum = "+str);          
	        }			 
	 });   
	}  

}
