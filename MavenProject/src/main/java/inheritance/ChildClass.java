package inheritance;

public class ChildClass extends ParentClass
{
public void sub()
{
	int c=a-b;
	System.out.println(c);
}
	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.addition();
		obj.sub();

	}

}
