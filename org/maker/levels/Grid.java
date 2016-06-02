package org.maker.levels ;

public class Grid{
    String [][] field;
    String [][] camera;
    int s ;
    int s2 ;

    public Grid (int s , int s2){
      this.s=s;
      this.s2=s2;
      field = new String[s][s2];
      camera =new String[8][14];//arbitrary
    }

    public void init (){
      for(int i=0;i<8;i++){
        for(int j=0;j<14;j++){
          camera[i][j]="N";
        }
      }
    }
}
