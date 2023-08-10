
import java.io.*;

class MaxHourGlass{

 static public void main (String[] args){
		int [][]mat = {{122, 2, 3, 0, 0},
			       {0, 0, 0, 0, 0},
                	       {2, 1, 4, 0, 0},
                	       {0, 0, 0, 0, 0},
			       {1, 1, 0, 1, 0}};
	    int R=mat.length, C=mat[0].length,sum;
	    

	int max_sum =0;
	if(R<3 || C<3)
		System.out.print("Not posible");

	else{ 
	for (int i = 0; i < R - 2; i++)
		for (int j = 0; j < C - 2; j++){
			 sum = (mat[i][j] + mat[i][j + 1] +
					mat[i][j + 2]) + (mat[i + 1][j + 1]) +
					(mat[i + 2][j] + mat[i + 2][j + 1] +
					mat[i + 2][j + 2]);
		
			max_sum = Math.max(max_sum, sum);
		}
		System.out.println("Maximum sum of hour glass = "+ max_sum);
       
    }
	}
	
}
