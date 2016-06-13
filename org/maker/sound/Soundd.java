package org.maker.sound ;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;
import javax.sound.sampled.*;

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

  private AudioFormat format;
  private byte[] samples;

  public Soundd(){

  }

  public Soundd(String filename){
  try{
    AudioInputStream stream = AudioSystem.getAudioInputStream(new File(filename));
    format = stream.getFormat();
    samples = getSamples(stream);
  }
  catch (UnsupportedAudioFileException e){
    e.printStackTrace();
}
catch (IOException e){
    e.printStackTrace();
  }
}

public byte[] getSamples(){
  return samples;
}

public byte[] getSamples(AudioInputStream stream){
  int length = (int)(stream.getFrameLength() * format.getFrameSize());
  byte[] samples = new byte[length];
  DataInputStream in = new DataInputStream(stream);
  try{
    in.readFully(samples);
  }
  catch (IOException e){
    e.printStackTrace();
  }
  return samples;
}


public void play(InputStream source){
  // 100 ms buffer for real time change to the sound stream
  int bufferSize = format.getFrameSize() * Math.round(format.getSampleRate() / 10);
  byte[] buffer = new byte[bufferSize];
  SourceDataLine line;
  try{
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
    line = (SourceDataLine)AudioSystem.getLine(info);
    line.open(format, bufferSize);
  }
  catch (LineUnavailableException e){
    e.printStackTrace();
    return;
  }
  line.start();
  try{
    int numBytesRead = 0;
    while (numBytesRead != -1){
      numBytesRead = source.read(buffer, 0, buffer.length);
      if (numBytesRead != -1)
        line.write(buffer, 0, numBytesRead);
    }
  }
  catch (IOException e){
    e.printStackTrace();
  }
  line.drain();
  line.close();
}


  public Soundd(String name,boolean bool){
    this.name=name ;
    this.bool=bool;
  }

  public void run(){
    Soundd player = new Soundd("org/maker/sound/theme.wav");
		InputStream stream = new ByteArrayInputStream(player.getSamples());
		player.play(stream);
/*    try{
      if(this.bool){
          File f = new File(PATH+name);
          clip = Applet.newAudioClip(f.toURL());
				  clip.loop() ;
      }
    }catch (MalformedURLException e){
      System.out.println(e.getMessage());
    }*/
  }
}
