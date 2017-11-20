package lpackageone;

import java.util.Scanner;
//************* REVERSE NUMBER**********
public class reversenumber {
	public static void main(String args[]) {
		System.out.println("enter the number to reverse");
		Scanner sc= new Scanner(System.in);
				int n= sc.nextInt();
		int reverse=0; 
		while(n!=0){
			
			reverse=reverse*10;
			reverse=reverse+(n%10);
			n=n/10;
//			System.out.println(reverse);
		}
		System.out.println(reverse);
		}
		
	}
	


