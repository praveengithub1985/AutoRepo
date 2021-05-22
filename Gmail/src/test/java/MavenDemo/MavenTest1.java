package MavenDemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest1 
{
	@Test 
	public void testPrint1()
	{
		System.out.println("testPrint1 Karthick Praveen");	
	}
	@Test 
	public void testPrint2()
	{
		System.out.println("testPrint2");	
	}
	@Test 
	public void testPrint3()
	{
		System.out.println("testPrint3");	
	}
	@Test 
	public void testPrint4()
	{
		System.out.println("testPrint4");	
	}
	@Test 
	public void testPrint5()
	{
		System.out.println("testPrint5");	
		//Assert.fail();
	}
}
