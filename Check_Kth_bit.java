import java.util.*;

class Check_Kth_bit{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int k=in.nextInt();
		int crt=0,t=0;
		while (a!=0){
			if((a&1)==1) t=1;
			if(k==crt) break;
			 a=a>>1;
			 crt++;
			}
		if(t==0)
		  System.out.println("No");
		else
		  System.out.println("Yes");
	}
}
