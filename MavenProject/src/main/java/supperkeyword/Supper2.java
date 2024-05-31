package supperkeyword;

public class Supper2 extends SupperExample
{
	public Supper2()
	{
		super();
	}
	public void sample2()
	{
		//super();
		super.sample(10, 20);
		System.out.println(super.sum);
	}

	public static void main(String[] args) 
	{
		Supper2 obj = new Supper2();
		obj.sample2();

	}

}
