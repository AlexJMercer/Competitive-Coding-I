import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
  
public class NaturalSort{
    public static void main(String[] args)  {
    
        List<Integer> values = Arrays.asList(212, 324, 435, 566, 133, 100, 121);
        List<String> l = new LinkedList<>();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
         l.add(in.nextLine());
         
        values.sort(Comparator.naturalOrder());
        l.sort(Comparator.naturalOrder());

        System.out.println(values);
        System.out.println(l);
}
}


