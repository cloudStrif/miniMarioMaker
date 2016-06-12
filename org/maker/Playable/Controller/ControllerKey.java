package org.maker.Playable.Controller ;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.maker.ui.Window;
import org.maker.ui.Content;

/**
Basic controller of Main character
*/

public class ControllerKey implements KeyListener {
  Window win ;
  Content con ;

  public ControllerKey(Window win , Content con){
    this.win=win;
    this.con=con;
  }

  public ControllerKey(){

  }

  public void keyPressed(KeyEvent arg0) {
    System.out.println("Touch Keyboard");
  }


	public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

	}


	public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

	}
}
