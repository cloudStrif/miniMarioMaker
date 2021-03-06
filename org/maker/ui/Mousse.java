package org.maker.ui ;


import org.maker.ui.Content ;
import org.maker.levels.Grid ;
import org.maker.character.Goumba ;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Mousse{
  static String TYPE= " " ;
  Goumba gou ;
  public Mousse(Content content){

        content.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
              //Try to check a goumba ...
              if(TYPE.equals(Goumba.TYPE+"")){
                System.out.println("Goumba move !");
                gou = new Goumba((int)(content.grid.posXinit+(e.getX()/(1000/24))) , (int)(content.grid.posYinit+(e.getY()/(600/18))) ,content)
                ;
                gou.rune();
              }

              try{
                content.grid.camera[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=TYPE ;
                content.grid.field[(int)(content.grid.posYinit+(e.getY()/(600/18)))][(int)(content.grid.posXinit+(e.getX()/(1000/24)))]=TYPE ;
                content.repaint();
              }catch(Exception ex){
                System.out.println("Out of ring !");
              }
            }
          });

       content.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {
            try{
              content.grid.camera[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=TYPE ;
              content.grid.field[(int)(content.grid.posYinit+(e.getY()/(600/18)))][(int)(content.grid.posXinit+(e.getX()/(1000/24)))]=TYPE ;
              content.repaint();
            }catch(Exception ex){
              System.out.println("Out of ring !");
            }
            }

            public void mouseMoved(MouseEvent e) {
              try{
              content.grid.clignote[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=true;
                //  content.grid.clignote[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=false;
              content.repaint();
              content.clignote[0]= (int)(e.getY()/(600/18));
              content.clignote[1]=(int)(e.getX()/(1000/24));
            }catch(Exception ex){
              System.out.println("Out of ring !");
            }
            }
          });
  }


}
