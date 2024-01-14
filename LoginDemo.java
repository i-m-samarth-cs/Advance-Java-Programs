import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class LoginDemo extends Applet 
{
  Label l1,l2,l3,l4;
  TextField t1,t2;
  Button b1,b2;
  Font f=new Font("Times New Roman",Font.BOLD,25);
  public void init()
  {
    setLayout(null);
  setFont(f);
  l1=new Label("Login",1);
  l2=new Label("Status",1);
  l3=new Label("USERNAME",1);
  l4=new Label("PASSWORD",1);

  t1=new TextField(20);
  t2=new TextField(20);


  b1=new Button("Cancel");
  b2=new Button("Login");

  l1.setBounds(0,50,500,50);
  l2.setBounds(0,450,500,50);
  l3.setBounds(60,100,150,50);
  l4.setBounds(60,200,150,50);

  t1.setBounds(300,100,150,50);
  t2.setBounds(300,200,150,50);
  
  b1.setBounds(70,300,150,50);
  b2.setBounds(250,300,150,50);

  l1.setBackground(Color.cyan);
  l2.setBackground(Color.cyan);
  l3.setBackground(Color.pink);
  l3.setForeground(Color.yellow);
  l4.setBackground(Color.pink);
  l4.setForeground(Color.yellow);

  b1.setBackground(Color.yellow);
  b2.setBackground(Color.yellow);
  t2.setEchoChar('*');

  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(b1);
  add(b2);
  add(t1);
  add(t2);






 ActionListener ac = new MyAdapter()
		{
			public void actionPerformed(ActionEvent e)
			{

  String s1=t1.getText();
  String s2=t2.getText();


  if(s1.equals("ABC")&&s2.equals("12345"))
  {
     l2.setText("Login Successfull");
  }
  else
  {
     l2.setText("Incorrect Username or Password");
  }   
  }
  };
   b2.addActionListener(ac);
  
  ActionListener can = new MyAdapter()
		{
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("");
				t2.setText("");
				l2.setText("");
			}
		};
		b1.addActionListener(can);
		

class MyAdapter implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
}
}

/*
 <Applet code="LoginDemo.java" width=500 height=500>
 </Applet>
*/




  

