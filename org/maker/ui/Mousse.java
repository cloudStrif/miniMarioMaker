package org.maker.ui ;


import org.maker.ui.Content ;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Mousse{

  public Mousse(Content content){
        content.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
              System.out.println("mlmlml");
            }
          });

       content.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {

            }

            public void mouseMoved(MouseEvent e) {}
          });
  }

}
