package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void a1()
	{
		System.out.println("pass");
	}
	@Test
	public void a2()
	{
		System.out.println("fail");
		Assert.fail();
	}
}
