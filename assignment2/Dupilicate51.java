package assignment2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Dupilicate51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		Integer[] array = new Integer[size]; 
		System.out.println("Enter the array :");
        for(int i=0;i<size;i++)
        {
        	int n =sc.nextInt();
        	array[i] = Integer.valueOf(n);
        }
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();
           
        for(int i = 0; i < size ; i++)
        {
            if(set.add(array[i]) == false)
            {
                duplicates.add(array[i]);
            }
        }
          
        if(duplicates.size() == 0)
        {
            duplicates.add(-1);
        }
         
        System.out.println(duplicates);
        sc.close(); 
	}
}
