//3)Write a program to create three buttons with Caption OK,RESET and CANCEL
/*
 * @author Anand Gavale 
 */

import java.awt.*;

public class Button1
{
    Button1()
{
                Frame f=new Frame();
                Button b1=new Button("Ok");
                b1.setBounds(100,50,50,50);
                f.add(b1);
                Button b2=new Button("Reset");
                b2.setBounds(100,101,50,50);
                f.add(b2);
                Button b3=new Button("Cancel");
                b3.setBounds(100,150,80,50);
                f.add(b3);
                f.setSize(500,500);
                f.setLayout(null);
                f.setVisible(true);
                
}
public static void main(String a[])
{
                new Button1();
}
}