package MavenDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	@Test
	public void browser() throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="F:/SeleniumRevisit/SeleniumTraining/Drivers/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://Google.com");
		Thread.sleep(1500);
		WebElement e=driver.findElement(By.xpath("//input[@clas='gLFyf gsfi']"));
		e.sendKeys("Praveen");
		Thread.sleep(1500);
		e.clear();
		System.out.println("Inside Browser Method");
	}
}
