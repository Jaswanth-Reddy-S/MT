package assignment1;
import java.util.Scanner;
public class Area11 {
	Scanner sc = new Scanner(System.in);
	Area11(String type)
	{
		switch (type) {
		case "Triangle": {
			System.out.println("Enter s :");
			double s= sc.nextDouble();
			System.out.println("Enter h :");
			double h= sc.nextDouble();
			System.out.println(.5*s*h);
			break;
		}
		case "Square":
		{
			System.out.println("Enter length of s :");
			double s= sc.nextDouble();
			System.out.println(s*s);
			break;
		}
		case "Rectangle":
		{
			System.out.println("Enter w :");
			double w= sc.nextDouble();
			System.out.println("Enter h :");
			double h= sc.nextDouble();
			System.out.println(w*h);
			break;	
		}
		case "Circle" :
		{
			System.out.println("Enter r :");
			double r= sc.nextDouble();
			System.out.println(3.14*r*r);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		//catch(Exception e) {}
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the figure name 'Triangle/Square/Rectangle/Circle'");
		String fig = sc.next();
		new Area11(fig);
		sc.close();
	}
}