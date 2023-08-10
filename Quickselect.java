import java.util.Arrays;				
				
class Quickselect {				
    static int[] array = { 10, 4, 15, 8, 6, 11, 26 };				
	static int[] arr   = array;			
	static int k=3 ;			
	public static int partition(int low, int high){			
		int pivot = arr[high], pivotloc = low;		
		for (int i = low; i <= high; i++) {		
			if (arr[i] < pivot) {	
				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;
			}	
		}		
				
		int temp = arr[high];		
		arr[high] = arr[pivotloc];		
		arr[pivotloc] = temp;		
				
		return pivotloc;		
	}			
				
	public static int kthSmallest(int low, int high){			
		int partition = partition(low, high);		
				
		if (partition == k - 1)		
			return arr[partition];	
				
		else if (partition < k - 1)		
			return kthSmallest(partition + 1, high);	
				
		else		
			return kthSmallest(low, partition - 1);	
	}			
				
	public static void main(String[] args){			
				
		if (k > array.length) 		
			System.out.println("Index out of bound");	
		else 		
			System.out.println("K-th smallest element in array : "+ kthSmallest(0, array.length - 1));	
	}			
}				
				
