package supperkeyword;

public class ChildDivision extends ParentAddition
{
	public void division()
	{
		super.addition();
		//System.out.println(super.sum);
		if(sum%10==0)
		{
		System.out.println("It is divisible by 10");	
		}
		else
		{
			System.out.println("It is not divisible by 10");
		}
	}

	public static void main(String[] args) 
	{
		ChildDivision obj1 = new ChildDivision();
		obj1.division();

	}

}
