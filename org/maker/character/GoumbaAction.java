package org.maker.character ;

import org.maker.character.Goumba ;


import java.util.*;
import java.awt.Toolkit ;

public class GoumbaAction extends TimerTask{
  Goumba gou ;
  int count ;
  public GoumbaAction(Goumba gou){
      this.gou=gou ;
  }

  public void run(){
    System.out.println("spider");
    this.gou.content.grid.camera[0][0]="P";
    this.gou.content.repaint() ;
  }
}
