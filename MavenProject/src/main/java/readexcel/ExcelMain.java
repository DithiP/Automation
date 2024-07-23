package readexcel;

import java.io.IOException;

public class ExcelMain 
{

	public static void main(String[] args) throws IOException
	{
		String s = ExcelRead.readStringdata(1,0);
		System.out.println(s);
		String s1 = ExcelRead.readIntigerData(1,1);
		System.out.println(s1);

	}

}
