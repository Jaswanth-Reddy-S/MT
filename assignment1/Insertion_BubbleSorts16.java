package assignment1;

import java.util.Scanner;

public class Insertion_BubbleSorts16 {
	private void bubbleSortStringArray(String [] array) {
		int i,j,num=array.length;
		String temp;
		   for (i = 0; i < num; i++)
		    {
		        for (j = 0; j < (num - i - 1); j++)
		        {
		            if (array[j].compareTo(array[j + 1])>0)
		            {
		                temp = array[j];
		                array[j] = array[j + 1];
		                array[j + 1] = temp;
		            }
		        }
		    }
	}
	public void insertionSortStringArray(String [] theArray){
		int arraySize = theArray.length;
		for (int i = 1; i < arraySize; i++){
			  int j = i;
			  String toInsert = theArray[i];
			  while ((j > 0) && (theArray[j-1].compareTo(toInsert)>0)){
				  theArray[j] = theArray[j-1];
				  j--;
			  }
			  theArray[j] = toInsert;
		}
	}
	private void printStringArray(String stringArray []) {
		for(String e : stringArray)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int arraySize=sc.nextInt();
		String[] stringArray= new String[arraySize];
		System.out.println("Enter the values for string array :");
		for(int i=0;i<arraySize;i++)
			stringArray[i]=sc.next();
		sc.close();
		Insertion_BubbleSorts16 b = new Insertion_BubbleSorts16();
		b.bubbleSortStringArray(stringArray);
		b.printStringArray(stringArray);
		b.insertionSortStringArray(stringArray);
		b.printStringArray(stringArray);
	}
	
}
