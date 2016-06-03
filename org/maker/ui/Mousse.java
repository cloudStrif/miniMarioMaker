package org.maker.ui ;


import org.maker.ui.Content ;
import org.maker.levels.Grid ;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Mousse{

  public Mousse(Content content){
        content.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
              System.out.println("mlmlml"+e.getX() );

                content.repaint();
            }
          });

       content.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {

            }

            public void mouseMoved(MouseEvent e) {
              content.grid.clignote[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=true;
                //  content.grid.clignote[(int)(e.getY()/(600/18))][(int)(e.getX()/(1000/24))]=false;
              content.repaint();
              content.clignote[0]= (int)(e.getY()/(600/18));
              content.clignote[1]=(int)(e.getX()/(1000/24));

            }
          });
  }

}