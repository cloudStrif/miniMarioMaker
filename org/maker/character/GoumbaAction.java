package org.maker.character ;

import org.maker.character.Goumba ;
import org.maker.ressources.Piece ;

import java.util.*;
import java.awt.Toolkit ;


public class GoumbaAction extends TimerTask{
  Goumba gou ;
  int count ;
  int direction ;
  int direct=0 ;
  int direction2 ;//y
  public GoumbaAction(Goumba gou){
      this.gou=gou ;
      direction =gou.pos[0];
      direction2=gou.pos[1];
  }

  public void gravity(){
    while((this.gou.content.grid.field[direction2+1][direction]).equals("N")){
      this.gou.content.grid.field[direction2][direction]="N";
      direction2++ ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
      this.gou.content.grid.refresh() ;
      new Piece().pause(400) ;
    }
  }

  public void run(){
    this.gou.content.grid.refresh() ;
    this.gou.content.grid.field[direction2][direction]="N";
    if(direction % 2 == 0){
      this.gou.face ="Goomba_Normal_1.png";
    }else{
      this.gou.face ="Goomba_Normal_2.png";
    }
    if(this.direct == 0){
    if((this.gou.content.grid.field[direction2][direction-1]).equals("N")){

      if((this.gou.content.grid.field[direction2+1][direction]).equals("N")){
      //  gravity() ;//try to simulate the gravity force
        this.direct = 2 ;
      }else {
       direction -- ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }
    }else{
      this.direct =1 ;
    }
  }
  if(this.direct == 1){
    if((this.gou.content.grid.field[direction2][direction+1]).equals("N") ){

      if((this.gou.content.grid.field[direction2+1][direction]).equals("N")){
        //gravity() ;//try to simulate the gravity force
        this.direct=2;
      }else{   direction ++ ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }
    }else{
      this.direct =0 ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }
  }
  if(this.direct == 2){
    if((this.gou.content.grid.field[direction2+1][direction]).equals("N")){
      direction2++ ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }else{
      this.direct = 0 ;
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }
  }

    if(direction < 1){
      this.gou.content.grid.field[direction2][direction]=gou.TYPE+"";
      this.cancel() ;
    }

  }
}
