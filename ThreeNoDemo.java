import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class ThreeNoDemo1 extends Frame implements ActionListener
{
    ThreeNoDemo1(String title)
    {
    super(title);
    WindowListener lis=new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
 		 System.exit(0);
      }
    };
    

  addWindowListener(lis); 
 
  Label lblcmp,lblres,lbl3no;
  TextField t1,t2,t3;
  Button b1,b2;

  Font f=new Font("Calibri",Font.BOLD,20);

  
  setLayout(null);

  setFont(f);

  lblcmp = new Label("Compare 3 Numbers",1);
  lblres = new Label("Result  ",1);
  lbl3no = new Label("Enter any 3 Numbers",1);

  b1=new Button("Find Largest");
  b2=new Button("Find Smallest");

  t1=new TextField(20);
  t2=new TextField(20);
  t3=new TextField(20);

  lblcmp.setBounds(0,50,500,50);
  lblres.setBounds(0,450,500,50);
  lbl3no.setBounds(50,170,400,50);

  b1.setBounds(100,350,150,50);
  b2.setBounds(300,350,150,50);

  t1.setBounds(100,250,150,50);

  t2.setBounds(210,250,150,50);

  t3.setBounds(320,250,150,50);


  lblcmp.setBackground(Color.green);
  lblres.setBackground(Color.green);
  lbl3no.setBackground(Color.cyan);

  b1.setBackground(Color.red);
  b2.setBackground(Color.red);
  b1.setForeground(Color.yellow);
  b1.setForeground(Color.yellow);

   add(lblcmp);
  add(lblres);
  add(lbl3no);
  add(b1);
  add(b2);
  add(t1);
  add(t2);
  add(t3);
  b1.addActionListener(this);
  b2.addActionListener(this);


public void actionPerformed(ActionEvent e)
{
  String str = e.getActionCommand();

  int tf1 =Integer.parseInt(t1.getText());
  int tf2 =Integer.parseInt(t2.getText());
  int tf3 =Integer.parseInt(t3.getText());


  if(str.equals("Largest Number"))
  {
    if(tf1 > tf2 && tf1 > tf3)
    {
     String t4=Integer.toString(tf1);
	 lblres.setText(t4);
    }
    else if(tf2 > tf1 && tf2 > tf3)
   {
     String t5=Integer.toString(tf2);
	 lblres.setText(t5);
   }
  else if(tf3 > tf2 && tf1 > tf1)
  {
     String t6=Integer.toString(tf3);
	 lblres.setText(t6);
  }
  else
  {
    String t7="Enter Number Values";
    lblres.setText(t7);
  }
 }
 else if(str.equals("Smallest Number"))
 {
   int tf4=Integer.parseInt(t1.getText());
  int tf5=Integer.parseInt(t2.getText());
  int tf6=Integer.parseInt(t3.getText());

  String msg="";
  if(tf4 < tf5 && tf4 < tf6)
  {
     String t7=Integer.toString(tf4);
	 lblres.setText(t7);
  }
  else if(tf5 < tf4 && tf5 < tf6)
  {
     String t8=Integer.toString(tf5);
	 lblres.setText(t8);
  }
  else if(tf6 < tf4 && tf6 < tf5)
  {
     String t9=Integer.toString(tf6);
	 lblres.setText(t9);
  }
  else
  {
    String t10="Enter Number Values";
    lblres.setText(t10);
  }
 }
 else
 {
	lblres.setText("Error!!!");
 }
 
}

};
public class ThreeNoDemo
{
  public static void main(String args[])
  {
ThreeNoDemo1 obj = new ThreeNoDemo1("Largest and Smallest");
    obj.setSize(500,500);
    obj.setVisible(true);
  }
}




 

  
