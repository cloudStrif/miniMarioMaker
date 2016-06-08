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
import org.maker.ressources.Piece ;
import org.maker.character.Goumba;
import org.maker.ressources.Boxe ;

//import org.maker.sound.Soundd ;

public class Window extends JFrame implements ActionListener{
  final static int tX =1000;
  final static int tY =650;
  JPanel container = new JPanel() ;
  Content p ;
  Menu menu ;
  String [] tabName ={"brique","delete","recule","avance","bas","haut","brique2","herbe"
,"bloc","piece","goumba","box"} ;
  ArrayList<Push> buttons = new ArrayList<Push>() ;
  Push p1 = new Push("brique");
  static Grid g;
  Piece pice;
  Boxe box ;

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
    //Init Grid (use it each time)
    g = new Grid(100,100);
    p =  new Content(g);
    menu =new Menu(p) ;

    container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
    container.add(p, BorderLayout.CENTER);

    JPanel north = new JPanel();
    for(int i=0;i<tabName.length;i++){
      buttons.get(i).addActionListener(this);
      north.add(buttons.get(i));
    }
    container.add(north , BorderLayout.NORTH);
    Menu.item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
    setJMenuBar(menu);
    setContentPane(container);
    setVisible(true);
    pice = new Piece(1,p);
    box  = new Boxe(1,p);
    //new Soundd("theme.wav",true).start();
  }

   public void actionPerformed(ActionEvent arg0) {
     //args here later
     if(arg0.getSource() == buttons.get(0)){
       Mousse.TYPE="B";
     }
     if(arg0.getSource()== buttons.get(1)){
       Mousse.TYPE="N";
     }

     //control keys
     if(arg0.getSource()== buttons.get(2)){
       if(g.posXinit>0){
          g.posXinit -- ;
          g.refresh() ;
          p.repaint() ;
       }
     }
     if(arg0.getSource()== buttons.get(3)){
       if(g.posXinit<g.s2){
          g.posXinit ++ ;
          g.refresh() ;
          p.repaint() ;
       }
     }
     if(arg0.getSource()== buttons.get(4)){
       if(g.posYinit<g.s){
          g.posYinit ++ ;
          g.refresh() ;
          p.repaint() ;
       }
     }
     if(arg0.getSource()== buttons.get(5)){
       if(g.posYinit>0){
          g.posYinit -- ;
          g.refresh() ;
          p.repaint() ;
       }
     }
      if(arg0.getSource()== buttons.get(6)){
         Mousse.TYPE="M";
      }
      if(arg0.getSource()== buttons.get(7)){
         Mousse.TYPE="H";
      }
      if(arg0.getSource()== buttons.get(8)){
         Mousse.TYPE="P";
      }
      if(arg0.getSource()== buttons.get(9)){
        Mousse.TYPE=Piece.TYPE;
        if(!pice.active){
          pice.rune();
        }
      }
      if(arg0.getSource()== buttons.get(10)){
         Mousse.TYPE=Goumba.TYPE+"";

      }
      if(arg0.getSource()== buttons.get(11)){
        //This is a box
         Mousse.TYPE=Boxe.TYPE;
         if(!box.active){
            box.start() ;
         }
      }
   }
}
