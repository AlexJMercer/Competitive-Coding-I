
import java.util.*;

public class MajorityElement{
	public static void main(String[] args){
		int arr[]={1,2,1,3,1,1,2,1},cnt=0,i,intex=0,max=0;
		
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(i=0;i<arr.length;i++)
		 map.put(arr[i],0);
		
		for(i=0;i<arr.length;i++){
		     cnt=map.get(arr[i])+1;
		     map.put(arr[i],cnt);
		     max=Math.max(max,cnt);
		     if(max==cnt)
		      intex=i;
		}

		if(max>arr.length/2)
		 System.out.println("Majority Element: "+arr[intex]+" "+map.get(arr[intex]));
	    else
	     System.out.println("No Majority Element");
	}
}
