import java.awt.*;
import java.applet.*;


public class TextAreaDemo extends Applet
{
  TextArea text1,text2,text3,text4;
  int vertical,horiz,both,none;

  public void init()
  {
     both=0;
     vertical=1;
     horiz=2;
     none=3;
   
     text1=new TextArea("Hello",20,30,both);
     text2=new TextArea("Hi",20,30,vertical);
     text3=new TextArea("Bye",20,30,horiz);
     text4=new TextArea("GoodBye",20,30,none);

     add(text1);
     add(text2);
     add(text3);
     add(text4);

     setBackground(Color.cyan);
     setForeground(Color.red);
  }
}

/*
  <applet code="TextAreaDemo.java" width=500 height=500>
  </applet>
*/