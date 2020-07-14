package assignment1;

import java.util.Scanner;

public class Table2 {
	public void generateTable(int n)
	{
		for(int i=1;i<=12;i++)
			System.out.printf("%d x %-2d = %-2d\n",n,i,n*i);
	}
	Table2(int num)
	{
		this.generateTable(num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer :");
		int n = sc.nextInt();
		new Table2(n);
		sc.close();
	}
}
