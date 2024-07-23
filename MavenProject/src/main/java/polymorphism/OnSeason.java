package polymorphism;

public class OnSeason extends OffSeason
{
	
	public void discount(int total)
	{
		super.discount(3000);
		int dis= (40*total)/100;
		System.out.println(dis);
	}
	public static void main(String[] args) 
	{
		OnSeason obj = new OnSeason();
		obj.discount(4000);
	}

}
