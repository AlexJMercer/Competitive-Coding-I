

public class LeadersInArray{
	public static void main(String[] args) {
	int arr[]={16,17,4,3,5,2};
        int n=arr.length,i;
		int max=arr[n-1];

		for(i=0;i<n;i++){
		    int t=arr[n-1-i];
		    max=Math.max(max,t);

		    if(max==t)
		        System.out.print(max+" ");
		}
	}
}
