package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment1.IsPrime9;
public class PrimeRange10 {
	public static List<Integer> primeRange(int l,int u)
	{
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=l;i<=u;i++)
			if(IsPrime9.isPrime(i))
				primes.add(i);
		return primes;				
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter lower limit :");
			int l = sc.nextInt();
			System.out.println("Enter upper limit :");
			int u = sc.nextInt();
			System.out.println(primeRange(l,u));
			sc.close();
		}
}

