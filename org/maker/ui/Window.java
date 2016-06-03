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
import java.util.ArrayList ;

import org.maker.ui.Menu ;
import org.maker.levels.Importt ;
import org.maker.levels.Grid ;
import org.maker.ui.Mousse ;

public class Window extends JFrame implements ActionListener{
  final static int tX =1000;
  final static int tY =650;
  JPanel container = new JPanel() ;
  Content p ;
  Menu menu =new Menu() ;
  String [] tabName ={"brique"} ;
  ArrayList<Push> buttons = new ArrayList<Push>() ;
  Push p1 = new Push("brique");
  Grid g;

  public Window(){
    setTitle("Mini Mario Maker");
    setSize(tX,tY);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    for(int i=0; i<tabName.length;i++){
      Push pp =new Push(tabName[i]);
      buttons.add(pp);
    }

    setResizable(false);
    g = new Grid(100,100);
    p =  new Content(g);

    container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
    container.add(p, BorderLayout.CENTER);



    JPanel north = new JPanel();
    for(int i=0;i<tabName.length;i++){
      buttons.get(i).addActionListener(this);
      north.add(buttons.get(i));
    }
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
     if(arg0.getSource() == buttons.get(0)){
       System.out.println("push Brique ! ");
       Mousse.TYPE="B";
     }
   }
}
