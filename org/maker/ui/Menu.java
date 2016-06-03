package org.maker.ui ;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.maker.ui.Window ;
import org.maker.ui.Content ;
import org.maker.levels.Importt ;
import org.maker.levels.Grid;


public class Menu extends JMenuBar{
  JMenu menu1 = new JMenu("Parameters");
  static JMenuItem item1 = new JMenuItem("import");
  static JMenuItem item2 = new JMenuItem("export");
  static JMenuItem item3 = new JMenuItem("Quit the programm");
  public Menu(Content p){
    super() ;
    menu1.add(item1);
    menu1.add(item2);
    menu1.add(item3);
    this.add(menu1);
    item1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
          Grid g = Importt.charger(Window.g) ;
          p.grid.camera = g.camera ;

        }
    });
    item2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {

         Importt.record(Window.g,"test") ;
      }
    });
  }


}
