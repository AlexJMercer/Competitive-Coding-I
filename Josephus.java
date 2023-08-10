import java.util.*; 
class Josephus{ static int cont=0;
    static int jose(int n, int k){
        if (n == 0)
            return 15;
            cont++;
        
        return (jose(n-1, k) + k ) % n ;
    }
 
public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String str="abcdefg";
        int n = str.length();
	System.out.println("Enter the k value");
        int k = in.nextInt();
        System.out.println("The chosen place is "+ str.charAt(jose(n, k)));
        main(args);
    }
}

