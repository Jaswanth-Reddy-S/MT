package assignment1;

import java.util.Scanner;

public class Factorial1 {
	public int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public  Factorial1(int num) {
		System.out.println(this.fact(num));
	}
	public static void main(String[] args) {
		//Factorial f= 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer :");
		int n = sc.nextInt();
		new Factorial1(n);
		sc.close();
	}
}
