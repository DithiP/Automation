package supperkeyword;

import java.util.Scanner;

public class ParentAddition 
{
	int sum;
	public void addition()
	{
		int a,b;
		System.out.println("Enter 2 numbers");
		Scanner obj= new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		sum = a+b;
		System.out.println("Addition of 2 number = "+sum);
	}

}
