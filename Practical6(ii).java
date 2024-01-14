//2)Develop a program to demonstrate the use of ScrollPane in Swings
/*
 * @author Mayuresh Chaudhari
 */


import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;;
public class ScrollPane {

	public static void main(String args[])
	{
		JFrame jf=new JFrame("Swing ScrollBar");
		JTextArea jta=new JTextArea();
		JScrollPane jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jf.add(jsp);
		jf.setVisible(true);
		jf.setSize(700,700);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
