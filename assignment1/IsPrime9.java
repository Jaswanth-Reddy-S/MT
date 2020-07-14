package assignment1;

import java.util.Scanner;

public class IsPrime9{
	public static boolean isPrime(int n)
	{
		if(n==1) return false;
		for(int i=2;i<n;i++)
			if(n%i==0) return false;
		return true;
	}
	IsPrime9(int n)
	{
		System.out.println(isPrime(n));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger ");
		int n = sc.nextInt();
		new IsPrime9(n);
		sc.close();
	}
}