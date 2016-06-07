package org.maker.sound ;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/*
old class for sound gestion  (depreciated api..)
*/
public class Soundd extends Thread{
  AudioClip clip ;
  String name ="";
  public final String PATH = "org/maker/sound/";
  boolean bool ;

  public Soundd(String name,boolean bool){
    this.name=name ;
    this.bool=bool;
  }

  public void run(){
    try{
      if(this.bool){
          File f = new File(PATH+name);
          clip = Applet.newAudioClip(f.toURL());
				  clip.loop() ;
      }
    }catch (MalformedURLException e){
      System.out.println(e.getMessage());
    }
  }
}
