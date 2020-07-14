package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort12 {
   private static int[] bubbleSort(int array[]) {
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
	   return array;
}
   public static void main(String[] args) {
	   int[] arr ;
	   int l;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the length of array :");
	   l = sc.nextInt();
	   arr = new int[l];
	   System.out.println("Enter the elements into array :");
	   for(int i=0;i<l;i++)
		   arr[i] = sc.nextInt();
	   System.out.println(Arrays.toString(bubbleSort(arr)));
	   sc.close();
}
}
