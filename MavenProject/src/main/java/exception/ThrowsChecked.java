package exception;

import java.io.IOException;

public class ThrowsChecked 
{
	
	public static void ex() throws IOException, ArithmeticException
	{
		int a=10;
		int b=20;
		int sum=a+b;
		//throw new IOException("IOException");
		throw new ArithmeticException("ArithmeticException");
	}

	public static void main(String[] args) 
	{
		
		try 
		{
			ThrowsChecked.ex();
		} 
		catch (ArithmeticException e) 
		{
		
			System.out.println(e);;
		} 
		catch (IOException e) 
		{
			
			System.out.println(e);;
		}

	}
}
