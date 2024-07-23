package multipleinheritance;

public class InterfaceMain implements Interface1,Interface2
{

	public static void main(String[] args) 
	{
		
		InterfaceMain obj = new InterfaceMain();
		obj.sample();
		obj.sample2();

	}

	@Override
	public void sample2() 
	{
		System.out.println("First method");
		
	}

	@Override
	public void sample() 
	{
		System.out.println("Second methode");
		
	}

}
