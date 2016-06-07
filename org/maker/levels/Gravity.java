package org.maker.levels ;

import org.maker.ressources.Piece ;

public class Gravity extends Thread {
  int intensity ;
  int x ;
  int y ;
  public Gravity(int intensity , int x ,int y){
    this.intensity=intensity ;
    this.x=x;
    this.y=y;
  }

  public void run(){
    //Later...
    //Try to simulate the gravity 
  }
}
