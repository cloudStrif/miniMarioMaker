package org.maker.ui ;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.maker.ui.Window ;
import org.maker.ui.Content ;

public class Menu extends JMenuBar{
  JMenu menu1 = new JMenu("Parameters");
  static JMenuItem item1 = new JMenuItem("import");
  static JMenuItem item2 = new JMenuItem("export");
  static JMenuItem item3 = new JMenuItem("Quit the programm");
  public Menu(){
    super() ;
    menu1.add(item1);
    menu1.add(item2);
    menu1.add(item3);
    this.add(menu1);
  }

}
