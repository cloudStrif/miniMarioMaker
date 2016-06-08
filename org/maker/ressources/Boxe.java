package org.maker.ressources;

import org.maker.ressources.Piece ;
import org.maker.ui.Content ;

import java.util.*;
import java.awt.Toolkit ;

public class Boxe extends Thread {
  public final static String TYPE = "Q";//q IS A BOX SO ..
  public static String name ="Question_Block_0.png";
  Timer timer ;
  Content content ;
  int contenu = 0 ;//by default just a piece
  public boolean active = false ;


  public Boxe(int contenu ,Content content){
    this.content=content ;
    this.contenu=contenu ;
  }

  public void run(){
    this.active=true; 
    while(this.active){
      for(int inc =0 ; inc <4 ;inc++){
        this.name="Question_Block_"+inc+".png" ;
        new Piece().pause(200);
        Toolkit.getDefaultToolkit().sync();
        this.content.repaint() ;
      }
    }
  }

}
