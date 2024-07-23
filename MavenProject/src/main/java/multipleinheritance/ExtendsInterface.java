package multipleinheritance;

public class ExtendsInterface implements Interface2
{

	public static void main(String[] args) 
	{
		//interfacename objectname = new classname();
		Interface2 obj1 = new ExtendsInterface();
		obj1.sample();
		obj1.sample2();
		ExtendsInterface obj = new ExtendsInterface();
		obj.sample();
		obj.sample2();

	}

	@Override
	public void sample() {
		System.out.println("Hello");
		
	}

	@Override
	public void sample2() 
	{
		System.out.println("World");
		
	}

}
