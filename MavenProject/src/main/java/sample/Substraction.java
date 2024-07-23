package sample;

public class Substraction extends Addition
{
	public void sub()
	{
		int s= a/b;
		System.out.println("substraction ="+s);
	}
	public static void main(String[] args) 
	{
		Substraction obj=new Substraction();
		obj.add();
		obj.sub();
				

	}

}
