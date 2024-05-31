package inheritance;

public class HierarchicalB extends Hierarchical
{
	public void childb()
	{
		System.out.println("Child class B");
	}

	public static void main(String[] args) 
	{
		HierarchicalB obj1=new HierarchicalB();
		obj1.parent();
		obj1.childb();

	}

}
