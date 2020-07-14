package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition5 {
	Scanner sc = new Scanner(System.in);
	private double arr1[];
	private double arr2[];
	private int len1;
	private int len2;
	public void readArray()
	{
		System.out.println("Enter the length of array1 :");
		this.len1 = sc.nextInt();
		this.arr1 = new double[len1];
		System.out.println("Enter the elements into array1 :");
		for(int i=0;i<len1;i++)
			this.arr1[i]=sc.nextDouble();
		System.out.println("Enter the length of array2 :");
		this.len2 = sc.nextInt();
		this.arr2 = new double[len2];
		System.out.println("Enter the elements into array2 :");
		for(int i=0;i<len2;i++)
			this.arr2[i]=sc.nextDouble();
	}
	public double[] addArray()
	{
		if(len1>len2)
		{
			for(int i=0;i<len2;i++)
				this.arr1[i]+=this.arr2[i];
			return this.arr1;
		}
		else
		{
			for(int i=0;i<len1;i++)
				this.arr2[i]+=this.arr1[i];
			return this.arr2;
		}
	}
	public static void main(String[] args) {
		ArrayAddition5 theArray = new ArrayAddition5();
		theArray.readArray();
		System.out.println("The addition result :");
		System.out.println(Arrays.toString(theArray.addArray()));
	}
}
