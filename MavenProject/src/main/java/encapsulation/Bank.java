package encapsulation;

import java.util.Scanner;

public class Bank 
{
	private int pin;
	public void setter()
	
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter pin number");
		pin=obj.nextInt();
	}
    
    public void getter()
   {
    	if(pin==1001)
    	{
    		System.out.println("Valid pin number");
    	}
    	else if(pin==1234)
    	{
    		System.out.println("Valid pin number");
    	}
    	else if(pin==1212)
    	{
    		System.out.println("Valid pin number");
    	}
    	else
    	{
    		System.out.println("Invalid pin nimber");
    	}
    }
}
