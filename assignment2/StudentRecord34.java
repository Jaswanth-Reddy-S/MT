package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRecord34 {
	private String name;
	private int id;
	public StudentRecord34(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		List<StudentRecord34> list = new ArrayList<StudentRecord34>();
		list.add(new StudentRecord34("sujith", 20));
		list.add(new StudentRecord34("sumanth", 12));
		list.add(new StudentRecord34("akbhar", 34));
		list.add(new StudentRecord34("agarkar", 19));
		list.add(new StudentRecord34("sachin", 10));
		list.add(new StudentRecord34("kohli", 18));
		list.add(new StudentRecord34("rohith", 45));
		System.out.println("Sorting based on the names ");
		Collections.sort(list,new Comparator<StudentRecord34>()
				{

					@Override
					public int compare(StudentRecord34 s1, StudentRecord34 s2) {
						
						return s1.name.compareTo(s2.name);
					}
			
				});
		System.out.println(list);
		System.out.println("Sorting based on the id ");
		Collections.sort(list,new Comparator<StudentRecord34>()
				{

					@Override
					public int compare(StudentRecord34 s1, StudentRecord34 s2) {
						
						 if(s1.id>s2.id)
							 return 1;
						 else if(s1.id<s2.id)
							 return -1;
						 else 
							 return 0;
					}
			
				});
		System.out.println(list);
	}

	@Override
	public String toString() {
		return "StudentRecord34 [name=" + name + ", id=" + id + "]";
	}
	
}
