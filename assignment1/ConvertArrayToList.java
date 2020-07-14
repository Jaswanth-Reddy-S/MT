package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConvertArrayToList {
	public static void main(String[] args) {
		List<Integer> innerList1 = new ArrayList<Integer>();
		List<Integer> innerList2 = new ArrayList<Integer>();
        innerList1.add(10);
        innerList1.add(20);
        innerList1.add(30);
        
        innerList2.add(40);
        innerList2.add(50);
        innerList2.add(60);
        
        //System.out.println(innerList1);
        List<ArrayList<Integer>> outerList = new  ArrayList<ArrayList<Integer>>();
        outerList.add((ArrayList<Integer>) innerList2);
        outerList.add((ArrayList<Integer>) innerList1);
        System.out.println(outerList);
        System.out.println(outerList.size());
        System.out.println(outerList.get(0).size());
        Integer [][] outerArray = new Integer[outerList.size()][];//outerList.get(0).size()];
       // Integer[] innerArray = new Integer[outerList.get(0).size()];
        for(int i=0;i<outerList.size();i++)
        	outerArray[i] = new Integer[outerList.get(0).size()];
        for(int i=0;i<outerList.size();i++)
        	for(int j=0;j<outerList.get(0).size();j++)
        	{
        		outerArray[i][j] = outerList.get(i).get(j);
        	}
        for(int i=0;i<outerList.size();i++)
        	System.out.println(Arrays.toString(outerArray[i]));
        Comparator<Integer[]> intComp = new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				
				return o1[0].compareTo(o2[0]);
			}
        	
        };
        Arrays.sort(outerArray, intComp);
        for(int i=0;i<outerList.size();i++)
        	System.out.println(Arrays.toString(outerArray[i]));
	}
}
