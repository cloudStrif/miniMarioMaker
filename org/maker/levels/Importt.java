package org.maker.levels ;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.maker.levels.Grid ;
import org.maker.ui.Content ;
import org.maker.ressources.Piece ;

public class Importt {
  public Importt(){
  //  charger();
  }

  public static Grid charger(Grid g){
  JFileChooser JFC = new JFileChooser();
  int returnVal = JFC.showOpenDialog(null);
  if (returnVal == JFileChooser.APPROVE_OPTION) {
    try {
      String chemin=JFC.getSelectedFile().toString();
      File fw = new File(chemin);
      String recup=af(chemin);
      int inc =0 ;

      for(int i=0 ;i<Grid.s;i++){
        for(int j=0; j<Grid.s2+1;j++){
          if(recup.charAt(inc) != '\n'){
            g.field[i][j]=recup.charAt(inc)+"";

            System.out.print(g.field[i][j]);
          }
          inc++;
        }
        System.out.println();
      }
      g.posXinit++;
      g.refresh() ;
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
    return g ;
}

public static String af(String ss) {
		String chaine = "";
		String fichier = ss;
		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				// System.out.println(ligne);
				chaine += ligne + "\n";
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return "";
		}
		System.out.println(chaine);
		return chaine;
	}

  public static void record(Grid g,String name){
    String recording ="";
    for (int i=0;i<g.s;i++){
      for(int j=0;j<g.s2;j++){
        recording+=g.field[i][j];
      }
      recording+="\n";
    }
    write(name,recording);
  }

  public static void write(String nomFic, String texte) {
  		// on va chercher le chemin et le nom du fichier et on me tout ca dans
  		// un String
  		String adressedufichier = System.getProperty("user.dir") + "/" + nomFic;

  		// on met try si jamais il y a une exception
  		try {
  			FileWriter fw = new FileWriter(adressedufichier, true);
  			BufferedWriter output = new BufferedWriter(fw);
  			output.write(texte);
  			output.flush();

  			System.out.println("fichier cr");
  		} catch (IOException ioe) {
  			System.out.print("Erreur : ");
  			ioe.printStackTrace();
  		}

  	}

  public static void main(String[]args){
      new Importt() ;
  }
}
