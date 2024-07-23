package sample;

public class InterfaceMain implements InterfaceExample
{

	public static void main(String[] args) 
	{
		InterfaceExample obj = new InterfaceMain();
		obj.display();

	}

	@Override
	public void display() 
	{
		System.out.println("Hello world");
		
	}

}
