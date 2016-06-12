package org.maker.Playable.Modele;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;




public class Modele extends JPanel {
  /*
  Example JPanel test
  **/
  public void paintComponent(Graphics g){
    g.setColor(new Color(100,120,200));
    g.fillRect(0,0,this.getWidth(),this.getHeight());
  }
}
