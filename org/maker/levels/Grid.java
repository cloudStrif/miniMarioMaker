package org.maker.levels ;

public class Grid{
    public String [][] field;
    public String [][] camera;
    int s ;
    int s2 ;

    public Grid (int s , int s2){
      this.s=s;
      this.s2=s2;
      field = new String[s][s2];
      camera =new String[18][24];//arbitrary
      init(18,24,camera);
      init(s,s2,field);

    }

    public void init (int v ,int y,String[][] str){
      for(int i=0;i<v;i++){
        for(int j=0;j<y;j++){
          str[i][j]="N";
        }
      }
    }
}
