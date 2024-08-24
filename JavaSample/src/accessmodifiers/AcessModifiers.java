package accessmodifiers;

public class AcessModifiers 
{
	public void pub()
	{
		System.out.println("public methode");
	}
	private void pri()
	{
		System.out.println("Private methode");
	}
	protected void prot()
	{
		System.out.println("Protected methode");
	}
	void def()
	{
		System.out.println("Default methode");
	}

	public static void main(String[] args) 
	{
		AcessModifiers obj=new AcessModifiers();
		obj.pub();
		obj.pri();
		obj.prot();
		obj.def();
	}

}
