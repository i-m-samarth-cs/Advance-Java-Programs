import java.awt.*;
import java.applet.*;

public class GRDLayout extends Applet
{
  GridLayout grid;
  int n=0;
  public void init()
  {
     grid=new GridLayout(5,5,10,10);
     setLayout(grid);

     for(int i=0;i<5;i++)
     {
        for(int j=0;j<5;j++)
         {
  			add(new Button(" "+n));
 			n++;
 		  }
 	  }
      setBackground(Color.cyan);

  }
}

/*
  <Applet code="GRDLayout.java" width=500 height=500>
   </Applet>
*/