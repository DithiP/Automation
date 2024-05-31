package inheritance;

public class TotalSalary extends Deduction
{
	public void salary()
	{
		int salary = basic+hra-pf-dedu+bon;
				System.out.println(salary);
	}

	public static void main(String[] args) 
	{
		TotalSalary obj = new TotalSalary();
		obj.basic();
		obj.hrapf();
		obj.salary();

	}

}
