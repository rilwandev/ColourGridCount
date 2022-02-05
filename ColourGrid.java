public class ColourGrid{

     static int tempMax=0;


     public static void main(String []args){
             String colorBoard[][]={{"Green","Green","Green","Blue"},
                                    {"Red","Green","Red","Blue"},
                                    {"Red","Red","Red","Blue"},
                                    {"Blue","Blue","Red","Green"}
             };
      boolean visited [][]=new boolean[4][4];
      int max=0;
      String maxColor="";
      for(int i=0;i<colorBoard.length;i++){
         for(int j=0;j<colorBoard.length;j++){
            if(!visited[i][j]){
               search(colorBoard,i,j,visited,colorBoard[i][j]);
               if(max<tempMax){
                  max=tempMax;
                  maxColor=colorBoard[i][j];
               }
               tempMax=0;
            }
         }
      }
      System.out.println("Largest Block Color :"+maxColor);
      System.out.println("Block count :"+max);
        
     }
     

     
      static void search(String colorBoard[][],int x,int y,boolean visited[][] ,String currentColor){
             
      visited [x][y]=true;
      tempMax++;
      
      if(x+1 < colorBoard.length && !visited[x+1][y] && colorBoard[x+1][y].equals(currentColor)){
          search(colorBoard,x+1,y,visited,currentColor);
      }
      
       if(x-1 > -1 && !visited[x-1][y] && colorBoard[x-1][y].equals(currentColor)){
          search(colorBoard,x-1,y,visited,currentColor);
      }
      
       if(y+1 < colorBoard[x].length && !visited[x][y+1] && colorBoard[x][y+1].equals(currentColor)){
         search(colorBoard,x,y+1,visited,currentColor);
      }
      
       if(y-1 > -1 && !visited[x][y-1] && colorBoard[x][y-1].equals(currentColor)){
          search(colorBoard,x,y-1,visited,currentColor);
      }
      
   }
     
     
     
}