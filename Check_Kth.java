import java.util.*;

class Check_Kth{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int k=in.nextInt();
		String t=(((1<<k)& a)==0)? "No": "Yes";
		System.out.println(t);
	}
}