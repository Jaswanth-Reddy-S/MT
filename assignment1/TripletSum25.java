package assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
class SortAscendingOrder implements Comparable <List<List<Integer>>>
{

	@Override
	public int compareTo(List<List<Integer>> o) {
		return this.compareTo(o);
	}
	
}
public class TripletSum25{
public List<List<Integer>> threeSum(int[] arr) {
    //System.out.println(num);
	Integer[] num = Arrays.stream(arr) // IntStream
			.boxed()				// Stream<Integer>
			.toArray(Integer[]::new);
	Arrays.sort(num, Collections.reverseOrder());
   // System.out.println(Arrays.toString(num));
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = num[i];
           // System.out.println(sum+" "+num[lo]+" "+num[hi]);
            while (lo < hi) {
                //System.out.println(sum+" "+num[lo]+" "+num[hi]);
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[hi], num[lo],num[i]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] > sum) lo++;
                else hi--;
           }
        }
    }
    
    return res;
    }
    public static void main(String args[])
    {
        TripletSum25 findTriplet = new TripletSum25();
        int arr[],l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        l=sc.nextInt();
        arr =new int[l];
        System.out.println("Enter elements into the array :");
        for(int i=0;i<l;i++)
        	arr[i] = sc.nextInt();
        sc.close();
        List<List<Integer>> outerList =findTriplet.threeSum(arr);
        //System.out.println(outerList);
        Integer [][] outerArray = new Integer[outerList.size()][];//outerList.get(0).size()];
        // Integer[] innerArray = new Integer[outerList.get(0).size()];
         for(int i=0;i<outerList.size();i++)
         	outerArray[i] = new Integer[outerList.get(0).size()];
         for(int i=0;i<outerList.size();i++)
         	for(int j=0;j<outerList.get(0).size();j++)
         	{
         		outerArray[i][j] = outerList.get(i).get(j);
         	}
         /*for(int i=0;i<outerList.size();i++)
         	System.out.println(Arrays.toString(outerArray[i]));*/
         Comparator<Integer[]> intComp = new Comparator<Integer[]>() {

 			@Override
 			public int compare(Integer[] o1, Integer[] o2) {
 				int i=0;
 				while(o1[i].compareTo(o2[i])==0 && i<o1.length) {i++;}
 				return o1[i].compareTo(o2[i]);
 			} 			 			
         };
         Arrays.sort(outerArray, intComp);
         for(int i=0;i<outerList.size();i++)
         	System.out.println(Arrays.toString(outerArray[i]));
    }
}
