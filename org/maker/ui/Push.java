package org.maker.ui ;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Push extends JButton {
  private String name ;

  public Push(String name){
    super("b");
    this.name=name ;
  }

  public void paintComponent(Graphics g){
    switch(name){
      case "brique" :
        ImageIcon i1 = new ImageIcon("org/maker/ressources/tiles/r3.png");
				Image ii1= i1.getImage();
				g.drawImage(ii1,0,0,40,30,this);
         System.out.println("default case ...");
      break ;

    }
  }

}
