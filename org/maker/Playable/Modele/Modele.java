package org.maker.Playable.Modele;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;




public class Modele extends JPanel {
  /*
  Example JPanel test
  **/
  public void paintComponent(Graphics g){
    g.setColor(Color.BLUE);
    g.fillRect(0,0,200,200);
  }
}
