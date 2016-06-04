package org.maker.levels ;

public class Grid{
    public String [][] field;
    public String [][] camera;
    public boolean [][] clignote ;
    public static int s ;
    public static int s2 ;

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
      int ii =0;int jj=0;
      for(int i=posYinit;i<posYinit+18;i++){
        for(int j=posXinit;j<posXinit+24;j++){
          camera[ii][jj]=field[i][j];
          System.out.print(camera[ii][jj]);
          if(jj<24-1)
            jj++;

        }
        if(ii<18-1)
          ii++;
        jj=0;
        System.out.println() ;
      }
      ii = jj = 0 ;
      //debug(camera);
    }

    public void init (int v ,int y,String[][] str){
      for(int i=posYinit;i<v;i++){
        for(int j=posXinit;j<y;j++){
          str[i][j]="N";
        }
      }
    }

    public void debug(String[][] tab){
      for(int i=0 ; i<tab.length;i++){
        for(int j=0;j<tab[0].length;j++){
          System.out.print(tab[i][j]);
        }
        System.out.println();
      }
    }

}
