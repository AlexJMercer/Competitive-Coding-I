
class Wansdrff{


  static int Xarr[]={ 2, 2, 1,  1, -1, -1, -2, -2 };
  static int Yarr[]={-1, 1, 2, -2,  2, -2,  1, -1 };
  static int arr[][];
  static int n=5, move=1;
 
 static boolean isSafe(int x, int y){
          if(x>=0 && y>=0 && x<n && y<n && arr[x][y]==0)
           return true;
       return false;
     }

 static boolean Solve(int x, int y){
  
  if(move>(n*n))
   return true;
   
  
  if(isSafe(x,y)){
      arr[x][y]=move++;
      
  for(int t=0; t<Xarr.length; t++)
    if(Solve(x+Xarr[t],y+Yarr[t]))
	return true;

    arr[x][y]=0;
    move--;
  }
    
  return false;
 }

  public static void main(String[] args){
   arr= new int[n][n];
   int diag= 3;
   if(Solve(diag,diag))
    for(int k=0;k<n;k++){
     for(int p=0;p<n;p++){
         if(arr[k][p]<10)
          System.out.print(" "+arr[k][p]+" ");
         else
          System.out.print(arr[k][p]+" ");	}	
	System.out.println();}
   else
    System.out.print("No Solution "+move+"\n");
  }
}
