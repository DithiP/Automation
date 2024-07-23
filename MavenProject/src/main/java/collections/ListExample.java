package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) 
	{
		List<String> list =new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("orange12");
		System.out.println(list);
		
		
		ArrayList list1 = new ArrayList();
		list1.add("apple");
		list1.add(10);
		list1.add('a');
		
		ArrayList<String> l1= new ArrayList<String>();
		l1.add("grape");
		l1.add("dithi");
		l1.add("hii");
		System.out.println(l1);
		
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains("grape"));
		
	ArrayList <Integer> l2 = new ArrayList<Integer>();
	l2.add(10);
	l2.add(123);
	l2.add(123);
	//l2.add(null);
	//l2.add(null);
	System.out.println("for loop");
	for(int i=0;i<l2.size();i++)
	{
		System.out.println(l2.get(i));
	}
	System.out.println("For each loop");

	for(int i:l2)
	{
		System.out.println(i);
	}
	list1.addAll(l2);
	System.out.println(list1);
	list1.removeAll(l2);
	System.out.println(list1);
	//list1.remove("apple");
	
	list1.remove(1);
	System.out.println(list1);
	
	}

	
}
