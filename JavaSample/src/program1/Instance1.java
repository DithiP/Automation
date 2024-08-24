package program1;

public class Instance1 
{
	int sum;
	
	public void sum1(int a,int b)
	{
		sum=a+b;
		System.out.println("Sum= "+sum);
		this.avg();
	}
	public void avg()
	{
		int average = sum/2;
		System.out.println("average= "+average);
	}

	public static void main(String[] args) 
	{
	Instance1 obj=new Instance1();
	  obj.sum1(10,20);

	}

}
