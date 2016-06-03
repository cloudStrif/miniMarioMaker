package org.maker.ui ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Push extends JButton {
  private String name ;
  public static String PATH ="org/maker/ressources/";

  public Push(String name){
    super("b");
    this. setPreferredSize (new Dimension(30,30));
    this.name=name ;
  }

  public void paintComponent(Graphics g){
    switch(name){
      case "brique" :
        ImageIcon i1 = new ImageIcon(PATH+"tiles/r3.png");
				Image ii1= i1.getImage();
				g.drawImage(ii1,0,0,30,30,this);
      break ;
      case "delete":
        ImageIcon i11 = new ImageIcon(PATH+"backgrounds/erase.png");
        Image ii11= i11.getImage();
        g.drawImage(ii11,0,0,30,30,this);
      break;
      default: System.out.println("no more push");
    }
  }

}
