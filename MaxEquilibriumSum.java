import java.util.*;

class MaxEquilibriumSum{
	public static void main(String[] args){
		int arr[] = {-1,2,0,5,-2,3},t=0;
		int sum=0,res=-63763,prefix = 0;;
		
		for(int i=0;i<arr.length;i++)
		 sum += arr[i];
		
		for (int i= 0; i<arr.length; i++){
			prefix += arr[i];
			
			if (prefix == sum){
			if(sum>res){
			res=sum;
			t=i;}}
			sum -= arr[i];
		}
		System.out.print(res+" "+t);
	}
}
