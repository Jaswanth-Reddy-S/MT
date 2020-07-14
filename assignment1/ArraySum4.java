package assignment1;

import java.util.Scanner;

public class ArraySum4 {
	private int a[];
	private int l;
	ArraySum4()
	{
		int s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		l = sc.nextInt();
		a= new int[l];
		System.out.println("Enter the elements into array :");
		for(int i=0;i<l;i++) {
			a[i]=sc.nextInt();
			s+=a[i];
		}
		System.out.println("The sum of the array is :"+s);
		sc.close();
	}
	public static void main(String[] args) {
		new ArraySum4();
	}
}
