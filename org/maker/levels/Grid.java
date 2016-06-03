package org.maker.levels ;

public class Grid{
    public String [][] field;
    public String [][] camera;
    public boolean [][] clignote ;
    static int s ;
    static int s2 ;

    public int posXinit =0 ;
    public int posYinit =0 ;

    public Grid (int s , int s2){
      this.s=s;
      this.s2=s2;
      field = new String[s][s2];
      camera =new String[18][24];//arbitrary
      clignote=new boolean[18][24];//all in false at the begining
      init(18,24,camera);
      init(s,s2,field);

    }

    public void refresh(){
      System.out.println("========="+posYinit +" "+posXinit);
      for(int i=posYinit;i<posYinit+18;i++){
        for(int j=posXinit;j<posXinit+24;j++){
          camera[i][j]=field[i][j];
          System.out.print(camera[i][j]);
        }
        System.out.println() ;
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
