package assignment1;

import java.util.Scanner;

public class GetMax7{
	//int a,b,c;
		GetMax7(int a,int b,int c)
		{
			if(a>b && a>c)
				System.out.println(a);
			else if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 3 integers :");
			System.out.println("a :");
			int a=sc.nextInt();
			System.out.println("b :");
			int b=sc.nextInt();
			System.out.println("c :");
			int c=sc.nextInt();
			System.out.println("The maximum of 3 is :");
			new GetMax7(a,b,c);
			sc.close();
		}
}
