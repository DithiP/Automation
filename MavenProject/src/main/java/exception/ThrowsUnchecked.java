package exception;

public class ThrowsUnchecked 
{
	public static void ex() throws ArithmeticException
	{
		throw new ArithmeticException("Exception");
	}

	public static void main(String[] args) 
	{
		ThrowsUnchecked.ex();

	}

}
