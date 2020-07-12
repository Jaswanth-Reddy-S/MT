package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unique36 {
	public int [] uniqueElements(int a1[],int a2[])
	{
		Integer arr1[] = new Integer[a1.length];
		for(int i=0;i<a1.length;i++)
			arr1[i]=Integer.valueOf(a1[i]);
		Integer arr2[] = new Integer[a2.length];
		for(int i=0;i<a2.length;i++)
			arr2[i]=Integer.valueOf(a2[i]);
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
		Set<Integer> union = new TreeSet<Integer>(list1);
		union.addAll(list2);
		Set<Integer> intersection = new TreeSet<Integer>(list1);
		intersection.retainAll(list2);
		union.removeAll(intersection);
		int unique [] = new int[union.size()];
		int j=0;
		for(Integer e : union)
			unique[j++] = e;
		return unique;
	}
	public static void main(String[] args) {
		Unique36 u = new Unique36();
		int a1[] = {10, 5, 20, 15, 25, 30};
		int a2[] = {50, 12, 5, 30, 15, 70};
		System.out.println(Arrays.toString(u.uniqueElements(a1,a2)));
	}
}
