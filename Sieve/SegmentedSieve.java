
import java.util.*;

public class SegmentedSieve{
      
public static void simpleSieve(int num,Vector<Integer> prime){

		boolean bool[] = new boolean[num+1];
		int n;

		n=(num==2)? 2:(int)Math.sqrt(num);
	        
		for (int p=2; p<=n; p++)
			if (bool[p] == false)
				for (int i=p*p; i<=num; i+=p)
					bool[i] = true;
	
		for (int p=2; p<=num; p++)
			if (bool[p] == false)
				prime.add(p);
}


public static void main(String args[]) {
    Vector<Integer> prime = new Vector<>();
	Scanner sc = new Scanner(System.in);
      System.out.println("Enter the range");
      int low = sc.nextInt(),high = sc.nextInt();
      System.out.println("");
      simpleSieve((int)Math.sqrt(high),prime);
  
      int i,j,Ans[]= new int[high-low];
  
    for(i=0;i<Ans.length;i++)
          Ans[i]=low+i;

    for(i=0;i<prime.size();i++)
        for(j=0;j<Ans.length;j++)
            if(Ans[j]%prime.get(i)==0 && Ans[j] != prime.get(i))
                Ans[j]=0;
    
    for(j=0;j<Ans.length;j++)
        if(Ans[j]!=0 && Ans[j] !=1)
        System.out.print(Ans[j]+" ");
    }
}
