package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceExample 
{
	

	public static void main(String[] args) 
	{
		List<String> l1= new ArrayList<String>();
		l1.add("Hii");
		l1.add("Dithi");
		for(String s:l1)
		{
			System.out.println(s);
		}
		//Iterator it= l1.iterator();
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

	}

}
