package org.maker.character ;
import org.maker.ressources.Piece ;

public class Goumba extends Thread {
  String death = "Goomba_Dead.png";
  public static  String face ="Goomba_Normal_1.png";
  public static final int TYPE = 9 ;
  int [] pos = new int[2];

  public Goumba(int x ,int y){
    pos[0]=x;
    pos[1]=y;
  }

  public void run(){
    while(true){
      new Piece().pause(400) ;
    }
  }
}
