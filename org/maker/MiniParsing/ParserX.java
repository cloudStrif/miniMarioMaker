package org.maker.MiniParsing ;

import org.maker.levels.Importt ;

public class ParserX {
  String title = "" ;
  public String [] tab ;

  public ParserX(String title){
    this.title=title ;
  }
  /**
  * this function is allow to generate sprites behond datas
  */
  public  void tabSprite(){
    String doc=Importt.af(this.title);
    tab =doc.split("\n") ;
    for(int o =0 ; o < tab.length ; o++){
      System.out.println(tab[o]+"  " + o);
    }
  }



  public void analyseXML(String name){
      String doc=Importt.af(name);
      String [] elements = doc.split("<.*?>w+<.*?>") ;
  }

}
