
public class karatsubaAlgorithm{

    public static long mult(long x, long y){
        if(x<10 && y<10)
         return x*y;

	int lx=dig(x),ly=dig(y);
        int l=Math.max(lx,ly);
        
        long tenPow=(long)Math.pow(10,l);
        
        long a,b,c,d;

        a=x/tenPow;
        b=x%tenPow;
        c=y/tenPow;
        d=y%tenPow;
        
        long s1,s2,s3,s4,ans;

        s1=mult(a,c);
        s2=mult(b,d);
        s3=mult((a+b),(c+d));
        s4=s3-s2-s1;
        ans=s1*(long)Math.pow(10,mult(l,2))+s2+s4*(long)Math.pow(10,l);

        return ans;        
    }
    
    public static int dig(long n){
        int cont=0;
        while(n!=0){
            cont++;
            n/=10;
        }
        return (int)Math.ceil(cont/2);
    }

	public static void main(String[] args){
		long x=3456, y=123;
		
		long ans=mult(x,y);

		if((x*y)==ans)
		 System.out.println(ans);
	}
}
