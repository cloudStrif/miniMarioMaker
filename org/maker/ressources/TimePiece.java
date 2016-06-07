package org.maker.ressources;
import java.util.*;
import java.awt.Toolkit ;

/*
*old class useless now
*/

class TimePiece extends TimerTask{
  Piece pic ;
  int count=1;

  public TimePiece(Piece pic){
      this.pic=pic ;
  }
  public TimePiece(){

  }

  public void run(){
      String c="Coin_";
      pic.name =c+count+".png";
      count++;
      if(count >=8)
        count =1 ;
    Toolkit.getDefaultToolkit().sync();
    pic.content.repaint() ;
  }
}
