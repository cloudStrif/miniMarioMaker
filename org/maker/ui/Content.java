package org.maker.ui ;

import org.maker.levels.Grid ;
import org.maker.ui.Window ;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class Content extends JPanel{

  static Grid grid ;


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
      for(int i=0;i<18;i++){
        for(int j=0;j<24;j++){
          if (grid.clignote[i][j]==false) {
            g.setColor(new Color(111,233,111));
            g.fillRect(x,y,(int)(1000/24)-1,(int)(600/18)-1);
          }else{
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
