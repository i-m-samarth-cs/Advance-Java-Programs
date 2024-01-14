import java.awt.*;
import java.awt.event.*;

class DialogAct implements ActionListener
{
  public void actionPerformed(ActionEvent e)
  {
    class DialogboxDemo extends Dialog 
  {
  DialogboxDemo(Frame parent,String title,boolean mode)
  {
    super(parent,title,mode);
    setLayout(new FlowLayout());

	setSize(200,200);
	setVisible(true);

	Label lbl=new Label("DialogBox Demo");
	add(lbl);
	Button btn=new Button("Click Here");
	add(btn);


  }
}
}
}

 }

 public static void main(String args[])
 {
   DialogDemo d=new DialogDemo("My Frame");
 DialogboxDemo box=new DialogboxDemo(d,"MyDialogBox",false);


 class DialogDemo extends Frame 
{
  String str=" ";
  DialogDemo(String title)
  {
  setSize(500,500);
  setVisible(true);

  Button b=new Button("Click here");
  add(b);
ActionListener a=new DialogAct();
d.addActionListener(a);


 }
}
}
       
		  