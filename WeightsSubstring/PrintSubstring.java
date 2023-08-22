import java.util.*;

public class PrintSubstring {
    public static void main(String[] args) {
        String str = "abcaa", temp = "";
        List<String> arr = new ArrayList<>();
        int k = 5;
        int sum = 0, i, j;

        for (i = 0; i < str.length(); i++) {
            sum = 0;
            temp = "";
            for (j = i; j < str.length(); j++) {
                temp = temp + str.charAt(j);
                sum = sum + str.charAt(j) - 'a' + 1;
                if (sum <= k)
                    arr.add(temp);
            }
        }
        System.out.print(arr.size() + " " + arr);
    }
}
