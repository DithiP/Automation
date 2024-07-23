package Interface;

public class Interface2 implements InterfaceExample1
{

	public static void main(String[] args) 
	{
		Interface2 obj = new Interface2();
		obj.sample();

	}

	@Override
	public void sample() 
	{
		System.out.println(a+b);
	}

}
