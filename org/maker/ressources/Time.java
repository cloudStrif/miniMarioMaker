package org.maker.ressources;
/*
*old class useless now
*/

public class Time implements Runnable{

  public void run(){
    try{
      Thread.sleep(1000) ;
    }catch(Exception exp){
      System.out.println("error");
    }
  }
}
