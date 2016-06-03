package org.maker.levels ;

public class Grid{
    public String [][] field;
    public String [][] camera;
    int s ;
    int s2 ;

    int posXinit =0 ;
    int posYinit =0 ;

    public Grid (int s , int s2){
      this.s=s;
      this.s2=s2;
      field = new String[s][s2];
      camera =new String[18][24];//arbitrary
      init(18,24,camera);
      init(s,s2,field);

    }

    public void refresh(){
      for(int i=posYinit;i<posYinit+18;i++){
        for(int j=posXinit;j<posXinit+24;j++){
          camera[i][j]=field[i][j];
        }
      }
    }

    public void init (int v ,int y,String[][] str){
      for(int i=posYinit;i<v;i++){
        for(int j=posXinit;j<y;j++){
          str[i][j]="N";
        }
      }
    }

}
