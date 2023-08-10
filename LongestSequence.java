import java.util.*;

class LongestSequence{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		System.out.println("Before flip: 			"+Integer.toBinaryString(a));
		int crt=0,prev=0,maxL=0;
		while (a!=0){
			if ((a&1)==1)
				crt++;

			else{
				prev= ((a&2)==2) ? crt : 0 ;
				crt=0;
			}
			maxL=Math.max(prev+ crt,maxL);
        	a=a>>1;
		}
		System.out.println("Longest Sequence after one flip: "+(maxL+1));
	}
}
