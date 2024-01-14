import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FactorialDemo extends Applet implements ActionListener
{
  Label lblfind,lblres,lblno;
  TextField txtno;
  Button b1;
  Font f=new Font("Times New Roman",Font.BOLD,20);
  

  public void init()
  {
  setLayout(null);
  setBackground(Color.white);
  setFont(f);
  lblfind = new Label("Find Factorial",1);
  lblres=new Label("Result is ",1);
  lblno = new Label("Enter Number");
  Button b1=new Button("Find Factorial");

  lblfind.setBounds(0,50,500,50);
  lblres.setBounds(0,450,500,50);
  lblno.setBounds(50,170,100,50);
  b1.setBounds(200,300,150,50);

  txtno=new TextField(20);
  txtno.setBounds(250,170,150,50);

  lblfind.setBackground(Color.yellow);
  lblres.setBackground(Color.yellow);
  lblno.setBackground(Color.cyan);
  lblno.setForeground(Color.red);
  b1.setBackground(Color.pink);

  add(lblfind);
  add(lblres);
  add(lblno);
  add(txtno);
  add(b1);

  b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
  int t1=Integer.parseInt(txtno.getText());
  int i=1;
  int fact=t1;
  if(t1<=15)
  {
  
  	for(i=1;i<t1;i++)
  	{
   	 fact=fact*i;
  	}
    String res=Integer.toString(fact);
    lblres.setText("Result is:"+res);
  }
  else
  {
	lblres.setText("Enter valid Number/No between 1-15");
  }


}

}

/*
  <Applet code="FactorialDemo.java" width=500 height=500>
  </Applet>
*/