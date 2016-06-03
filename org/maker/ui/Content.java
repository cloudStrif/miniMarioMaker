package org.maker.ui ;

import org.maker.levels.Grid ;
import org.maker.ui.Window ;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class Content extends JPanel{

  Grid grid ;
  int x = 0 ;
  int y = 0 ;

  public Content(){

  }

  public Content(Grid grid){
    this.grid=grid;
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
          if (grid.camera[i][j].equals("N")) {
            g.setColor(new Color(111,233,111));
            g.fillRect(x,y,(int)(1000/24)-1,(int)(600/18)-1);
          }
          x+=(int)(1000/24);
        }
        x=0;
        y+=(int)(600/18);
      }
      x=y=0;
  }
}
