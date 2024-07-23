package exception;

public class ExceptionExample1 
{
	public static void licence(int age)throws LicenceException
	{
		if(age<18)
		{
			throw new LicenceException("Not eligible for licence");
		}
		else
		{
			System.out.println("Eligible for licence");
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			ExceptionExample1.licence(15);
		}
		catch(LicenceException e)
		{
			System.out.println(e);
			
		}

	}

}
