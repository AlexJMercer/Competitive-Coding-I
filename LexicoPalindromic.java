
class LexicoPalindromic{
	public static void main(String[] args) {
		String str="abbaacc",first="",rear="",odd="",temp="";
		int freq[]=new int[26],cont=0,i,odd_cont=0,ind=0,j;
		
		for(i=0;i<str.length();i++)
		 freq[str.charAt(i)-'a']= freq[str.charAt(i)-'a']+1;

		 

		 for(i=0;i<26;i++)
		      if(freq[i]%2==1){
		           ind=i;
		           odd_cont=freq[i];
		           cont++;
		      }

		      
		 if(cont<2){
		      freq[ind]=0;
		      for(i=0;i<odd_cont;i++)
		       odd=odd+(char)(ind+'a');
		       
		      for(i=0;i<26;i++)
		       if(freq[i]!=0){
		            temp="";
		            for(j=0;j<freq[i]/2;j++)
		             temp=temp+(char)(i+'a');
		            
		            first=first+temp;
		            rear=temp+rear;
		       }
		       System.out.println(first+odd+rear);
		 }
		  else
		   System.out.println("This String not a palindromic string");
	}
}
