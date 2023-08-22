
import java.util.*;

public class SegmentedSieve {

    public static void simpleSieve(int num, Vector<Integer> prime) {

        boolean bool[] = new boolean[num + 1];                  // Array of `n+1` boolean values
        int n;

        n = (num == 2) ? 2 : (int) Math.sqrt(num);

        for (int p = 2; p <= n; p++)                            // Looping through 2 to square root of `n`  
            if (bool[p] == false)
                for (int i = p * p; i <= num; i += p)           // Looping through multiples of `i`, eliminating all composites
                    bool[i] = true;

        for (int p = 2; p <= num; p++)                          // Looping through bool array
            if (bool[p] == false)
                prime.add(p);
    }
    

    public static void main(String args[]) {
        Vector<Integer> prime = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int low = sc.nextInt(), high = sc.nextInt();
        System.out.println("");
        simpleSieve((int) Math.sqrt(high), prime);              // Calling simpleSieve() to generate all primes smaller than or equal to square root of `high`

        int i, j, Ans[] = new int[high - low];                  // Array of size `high-low`

        for (i = 0; i < Ans.length; i++)                        // Initializing array with values from `low` to `high`
            Ans[i] = low + i;                                   // Say low = 2, high = 10, Ans = [2, 3, 4, 5, 6, 7, 8, 9]

        for (i = 0; i < prime.size(); i++)                      // Looping through all primes smaller than or equal to square root of `high`
            for (j = 0; j < Ans.length; j++)
                if (Ans[j] % prime.get(i) == 0 && Ans[j] != prime.get(i))               // Check if `Ans[j]` is a multiple of `prime[i]` and also they aren't the same number
                    Ans[j] = 0;                                 // If yes, then set `Ans[j]` to 0

        for (j = 0; j < Ans.length; j++)
            if (Ans[j] != 0 && Ans[j] != 1)
                System.out.print(Ans[j] + " ");
    }
}
