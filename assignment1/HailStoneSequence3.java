package assignment1;

import java.util.Scanner;

public class HailStoneSequence3 {
	public int f(int n)
	{
		if(n%2==0)
		{
			System.out.printf("%d is even so i take half :%d\n",n,n/2);
			return n/2;
		}
		else 
		{
			System.out.printf("%d is odd so i make 3n+1 :%d\n",n,3*n+1);
			return 3*n+1;
		}
	}
	public HailStoneSequence3(int num) {
		int c=0;
		while(num!=1)
		{
			num=this.f(num);
			c++;
		}
		System.out.printf("There are totally %d steps to reach 1",c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer :");
		int n = sc.nextInt();
		new HailStoneSequence3(n);
		sc.close();
	}
}
