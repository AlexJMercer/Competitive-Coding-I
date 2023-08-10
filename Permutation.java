public class Permutation{
	static String str;static int cnt=0;
	public static void main(String[] args){
		str = "ABCD";
		int n = str.length();
		permute(0, n-1);
	}

	static void permute(int l, int r){
		if (l == r)
			System.out.print(str+" ");
		else{
			for (int i = l; i <= r; i++){
				str = swap(l,i);
				permute(l+1, r);
				str = swap(l,i);
			}
		}
	}

	public static String swap(int i, int j){
		char temp;

		for(int t=0;t<st.length();t++)
                  charArray[t]=str.charAt(t);

		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return new String(charArray);
	}
}
