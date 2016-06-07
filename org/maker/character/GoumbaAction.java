package org.maker.character ;

import org.maker.character.Goumba ;


import java.util.*;
import java.awt.Toolkit ;


public class GoumbaAction extends TimerTask{
  Goumba gou ;
  int count ;
  int direction ;
  int direct=0 ;
  public GoumbaAction(Goumba gou){
      this.gou=gou ;
      direction =gou.pos[0];
  }

  public void run(){
    this.gou.content.grid.camera[gou.pos[1]][direction]="N";
    if(direction % 2 == 0){
      this.gou.face ="Goomba_Normal_1.png";
    }else{
      this.gou.face ="Goomba_Normal_2.png";
    }
    if((this.gou.content.grid.camera[gou.pos[1]][direction-1]).equals("N") && this.direct ==0){
      direction -- ;
      this.gou.content.grid.camera[gou.pos[1]][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }else{
      this.direct =1 ;
    }
    if((this.gou.content.grid.camera[gou.pos[1]][direction+1]).equals("N") && this.direct ==1){
      direction ++ ;
      this.gou.content.grid.camera[gou.pos[1]][direction]=gou.TYPE+"";
      this.gou.content.repaint() ;
      Toolkit.getDefaultToolkit().sync();
    }else{
      this.direct =0 ;
    }

    if(direction < 1){
      this.gou.content.grid.camera[gou.pos[1]][direction]=gou.TYPE+"";
      this.cancel() ;
    }

  }
}
