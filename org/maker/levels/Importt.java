package org.maker.levels ;
public class Importt {


  public void charger(){
  JFileChooser JFC = new JFileChooser();
  int returnVal = JFC.showOpenDialog(null);
  if (returnVal == JFileChooser.APPROVE_OPTION) {
    try {
      String chemin=JFC.getSelectedFile().toString();
      File fw = new File(chemin);
      af(chemin);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

public String af(String ss) {
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

}
