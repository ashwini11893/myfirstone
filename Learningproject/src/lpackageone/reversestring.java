package lpackageone;

public class reversestring {
	
	public static void main(String[] args){
		String S1="ASHWINirt";
		String s2="";
		int len=S1.length();
	for(int i=len-1;i>=0;i--)
	{
		String s3=s2+S1.charAt(i);
		System.out.print(s3);
	}}
}



