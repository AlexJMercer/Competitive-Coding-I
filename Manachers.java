class Manachers{
  static String str;
  static int count=0;
 public static void main(String args[]){
 String str="cabababababababababababababad";
 int n=str.length(), longlen=0, Center=0,i,j, Right=0;
 int Value[]=new int[2*n+1],L,R,longCent=0,cont=0;
 char arr[]=new char[2*n+1];

for(i=0;i<arr.length;i+=2) 
arr[i]='#';

for(i=1,j=0;i<arr.length;i+=2,j++)
      arr[i]=str.charAt(j);
 
 for(i=0;i<arr.length;i++){
 int mirr=2*Center-i;
 if(Right>i)
  Value[i]= Math.min(Value[mirr],Right-1);
      
      L=i-(Value[i]+1);
      R=i+(Value[i]+1);
      while((L>=0)&&(R<arr.length)&&(arr[L]==arr[R])){cont++;
          L--; R++;
          Value[i]++;
      }
      
      if(i+Value[i]>Right){
           Right=i+Value[i];
           Center=i;
      }
      
      if(Value[i]>longlen){
           longlen=Value[i];
           longCent=i;
      }
 }
 str= new String(arr);
 
 String ans=str.substring(longCent- longlen, longCent+ longlen);
 
 ans=ans.replace("#","");
 System.out.print(ans+" "+n+" "+cont);
 }
}
