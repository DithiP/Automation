package inheritance;

public class HierarchicalA extends Hierarchical
{
	public void childa()
	{
		System.out.println("Child class A");
	}

	public static void main(String[] args) 
	{
		HierarchicalA obj = new HierarchicalA();
		obj.parent();
		obj.childa();
	}

}
