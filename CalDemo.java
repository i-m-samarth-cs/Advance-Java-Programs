import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CalDemo extends Applet
{
  Label l1,l2;
  Button add1,sub,mul,div1;
  TextField t1,t2;
  Font f=new Font("Times New Roman",Font.BOLD,30);
  public void init()
  {
    setLayout(null);
    setFont(f);

    l1=new Label("CALCULATOR",1);
    l2=new Label("Result",1);

    add1=new Button("Add");
    sub=new Button("Sub");
    mul=new Button("Mul");
    div1=new Button("Div");

    t1=new TextField(20);
    t2=new TextField(20);

    l1.setBackground(Color.red);
    l2.setBackground(Color.red);
    l1.setForeground(Color.yellow);
    l2.setForeground(Color.yellow);

    t1.setBackground(Color.cyan);
    t2.setBackground(Color.cyan);

    add1.setBackground(Color.pink);
    sub.setBackground(Color.pink);
    mul.setBackground(Color.pink);
    div1.setBackground(Color.pink);

    l1.setBounds(50,100,400,50);
    l2.setBounds(400,300,100,200);

    t1.setBounds(50,200,100,50);
    t2.setBounds(200,200,100,50);

    add1.setBounds(50,300,100,50);
    sub.setBounds(150,300,100,50);
    mul.setBounds(50,350,100,50);
    div1.setBounds(150,350,100,50);
add(div1);
add(add1);
	add(sub);
	add(mul);
    add(l1);
    add(l2);
    add(t1);
	add(t2);
	

 
 ActionListener as=new MyAdapter()
 {
   public void actionPerformed(ActionEvent e)
   {
      int n1=Integer.parseInt(t1.getText());
      int n2=Integer.parseInt(t2.getText());
     
	  int sum=n1+n2;
      l2.setText(""+sum);
   }
  };
  add1.addActionListener(as);

ActionListener ac=new MyAdapter()
 {
   public void actionPerformed(ActionEvent e)
   {
      int n3=Integer.parseInt(t1.getText());
      int n4=Integer.parseInt(t2.getText());
     
	  int diff=n3-n4;
      l2.setText(""+diff);
   }
  };
  sub.addActionListener(ac);

ActionListener az=new MyAdapter()
 {
   public void actionPerformed(ActionEvent e)
   {
      int n5=Integer.parseInt(t1.getText());
      int n6=Integer.parseInt(t2.getText());
     
	  int multi=n5*n6;
      l2.setText(""+multi);
   }
  };
  mul.addActionListener(az);

ActionListener am =new MyAdapter()
 {
   public void actionPerformed(ActionEvent e)
   {
      int n7=Integer.parseInt(t1.getText());
      int n8=Integer.parseInt(t2.getText());
     
	  int divide=n7/n8;
      l2.setText(""+divide);
   }
  };
  div1.addActionListener(am);
class MyAdapter implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
 
}
}

/*
 <Applet code = CalDemo width=500 height=500>
 </Applet>
*/


    