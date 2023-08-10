
public class MaxProductSubarray{
 public static void main(String []args){
    int arr[]={-1,5,0,4,3,-2};//{2,-5,0,-1,4,-3};
    int left = 1, right = 1, result = arr[0];

    for (int i = 0; i < arr.length; i++){
      left = (left == 0)? arr [i] : left * arr [i];
      right = (right == 0)? arr[arr.length-1-i] :right * arr[arr.length-1-i];
      int max = Math.max (left, right);
      result = Math.max (result, max);
      }

      System.out.print(result);
  }
}