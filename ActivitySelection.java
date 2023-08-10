import java.util.*;

class ActivitySelection {

	public static void main(String[] args)	{
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };
		int n = s.length;

		int i, j;

		System.out.println("Following activities are selected");

		j = 0;
		System.out.print(0 + " ");

		for (i = 1; i < n; i++) 
			if (s[i] >= f[j]) {
				System.out.print(i + " ");
				j = i;
			}
	}
}
