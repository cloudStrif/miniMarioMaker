package org.maker.ressources ;
import org.maker.ui.Content ;

public class Piece extends Thread{
  public final static String TYPE ="p";
  public static String name ;
  Content content ;
  int value ;
  int count=1 ;
  public boolean active =false;
  
  public Piece(int value,Content content){
    this.value=value;
    name="Coin_"+this.count+".png";
    this.content=content ;

  }


  public void run(){
    this.active=true;
    String c="Coin_";
    while(this.active){
      for(int inc=1;inc<=8;inc++){
        this.name =c+inc+".png";
        this.content.repaint();
        pause(200);
      }
    }
  }

 //First version of pause with a Thread
  public void pause(int time){
    try{
      Thread.sleep(time);
    }catch(Exception exp){
      System.out.println("error");
    }
  }
}
