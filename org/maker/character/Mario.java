package org.maker.character ;

import org.maker.MiniParsing.ParserX;

public class Mario {
  public final static int value = 4 ;
  /**
  positions re-calculate
  */
  int posX ;
  int posY ;

  public void mario(int life , int sens){
    // Later gestion  mario
  }

  public  Mario(int x , int y){
      posX=x;
      posY=y;
      ParserX parse = new ParserX("org/maker/MiniParsing/mario.data");
      parse.tabSprite() ;//stock datas
  }

}
