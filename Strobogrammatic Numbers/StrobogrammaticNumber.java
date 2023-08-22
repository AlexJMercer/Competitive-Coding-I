import java.util.*;

public class StrobogrammaticNumber {
	public static void main(String[] args) {

		/*
		 * A strobogrammatic number is a number that looks the same when rotated 180
		 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
		 */

		Scanner in = new Scanner(System.in);
		System.out.print("Enter number digit:");
		int n = in.nextInt();

		for (int k = (int) Math.pow(10, n - 1); k < (int) Math.pow(10, n); k++) {			// Looping through all numbers from 10^(n-1) to 10^n
			String st = Integer.toString(k), t = "";

			Loop: for (int i = st.length() - 1; i >= 0; i--)  									// Loop is a label, looping from back to front
				switch (st.charAt(i)) {															// Switching through all digits of `st`		
					case '0':
						t = t + '0';
						break;
					case '1':
						t += '1';
						break;
					case '8':
						t += '8';
						break;
					case '6':
						t += '9';
						break;
					case '9':
						t += '6';
						break;
					default:
						break Loop;
				}
			
			if (st.equals(t))
				System.out.print(t + " ");
		}
	}
}
