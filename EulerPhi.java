
import java.util.*;

class EulerPhi{

public static void main (String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter Number:");
	int n=in.nextInt(),Phi=n;
	

	for (int i = 2; i<=Math.sqrt(n); i++)
		if (n % i == 0){
		    while(n % i == 0)
			n=n/i;
		    Phi = Phi - Phi/i;
		}
	

	if (n > 1)
		Phi = Phi - Phi/n;
	
	System.out.println("phi:" + Phi);
}
}
