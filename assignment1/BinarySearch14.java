package assignment1;

import java.util.Scanner;

public class BinarySearch14 {
	private int [] intArray;
	private int arraySize;
	private String[] stringArray;
	public int binarySearchForValue(String value,String [] theArray){
		
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(theArray[middleIndex].compareTo(value) <0) lowIndex = middleIndex + 1;
			
			else if(theArray[middleIndex].compareTo( value) >0) highIndex = middleIndex - 1;
			
			else {
				
				//System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				
				//lowIndex = highIndex + 1;
				return middleIndex;
			}
						
		}
		return -1;
		
	}
	public int binarySearchForValue(int value,int [] theArray){
		
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			
			else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
			
			else {
				
				//System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				
				//lowIndex = highIndex + 1;
				return middleIndex;
			}
						
		}
		return -1;
		
	}
	private void sortintArray(int [] array) {
		int i,j,temp,num=array.length;
		   for (i = 0; i < num; i++)
		    {
		        for (j = 0; j < (num - i - 1); j++)
		        {
		            if (array[j] > array[j + 1])
		            {
		                temp = array[j];
		                array[j] = array[j + 1];
		                array[j + 1] = temp;
		            }
		        }
		    }
	}
	private void sortStringArray(String [] array) {
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
	private void printintArray() {
		for(int e : intArray)
		{
			System.out.println(e);
		}
	}
	private void printStringArray() {
		for(String e : stringArray)
		{
			System.out.println(e);
		}
	}
	BinarySearch14()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		arraySize=sc.nextInt();
		intArray = new int[arraySize];
		stringArray= new String[arraySize];
		System.out.println("Enter the values for integer array :");
		for(int i=0;i<arraySize;i++)
			intArray[i]=sc.nextInt();
		System.out.println("Enter the values for string array :");
		for(int i=0;i<arraySize;i++)
			stringArray[i]=sc.next();
		sc.close();
	}
	public static void main(String[] args) {
		BinarySearch14 bsObj = new BinarySearch14();
		bsObj.printintArray();
		bsObj.printStringArray();
		bsObj.sortintArray(bsObj.intArray);
		bsObj.sortStringArray(bsObj.stringArray);
		bsObj.printintArray();
		bsObj.printStringArray();
		if(bsObj.binarySearchForValue(7,bsObj.intArray)!=-1)
			System.out.printf("\nThe value 7 found at index %d",bsObj.binarySearchForValue(7,bsObj.intArray));
		else
			System.out.printf("\nThe value 7 not found ");
		if(bsObj.binarySearchForValue("cat",bsObj.stringArray)!=-1)
			System.out.printf("\nThe value 'cat' found at index %d",bsObj.binarySearchForValue("cat",bsObj.stringArray));
		else
			System.out.printf("\nThe value 'cat' not found ");
	}
}
