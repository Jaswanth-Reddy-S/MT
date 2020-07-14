package assignment1;

import java.util.Scanner;

public class InsertionSort15 {
	private int [] theArray;
	int arraySize;
	public void insertionSort(){
		for (int i = 1; i < arraySize; i++){
			  int j = i;
			  int toInsert = theArray[i];
			  while ((j > 0) && (theArray[j-1] > toInsert)){
				  theArray[j] = theArray[j-1];
				  j--;
			  }
			  theArray[j] = toInsert;
		}
	}
	InsertionSort15(int n)
	{
		theArray = new int[n];
		arraySize=n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array values :");
		for(int i=0;i<n;i++)
		{
			theArray[i]=sc.nextInt();
		}
		sc.close();
	}
	private void printArray() {
		for(int e : theArray)
			System.out.println(e);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int l = sc.nextInt();
		sc.close();
		InsertionSort15 sort = new InsertionSort15(l);
		sort.printArray();
		sort.insertionSort();
		sort.printArray();
	}
}
