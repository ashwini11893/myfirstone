package lpackageone;

public class reversemain {
	public static int reversenum(int n)// static method
	{
		
	 int reverse=0;
	 while(n!=0)
	 {
		 reverse=reverse*10;
			reverse=reverse+(n%10);
			n=n/10;
	
	} 
	 return reverse;
			}
	 
	public static void main(String[] args) {
//		reversemain nr = new reversemain();//for non static method create object
		
	System.out.println("The reverse of the given number is " +reversemain.reversenum(3456344));// for static method call directly
		
	}

}
