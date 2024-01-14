import java.awt.*;
class MyMenuFrame extends Frame
{
  String msg=null;
  MenuBar mbar;
  MyMenuFrame(String title)
  {
    super(title);
    mbar=new MenuBar();
    setMenuBar(mbar);

	Menu file=new Menu("FILE");
    MenuItem item1,item2,item3,item4,item5;

    file.add(item1=new MenuItem("NEW"));

    file.add(item2=new MenuItem("OPEN"));
   
    file.add(item3=new MenuItem("SAVE"));
   
    file.add(item4=new MenuItem("-"));
   
    file.add(item5=new MenuItem("EXIT"));

	mbar.add(file);

    Menu edit =new Menu("MENU");
    MenuItem item6,item7,item8,item9;

    edit.add(item6=new MenuItem("FIND"));
    edit.add(item7=new MenuItem("REPLACE"));
   
    edit.add(item8=new MenuItem("Zoom In"));
    edit.add(item9=new MenuItem("-"));

    Menu zoom=new Menu("Zoom");
    MenuItem item10,item11,item12;

    zoom.add(item10=new MenuItem("50%"));
    zoom.add(item11=new MenuItem("100%"));
    zoom.add(item12=new MenuItem("200%"));

	edit.add(zoom);
	mbar.add(edit);

	Menu debugging =new Menu("DEBUGGING");

  CheckboxMenuItem debug=new CheckboxMenuItem("Debug",true);

MenuItem test=new MenuItem("UNDO");

debugging.add("debug");
debugging.add("test");

mbar.add(debugging);

}
public static void main(String args[])
{
  MyMenuFrame my=new MyMenuFrame("MenuBar Example");
  my.setVisible(true);
  my.setSize(500,500);
}
}

   

   
   