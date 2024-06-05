package polymorphism;

public class Sample2 extends Sample1
{
	public void display()
	{
		super.display();
		System.out.println("world");
	}

	public static void main(String[] args) 
	{
		Sample2 obj = new Sample2();
				obj.display();

	}

}
