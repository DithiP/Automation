package aggregation;

public class StudentAddress 
{
	StudentDetails reference;
	String add;
	public StudentAddress(String add, StudentDetails reference)
	{
		this.add=add;
		this.reference=reference;
	}
	public void display()
	{
		System.out.println(add);
		System.out.println(reference.name+"   "+reference.id);
	}

	public static void main(String[] args) 
	{
		StudentDetails obj=new StudentDetails("Dithi",123);
		StudentAddress	obj1=new StudentAddress("Pacha house,kannur",obj);
		obj1.display();

	}

}
