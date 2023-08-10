
public class ProductSubarray{
	public static void main(String[] args) {
		int arr[]={2,-5,0,-1,4,-3}, mult, max=arr[0],i,j;
		
		for(i=0;i<arr.length;i++){
		    mult=arr[i];
		    max=Math.max(max,mult);
		    for(j=i+1;j<arr.length;j++){
		        mult=mult*arr[j];
		        max=Math.max(max,mult);
		    }
		}
		System.out.println(max);
	}
}
