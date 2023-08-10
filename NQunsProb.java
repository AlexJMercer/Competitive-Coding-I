
public class NQunsProb{

     static int arr[][],n;
     static boolean Safe(int row,int col){
      int i,j;
	for (i=col;i>=0;i--)
         if(arr[row][i]==1)
	  return false;

	for (i=col,j=row;i>=0 && j<n;j++,i--)
         if(arr[j][i]==1)
	  return false;

	for (i=col,j=row;i>=0 && j>=0;j--,i--)
         if(arr[j][i]==1)
	  return false;

      return true;

     }
    
    static boolean Solve(int col){
       if(col>=n)
        return true;

	for(int t=0;t<n;t++){
         if(Safe(t,col)){
          arr[t][col]=1;
    
           if(Solve(col+1))
            return true;
        }
       arr[t][col]=0;
       }
     return false;
    }

    
	public static void main(String[] args){

		n=4;
                int i,j;
                arr= new int [n][n];
                if(Solve(0))
                 for(i=0;i<n;i++){
                  for(j=0;j<n;j++)
                   System.out.print(arr[i][j]+" ");
		System.out.println();

                }	


}
}
