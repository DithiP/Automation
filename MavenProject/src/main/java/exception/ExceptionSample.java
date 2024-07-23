package exception;

public class ExceptionSample 
{	

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int sum= a+b;
		try
		{
			int arr[] = new int[4];
			arr[7] = 10;
			int c=sum/0;
			
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Divisible not by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("Finally block will always execute");
		}
		System.out.println(sum);  
	}

}
