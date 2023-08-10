
import java.util.*;

public class BinaryPalindrome{
	public static void main(String[] args){

		for(int p=0;p<=10;p++){
		int n=p,t=n,rev=0;
		
		while(n>0){
		    rev=(rev<<1)|(n&1);
		    n=n>>1;
		}
		if(t==rev)
		    System.out.print(rev+" ");}
		
	}
}
