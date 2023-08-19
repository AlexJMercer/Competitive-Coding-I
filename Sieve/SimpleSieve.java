import java.util.Scanner;
import java.util.Vector;

public class SimpleSieve {
	public static void main(String args[]) {

		Vector<Integer> prime = new Vector<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");			// Enter Number `n`
		int num = sc.nextInt();

		boolean[] bool = new boolean[num + 1];			// Array of `n+1` boolean values

		for (int i = 2; i <= Math.sqrt(num); i++)		// Looping through 2 to square root of `n`
			if (bool[i] == false)
				for (int j = 2 * i; j <= num; j += i)	// Looping through multiples of `i`, eliminating all composites
					bool[j] = true;

		/* Say n = 9.
		 *
		 * So, bool = [false, false, false, false, false, false, false, false, false]
		 * 
		 * In for loop, condition: i <= 3
		 * Iteration 1: bool[4] = bool[6] = bool[8] = true
		 * Iteration 2: bool[9] = true
		 */

		System.out.println("List of prime numbers upto given number are : ");
		for (int i = 2; i < bool.length; i++)			// Looping through bool array
			if (bool[i] == false) 
				prime.add(i);

		System.out.println(prime);

	}
}
