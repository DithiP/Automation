package inheritance;

public class ChildC extends ChildB
{
public void sample3()
{
	System.out.println("Child class C");
}
	public static void main(String[] args) 
	{
		ChildC obj= new ChildC();
				obj.sample();
		obj.sample2();
		obj.sample3();

	}

}
