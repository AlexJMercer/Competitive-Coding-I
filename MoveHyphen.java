
class MoveHyphen{
  public static void main(String[] args){

	String str="Hy-ph-en-To-Begin-ning";
	String Estr="",chstr="";
	
	for(int i=0;i<str.length();i++)
	  if(str.charAt(i)=='-')
		Estr+=str.charAt(i);
	  else
		chstr+=str.charAt(i);


	System.out.print(Estr+chstr);
  }
}