package org.maker.ui ;

import org.maker.levels.Grid ;
import org.maker.ui.Window ;
import org.maker.ui.Push ;
import org.maker.ressources.Piece ;
import org.maker.character.Goumba ;
import org.maker.ressources.Boxe ;


import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Content extends JPanel{

  public static Grid grid ;


  int x = 0 ;
  int y = 0 ;

  int [] clignote = new int[2];
  Mousse mousse ;
  public Content(){}

  public Content(Grid grid){
    this.grid=grid;
    clignote[0]=0 ;
    clignote[1]=0 ;
    mousse = new Mousse(this) ;
    setDoubleBuffered(false);
  }
  /*
  Default printing of the grid
   */
  public void paintComponent(Graphics g){
     super.paintComponent(g);
     printing(g);
  }

  public void printing(Graphics g){
    g.setColor(new Color(1,2,1));
    g.fillRect(0,0,Window.tX ,Window.tY);

      for(int i=0;i<18;i++){
        for(int j=0;j<24;j++){

          if (grid.clignote[i][j]==false) {
            g.setColor(new Color(111,233,111));
            g.fillRect(x,y,(int)(1000/24)-1,(int)(600/18)-1);
          }

          switch(grid.camera[i][j]){
            case "B":
              ImageIcon imageIcon = new ImageIcon(Push.PATH+"tiles/r3.png");
              Image w = imageIcon.getImage();
              g.drawImage(w, x, y, (int)(1000/24),(int)(600/18),this);
            break ;
            case "M":
              ImageIcon imageIco = new ImageIcon(Push.PATH+"tiles/p.png");
              Image w1 = imageIco.getImage();
              g.drawImage(w1, x, y, (int)(1000/24),(int)(600/18),this);
            break ;
            case "H":
              ImageIcon imageIc = new ImageIcon(Push.PATH+"tiles/r.png");
              Image w33 = imageIc.getImage();
              g.drawImage(w33, x, y, (int)(1000/24),(int)(600/18),this);
            break ;
            case "p":
              ImageIcon imIc = new ImageIcon(Push.PATH+"items/"+Piece.name);
              Image w333 = imIc.getImage();
              g.drawImage(w333, x+5, y+5, (int)(1000/24)-5,(int)(600/18)-5,this);
            break ;
            case "9":
              ImageIcon imIco = new ImageIcon(Push.PATH+"baddies/"+Goumba.face);
              Image w23 = imIco.getImage();
              g.drawImage(w23, x+5, y+5, (int)(1000/24)-5,(int)(600/18)-5,this);
            break ;
            case "P":
              ImageIcon ic = new ImageIcon(Push.PATH+"items/Question_Block_Dead.png");
              Image ic2 = ic.getImage();
              g.drawImage(ic2, x, y, (int)(1000/24),(int)(600/18),this);
            break ;
            case "Q":
              ImageIcon boxo = new ImageIcon(Push.PATH+"items/"+Boxe.name);
              Image boxo2 = boxo.getImage();
              g.drawImage(boxo2, x, y, (int)(1000/24),(int)(600/18),this);
            break ;
          }
          if (grid.clignote[i][j]==true) {
            g.setColor(new Color(11,23,111));
            g.fillRect(x,y,(int)(1000/24)-1,(int)(600/18)-1);
          }
          x+=(int)(1000/24);
        }
        x=0;
        y+=(int)(600/18);
      }
      x=y=0;
      grid.clignote[clignote[0]][clignote[1]]=false;
  }

}
