package org.maker.ui ;

import org.maker.levels.Grid ;
import org.maker.ui.Window ;
import org.maker.ui.Push ;

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

  public Content(){}

  public Content(Grid grid){
    this.grid=grid;
    clignote[0]=0 ;
    clignote[1]=0 ;
    new Mousse(this) ;
  }
  /*
  Default printing of the grid
   */
  public void paintComponent(Graphics g){
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
