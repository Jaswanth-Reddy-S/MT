package assignment1;
import java.util.Scanner;
public class ReverseNum8 {
	ReverseNum8(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an interger ");
		int n = sc.nextInt();
		new ReverseNum8(n);
		sc.close();
	}
}
