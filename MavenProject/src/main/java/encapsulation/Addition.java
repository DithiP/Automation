package encapsulation;

import java.util.Scanner;

public class Addition 
{
	private int a,b,c;
	public void setter()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=obj.nextInt();
		b=obj.nextInt();
	}
	public void getter()
	{
		c=a+b;
		System.out.println("sum = "+c);
	}

}
