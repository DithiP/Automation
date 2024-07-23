package exception;

public class ThrowExample 
{
	public static void check(int a, int b)
	{
		int sum = a+b;
		if(sum<50) 
		{
			System.out.println("sum is grater than 50");
			
		}
		else
		{
			throw new ArithmeticException("Sum is less than 50");
		}
	}

	public static void main(String[] args) 
	{
		  try
		  {
			  ThrowExample.check(50,10);
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println(e);
		  }

	}

}
