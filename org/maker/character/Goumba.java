package org.maker.character ;
import org.maker.ressources.Piece ;
import org.maker.character.GoumbaAction ;
import org.maker.levels.Grid ;
import org.maker.ui.Content ; 

import java.util.*;

public class Goumba{
  String death = "Goomba_Dead.png";
  public static  String face ="Goomba_Normal_1.png";
  public static final int TYPE = 9 ;
  //current position of the goumba
  int [] pos = new int[2];
  Timer timer ;
  Grid grid ;


  public Goumba(int x ,int y,Grid grid){
    pos[0]=x;
    pos[1]=y;
    this.grid=grid ;
  }

  public void rune(){
    timer = new Timer() ;
    GoumbaAction tp = new GoumbaAction(this);
    timer.scheduleAtFixedRate( tp, 400,400);
  }
}
