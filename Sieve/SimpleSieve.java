import java.util.Scanner;

public class SimpleSieve {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();

      boolean[] bool = new boolean[num+1];
     
      for (int i = 2; i<= Math.sqrt(num); i++) 
         if(bool[i] == false)
            for(int j = 2*i; j<=num; j+=i) 
               bool[j] = true;

      System.out.println("List of prime numbers upto given number are : ");
      for (int i = 2; i< bool.length; i++)
         if(bool[i]==false)
            prime.add(i);
   }
}

20BCD7109