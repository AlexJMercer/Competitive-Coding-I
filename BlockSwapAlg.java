class BlockSwapAlg{
    static int arr[]={1,2,3,4,5,6,7};

    public static void swap( int r, int first, int sec){
        for(int i = 0 ; i < r ; i++){
            int temp = arr[first + i]; 
            arr[first + i] = arr[sec + i]; 
            arr[sec + i] = temp;
        }
    }
    
    public static void main(String[] args){
        int n = arr.length, r = 4, i = r, j = n - r;
        
        if(r!=0 && r!=n){
           
            while (i != j){
                if(i < j){
                    swap( i, r-i, r+j-i);
                    j = j - i;
            }
                else{
                    swap(j, r-i, r);
                    i = i - j;
                }
            }
            swap( i, r-i, r);
        }
        
        System.out.println("Array Elements after rotating : "); 
        for(int k = 0 ; k < n ; k++)
            System.out.print(arr[k] + " ");
    }
}
