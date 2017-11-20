package lpackageone;

import java.util.Scanner;

public class primenumber{
//	******** PRIMENUMBER************
	public static void main(String args[]) {
		
		//int n=17;
		System.out.println("enter the the number to check it's prime or not");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
			
			if(n1%2==0){
				System.out.println("numer is not prime");
			}
			else
			{
				System.out.println("number is prime");
			}
		}
		
	}


