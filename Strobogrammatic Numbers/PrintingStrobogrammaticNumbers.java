import java.util.*;

public class PrintingStrobogrammaticNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number digit:");
		int n = in.nextInt();
		int cont = 0;

		for (int k = (int) Math.pow(10, n - 1); k < (int) Math.pow(10, n); k++) {
			String st = Integer.toString(k), t = "";					// Converting `k` to String

			Loop: for (int i = st.length() - 1; i >= 0; i--)			// Loop is a label, looping from back to front
				switch (st.charAt(i)) {
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
			if (st.equals(t)) {
				cont++;
				System.out.print(t + " ");
			}
		}
		System.out.println("\nThe total Strobogrammatic Numbers in this range: " + cont);
	}
}
