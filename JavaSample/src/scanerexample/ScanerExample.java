package scanerexample;

import java.util.Scanner;

public class ScanerExample {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=obj.nextLine();
	System.out.println(s);
		System.out.println("Enter an intiger value");
	int a=obj.nextInt();
System.out.println(a);
	System.out.println("Enter a charactor");
	char ch=obj.next().charAt(2);
	System.out.println(ch);
	

	}

}
