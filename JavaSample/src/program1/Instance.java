package program1;

public class Instance 
{
	int sum=0;
	public Instance()
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			sum=sum+a[i];	
			//System.out.println("Sum= "+sum);
			}
		}
		System.out.println("Sum= "+sum);
	}
	public int avg()
	{
		int average= sum/2;
		return average;
	}

	public static void main(String[] args) 
	{
		Instance obj=new Instance();
		int c=obj.avg();
		System.out.println(c);
	}

}
