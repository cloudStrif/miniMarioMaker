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
  //Current Grid with the goumba under
  Content content ;
  Grid grid ;
  int state = 0 ;
  boolean isrunning = false ;

  public Goumba(int x ,int y,Content content){
    pos[0]=x;
    pos[1]=y;
    this.grid=content.grid ;
    this.content=content ;
  }

  public void rune(){
    this.isrunning=true; //is already running
    timer = new Timer() ;
    GoumbaAction tp = new GoumbaAction(this);
    timer.scheduleAtFixedRate( tp, 200,200);
  }

  public void stopAction(){
    if(isrunning)
      timer.cancel() ;
  }
}
