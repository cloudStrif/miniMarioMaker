package org.maker.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

import org.maker.ui.Menu ;
import org.maker.levels.Importt ;
import org.maker.levels.Grid ;

public class Window extends JFrame implements ActionListener{
  final static int tX =1000;
  final static int tY =600;
  JPanel container = new JPanel() ;
  Content p ;
  Menu menu =new Menu() ;
  Push p1 = new Push("brique");


  public Window(){
    setTitle("Mini Mario Maker");
    setSize(tX,tY);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  //  setResizable(false);
    Grid g =new Grid(100,100);
    p =  new Content(g);

    container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
    container.add(p, BorderLayout.CENTER);

    p1.addActionListener(this);

    JPanel north = new JPanel();
    north.add(p1);

    container.add(north , BorderLayout.NORTH);
    Menu.item1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
         Importt.charger() ;
      }
    });
    Menu.item2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {

         Importt.record(g,"test") ;
      }
    });
    Menu.item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
    setJMenuBar(menu);
    setContentPane(container);
    setVisible(true);
  }

   public void actionPerformed(ActionEvent arg0) {
     //args here later
   }
}
