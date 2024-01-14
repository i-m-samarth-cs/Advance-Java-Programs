import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GridBagEx2 extends Applet
{
  protected void makeButton(String name,GridBagLayout  gridbag , GridBagConstraints g)
  {
      Button button=new Button(name);
      gridbag.setConstraints(button,g);
	  add(button);
  }
  public void init()
  {
     GridBagLayout gridbag=new GridBagLayout();
     GridBagConstraints g=new GridBagConstraints();

	 setFont(new Font("SansSerif",Font.BOLD,18));
	 setLayout(gridbag);

	 g.fill=GridBagConstraints.BOTH;
 	 g.weightx=1.0;

	 makeButton("Button1",gridbag,g);

	 makeButton("Button2",gridbag,g);

	 makeButton("Button3",gridbag,g);

	 g.gridwidth =  GridBagConstraints.REMAINDER;
	 
	 makeButton("Button4",gridbag,g);

	 g.weightx=0.0;
	 
	 makeButton("Button5",gridbag,g);

	 g.gridwidth=GridBagConstraints.RELATIVE;

	 makeButton("Button6",gridbag,g);
	 g.gridwidth=GridBagConstraints.RELATIVE;

	 makeButton("Button7",gridbag,g);

	 g.gridwidth=1;
	 g.gridheight=2;
	 g.weighty=1.0;

	 makeButton("Button8",gridbag,g);

	 g.weighty=0.0;
	 g.gridwidth=GridBagConstraints.REMAINDER;

     g.gridheight=1;
	 
	 makeButton("Button9",gridbag,g);

	 makeButton("Button10",gridbag,g);
  }
}

/*
  <Applet code="GridBagEx2.java" width=500 height=500>
  </Applet>
*/
     
     
     